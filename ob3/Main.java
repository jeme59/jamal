package ob3;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(5);  // 2 -> 5
//        list.addToStart(1);   // 1 -> 2 -> 5
//        list.deleteAtIndex(0); // حذف العنصر 1 -> 2 -> 5 => 2 -> 5
//        list.deleteAtIndex(1); // حذف العنصر عند index 1 => 2 فقط
//        list.deletTheStart();// 5->null
//        list.deletTheEnd();//2->null
        list.countOccurrences(5);
        LinkedList list2=new LinkedList();
        list2.insertAtEnd(3);
        list2.insertAtEnd(8);
        list2.insertAtEnd(10);
        list.concat(list2);
        System.out.println();

        list.deleteByValue(5);


        list.printList(); //// النتيجة: 2 -> null

        System.out.println("the size :"+list.getSize());

    }
}
