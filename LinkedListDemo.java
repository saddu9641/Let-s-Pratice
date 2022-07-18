public class LinkedListDemo{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    void addFirst(int num){
        Node node = new Node(num);
        node.next = head;
        head = node;
    }
    void addLast(int num){
        Node node = new Node(num);
        node.next = null;
        if(head == null){
            node.next = head;
            head =node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    void addMid(int num){
        Node node = new Node(num);
        node.next = null;
        if(head == null){
            node.next = head;
            head = node;
        }
        else{
            Node temp = head;

            int len = 0;
            while(temp != null){
                len++;
                temp = temp.next; 
            }
            int count = (len % 2 == 0)?len/2:(len+1)/2;
            temp = head;
            while (count-- > 1){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListDemo ls = new LinkedListDemo();
        ls.addFirst(2);
        ls.addFirst(34);
        ls.addLast(431);
        ls.addLast(354);
        ls.addFirst(2);
        ls.addFirst(34);
        ls.addLast(431);
        ls.addLast(354);
        ls.addMid(23);
        ls.print();
    }
}