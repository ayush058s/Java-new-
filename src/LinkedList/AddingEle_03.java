package LinkedList;



public class AddingEle_03 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Node3 head = convert_LL(arr);
        print_LL(head);

//        head = insertNode(head, 99);
//        print_LL(head);

//        head = insertAtLast(head, 111);
//        print_LL(head);

//        head = insertAtKth(head, 7777, 4);
//        print_LL(head);

          head = insertBeforeData(head, 9898, 20);
          print_LL(head);

    }

    private static Node3 insertBeforeData(Node3 head, int value, int data) {
        if(head == null){
            return null;
        }
        if(head.data == data){
            Node3 temp = new Node3(value, head);
            return temp;
        }

        Node3 temp = head;
        while(temp.next  != null ){

            if(temp.data == data){
                Node3 x = new Node3(value, temp.next);
//                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;


        }
        return head;

    }

    private static Node3 insertAtKth(Node3 head, int value, int k) {
        if(head == null){
            return new Node3(value);
        }
        if(k == 1){
            Node3 temp = new Node3(value, head);
            return temp;
        }

        Node3 temp = head;
        int count = 0;
        while(temp != null ){
            count++;

            if(count == (k - 1)){
                Node3 x = new Node3(value, temp.next);
//                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;


        }
        return head;

    }

    private static Node3 insertAtLast(Node3 head, int value) {
        if(head == null) return new Node3(value);

        Node3 temp  = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new  Node3(value);
        return head;
    }

    private static Node3 convert_LL(int[] arr) {
        Node3 head = new Node3(arr[0]);
        Node3 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node3 temp = new Node3(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node3 insertNode(Node3 head, int value){
        Node3 temp = new Node3(value, head);
//        temp.next = head;
        return temp;
    }

    public static void print_LL(Node3 head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

class Node3 {
    int data ;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        this.next = null;
    }
    public Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;
    }
}