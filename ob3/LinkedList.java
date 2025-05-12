package ob3;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data, null);
        // Case 1: List is empty → new node becomes head
        if (head == null) {
            head = newNode;
            return;
        }
        // Case 2: Traverse to the last node
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        // Link the last node to the new node
        temp.setNext(newNode);
    }

    public void addToStart(int n) {// 1-اضافة النود في البداية.
        Node newHead = new Node(n, head);
        head = newHead;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void deletTheStart(){//2
        if (head !=null){
            head=head.getNext();
        }
        if (head ==null){
            System.out.println("nuklllllllllllllllll");
        }

    }
    public void deletTheEnd(){//3
        if (head ==null){
            return;
        }

        if (head.getNext() ==null){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.getNext().getNext() !=null){
            temp=temp.getNext();

        }
        temp.setNext(null);
    }

    public void deleteAtIndex(int x) {//دالة لحذف النود من اي مكان حسب الرقم المدخل.7
        if (x == 0) {
            head = head.getNext();
            return;
        }
        int count = 0;
        Node current = head;
        while (count < x-1) {
            current = current.getNext();
            count++;
        }
        current.setNext(current.getNext().getNext());
    }

    // يمكنك تفعيلها عند الحاجة
     public int getSize() {//4دالة لحساب الحجم
         int count = 0;
         Node current = head;
         while (current != null) {
             count++;
             current = current.getNext();
         }
         return count;
     }

    public void countOccurrences(int x){
        int count=0;
        if (head.getData()==x){
            count++;
        }
        Node temp=head;
        while (temp.getNext() !=null){
            temp=temp.getNext();
            if (temp.getData()  == x){
                count++;
            }
        }
        System.out.println("the sum:"+count);
    }
    public void concat(LinkedList other){//6

//        Node temp=head;
//        while (temp.getNext() !=null){
//            temp=temp.getNext();
//        }

        if (head==null){
            System.out.println("this list is empty");
            return;
        }
        Node temp2=other.head;
        insertAtEnd(temp2.getData());
        while (temp2.getNext() !=null){
            temp2=temp2.getNext();
            insertAtEnd(temp2.getData());
        }
    }
    public void deleteByValue(int n){//7
        if (head.getData() ==n){
            head=head.getNext();
            System.out.println("deleted node with value :"+n);
            return;
        }

        Node temp=head;
        while (temp.getNext() != null){
            if (temp.getNext().getData() == n) {
                temp.setNext(temp.getNext().getNext());
                System.out.println("Deleted :"+n);
                return;
            }
            temp=temp.getNext();
        }
        System.out.println("value not found "+n);
    }
}
