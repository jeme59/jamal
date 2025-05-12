package ob3;

public class Node {
   private int data;
   private Node next;//(pointer)المؤشر

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(int data) {

        this.data = data;
    }

    public void setNext(Node next) {

        this.next = next;
    }

    public int getData() {

        return this.data;
    }

    public Node getNext() {

        return this.next;
    }
}
