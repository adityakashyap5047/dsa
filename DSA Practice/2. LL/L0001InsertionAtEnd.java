public class L0001InsertionAtEnd {
    
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtEnd(Node head, int x){

        Node newNode = new Node(x);

        if (head == null) {
            return newNode;
        } 

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void main(String S[]){
        Node head = insertAtEnd(null, 5);
        System.out.println(head.data);
        System.out.println(head.next);
        head = insertAtEnd(head, 10);
        System.out.println(head.data);
        System.out.println(head.next.data);
        head = insertAtEnd(head, 20);
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}
