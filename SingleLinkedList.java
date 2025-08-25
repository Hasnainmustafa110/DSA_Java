public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;
    public SingleLinkedList(){
        this.size = 0;
    }

   public void deleteatParticular(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if (index == size){
            deleteLast();
            return;
        }

        Node prevNode = getNode(index-1);
        prevNode.next= prevNode.next.next;


        size--;

   }


public int sum(){
        int sum = 0;
        Node node = head;
        while(node != null){
            sum+=node.value;
            node = node.next;
    }
        return sum;
}

public void reverse(){
        Node prev = null;
        Node current = head;
        Node next;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

}

public void sorting(){
        int c = countElements();

    for (int i = 0; i < c; i++) {
        Node temp = head;
        Node temp1 = temp.next;
        for (int j = 0; j<c-i-1; j++){
            if(temp.value>temp1.value){
                int d = temp.value;
                temp.value = temp1.value;
                temp1.value = d;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
    }
}

public Node merge2Lists(Node head1,Node head2){
        if(head1 == null || head2 == null){
            return head1 == null ? head2 : head1;
        }

        if(head1.value <= head2.value){ // Case 1
            head1.next = merge2Lists(head1.next,head2);
            return  head1;
        }else{
            head2.next = merge2Lists(head1,head2.next);
            return  head2;
        }
}
public Node swapInPairs(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node first = head;
        Node sec = head.next;
        Node prev = null;

        while(first != null && sec !=null) {
            Node third = sec.next;
            sec.next = first;
            first.next = third;
            if(prev != null){
                prev.next = sec;
            }else{
                head = sec;
            }
            prev = first;
            first = third;
            if(third != null){
                sec = third.next;
            }
            else{
                sec = null;
            }
    }
        return head;
}


public Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
}


    public int countElements(){
        int count = 0;
        Node node = head;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }
    public int search(int target){
        Node node = head;
        int index = 0;
        while (node!=null){
            if(node.value == target){
                return index;

            }
            node = node.next;
            index++;
        }
        return -1;
    }




    // INSERTION OF A NODE AT FIRST
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    // INSERT AT PATTICULAR INDEX
    public void insertAtParticularIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
        }
        if (index == size){
            insertLast(val);
        }

        Node newNode = new Node(val);
        Node prevNode = getNode(index - 1);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;
    }
    // DELETE THE FIRST INDEX
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    //DELETE THE LAST INDEX
    public  int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = getNode(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    //INSERT ELEMENT AT LAST
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //GET NODE
    public Node getNode(int index){
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }
    //Display the LL
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


     public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{value=" + value + "}";
        }
    }







}

