package LinkedList;

public class InsertionDLL_05 {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 8};
        Node6 head = Array_DLL(arr);

//        head = InsertBeforeHead(head, 10);

//        head = insertBeforeTail(head, 90);

//        head = insertBeforeKthIndex(head, 5, 22);

        head = insertBeforeNode_DLL(head, head.next.next.next, 1);
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }

    }

    private static Node6 insertBeforeNode_DLL(Node6 head, Node6 node, int value) {
        Node6 prev = node.back;
        Node6 newNode = new Node6(value, node, prev);
        prev.next = newNode;
        node.back = newNode;
        return head;
    }

    private static Node6 insertBeforeKthIndex(Node6 head, int Kthindex, int value) {
        if(Kthindex == 1){
            Node6 newNode = new Node6(value, head, null);
            head.back  =  newNode;
            return newNode;
        }

        Node6 temp = head;
        int count = 0;
        while(temp.next != null){
            count++;
            if(count == Kthindex){
                break;
            }
            temp = temp.next;
        }
        Node6 prev = temp.back;
        Node6 newNode = new Node6(value, temp, prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    private static Node6 insertBeforeTail(Node6 head, int value) {
        if(head.next==null){
            // if only 1 ele
            return  InsertBeforeHead(head, value);
        }
        Node6 tail = head;
        while(tail.next !=null ){
            tail = tail.next;
        }
        Node6 secLast = tail.back;
        Node6 newNode = new Node6(value, tail, secLast);
        tail.back = newNode;
        secLast.next = newNode;
        return head;
    }

    private static Node6 InsertBeforeHead(Node6 head, int value) {
        Node6 newHead = new Node6(value, head, null);
        head.back = newHead;

        return newHead;
    }

    private static Node6 Array_DLL(int[] arr) {
        Node6 head = new Node6(arr[0]);
        Node6 prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node6 temp = new Node6(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

}
class Node5{
    int data;
    Node6 next;
    Node6 back;

    public Node5(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public Node5(int data, Node6 next, Node6 back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
    @Override
    public String toString() {
        return String.valueOf(data);  // print only the value
    }

}

