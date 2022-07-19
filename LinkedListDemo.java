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
            node = head;
        }
        else{
            Node temp = head;
            while(temp !=null){
                temp = temp.next;
            }
            node.next = null;
            temp = node;
        }
    }
    void addMid(int num){
        Node node = new Node(num);
        if(head == null){
            node.next = head;
            head = node;
        }
        else{
            Node temp = head;
            int length = 0;
            while(temp != null){
                temp = temp.next;
                length++;
            }
            int count = (length % 2 == 0)?(length/2):(length+1)/2;
            temp = head;
            while(count-- > 1){
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
        ls.addFirst(23);
        ls.addFirst(43);
        ls.addLast(34);
        ls.addFirst(324);
        // ls.addMid(9);
        ls.addFirst(23);
        ls.addFirst(43);
        ls.addLast(34);
        ls.addFirst(324);
        ls.print();
    }
}