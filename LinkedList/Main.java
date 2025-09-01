//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        SingleLinkedList list = new SingleLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(7);
//        list.insertFirst(5);
//
//        list.display();
//       list.insertLast(100);
//
//       list.insertAtParticularIndex(100,2);
//        System.out.println(list.search(7));
//
//        System.out.println(list.countElements());
//
//        list.display();

//        SingleLinkedList list = new SingleLinkedList();
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//
//
//
//        list.display();
//
//        list.display();

        CLL list = new CLL();

        // Insert elements at head
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtTail(100);
        list.deleteAtTail();

        // Print the circular linked list
        list.print();
    }
}