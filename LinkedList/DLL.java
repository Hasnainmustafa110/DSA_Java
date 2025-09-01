public class DLL {
   Node head;
   Node tail;

   public void push_front(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
   }

   public void push_back(int val){
       Node newNode = new Node(val);
       if(head == null){
           head = newNode;
           tail = newNode;
       }
       else{
           tail.next = newNode;
           newNode.prev = tail;
           tail = newNode;
       }
   }

 public void pop_first(){
       if(head == null){
           System.out.println("list is empty");
           return;
       }
       Node temp = head;
       head = head.next;
       if(head!=null) {
           head.prev = null;
       }
       temp.next = null;
       // Delete the element
 }
 public void pop_back(){
       Node temp = tail;
       tail = tail.prev;
       if(tail!=null){
           temp.next = null;
       }
       temp.prev = null;
       //DELETE THE ELEMENT
 }


   public void display(){
       Node node = head;
       Node last = null;
       while (node != null){
           System.out.print(node.val + "->");
           last = node;
           node = node.next;
       }
       System.out.println("NULL");

       System.out.println("IN REVERSE");

       while (last != null){
           System.out.print(last.val + "->");
           last = last.prev;
       }
       System.out.println(" NULL");
   }




   private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

}
