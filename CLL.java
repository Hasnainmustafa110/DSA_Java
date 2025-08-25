class CLL {
    Node head;
    Node tail;
    int size;
    public CLL(){
        this.size = 0;
    }


    public void insertAtHead(int val){
        Node newNode = new Node(val);
        if(head == null){
            tail = newNode;
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = head;

        }
    }
    public void insertAtTail(int val){
        Node newNode = new Node(val);
        if(tail == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;

        }
    }

    public void deleteAthead(){
        if (head==null){
            return;
        }else if(head == tail) {
            head = null;
            tail = null;
            size--;
        }else {
            Node temp = head;
            head = head.next;
            tail.next = head;
            temp.next = null;
            size--;
        }
    }
    public void deleteAtTail(){
        if(head == null){
            return;
        } else if (head == tail) {
            head = null;
            size--;
        }else {
            Node temp = tail;
            Node prev = head;
            while (prev.next!=temp){
                prev = prev.next;

            }
            tail = prev;
            tail.next = head;
            temp.next = null;
            size--;
        }
    }
    void print(){
        System.out.print(head.data + " -> ");
        Node temp = head.next;

        while (temp!=head){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }



    class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;

        }
    }

}
