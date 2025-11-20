package LinkedList;

public class DoublyLL_04 {
    public static void main(String[] args) {
        int[] arr = {33, 44, 55, 66, 77, 88};
        Node4 head = Array_DLL(arr);

        //head = deleteHead(head);

//        head = deleteTail_DLL(head);

        head = deleteNode_DLL(head, head.next);

//        head = deleteKth_DLL(head, 5);
        while(head != null){
            System.out.println(head);
            head = head.next;
        }
    }

    private static Node4 deleteNode_DLL(Node4 head, Node4 value){
        // no need to check for head delete check only last value


        if (head == null || value == null) return head;

        Node4 prev = value.back;
        Node4 front = value.next;

        // If value is head
        if (prev == null) {
            head = front;        // new head
            if (front != null) {
                front.back = null;
            }
            value.next = null;
            return head;
        }

        // If value is tail
        if (front == null) {
            prev.next = null;
            value.back = null;
            return head;
        }

        // Node is in the middle
        prev.next = front;
        front.back = prev;

        value.next = null;
        value.back = null;

        return head;
    }


    private static Node4 deleteKth_DLL(Node4 head, int k) {
        if(head == null){
            return null;
        }
        int count = 0;
        Node4 temp = head;
        while(temp != null){
            // code for reaching kth node
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }


        Node4 prev = temp.back;
        Node4 front = temp.next;
        //   prev <->   temp  <->  front

        if(prev == null && front == null){
            // single node
            return null;
        }else if(prev == null){
            // if deleting head
            return deleteHead(head);
        } else if(front == null){
            // tail case
            return deleteTail_DLL(head);
        }
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

        return head;

    }

    private static Node4 deleteTail_DLL(Node4 head) {
        if(head == null || head.next == null){
            return null;
        }
        Node4 tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node4 prev = tail.back;
        prev.next = null;
        tail.back = null;
        return head;
    }

    private static Node4 deleteHead(Node4 head) {
        if(head == null || head.next == null){
            return null;
        }

        Node4 prev = head;
        head = head.next;
        prev.next = null;
        head.back = null;

        return head;
    }

    // we will take ele as head, and then we will create prev i.e. equals to head
    // after that we will loop from 2nd ele and store it in temp
    // then temp next will point to null and back will point to prev
    // then we will connect prev.next to temp and then prev will be equal to temp
    private static Node4 Array_DLL(int[] arr) {
        Node4 head = new Node4(arr[0]);
        Node4 prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node4 temp = new Node4(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}

class Node4{


    int data;
    Node4 next;
    Node4 back;

    public Node4(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public Node4(int data, Node4 next, Node4 back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
    @Override
    public String toString() {
        return String.valueOf(data);  // print only the value
    }

}
