package LinkedList;

public class DeletionOfLL_02 {
    static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        Node2 head = convert2LL(arr);
        System.out.println(head.data);

//        head = removesNode(head);
//        System.out.println(head.data);
//
//        head = removeTail(head);
//        System.out.println(head.data);

        head = removeKth(head,4);

        head = removeValue(head, 30);


        printLL(head);
    }

    public static Node2 removeTail(Node2 head){
        if(head == null || head.next == null){
            return null;
        }
        Node2 temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    public static Node2 removeValue(Node2 head, int value){
        if(head == null || head.next == null){
            return head;
        }
        if(head.data == value){
            head = head.next;
            return head;
        }
        Node2 temp = head;
        Node2 prev = null;
        while(temp != null){
            if(temp.data == value){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node2 removeKth(Node2 head, int k){
        if(head == null || head.next == null) return head;
        if(k == 1){
            head = head.next;
            return head;
        }
        int count = 0;
        Node2 temp = head;
        Node2 prev = null;

        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static Node2 removesNode(Node2 head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static Node2 convert2LL(int[] arr) {
        Node2 head = new Node2(arr[0]);
        Node2 mover = head;
        for(int i = 1; i < arr.length; i++){
            Node2 temp = new Node2(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printLL(Node2 head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
class Node2{
    int data;
    Node2 next;

    Node2(int data){
        this.data = data;
        this.next = null;
    }
}
