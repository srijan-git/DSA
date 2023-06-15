package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
        myLinkedList.prepend(8);

//        System.out.println(myLinkedList.get(2).value + "\n");

//        myLinkedList.set(1, 4);
//        myLinkedList.insert(2, 33);
//        myLinkedList.remove(2);
//        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
