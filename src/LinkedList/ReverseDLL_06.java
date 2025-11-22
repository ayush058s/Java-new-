package LinkedList;

public class ReverseDLL_06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node6 head = convertToDLL(arr);

        head = reverseDLL(head);

        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    private static Node6 reverseDLL(Node6 head) {
        if(head==null){
            return null;
        }
        Node6 curr = head;
        Node6 temp;

        while(curr != null){
            temp = curr.back;
            curr.back = curr.next;
            curr.next = temp;

            head = curr;
            curr = curr.back;
        }
        return head;
    }

    private static Node6 convertToDLL(int[] arr) {
        Node6 head = new Node6(arr[0]);
        Node6 prev = head;

        for(int i = 1; i < arr.length; i++){
            Node6 temp = new Node6(arr[i], null, prev);
            prev.next = temp;
            prev = temp;

        }
        return head;
    }
}
class Node6 {
    int data;
    Node6 next;
    Node6 back;

    public Node6(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public Node6(int data, Node6 next, Node6 back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
    @Override
    public String toString() {
        return String.valueOf(data);  // print only the value
    }

}


