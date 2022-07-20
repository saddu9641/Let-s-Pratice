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
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next !=null){
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
    void deleteFirst(){
        Node temp = head;
        temp.next = head.next;
        head = temp.next;
    }
    void deleteLast(){
        Node temp = head ;
        if(temp.next == null){
            head = null;
        }
        else{
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
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
        ls.addFirst(3);
        ls.addFirst(4);
        ls.addLast(1);
        ls.addFirst(5);
        ls.addMid(2);
        ls.deleteLast();
        ls.deleteFirst();
        ls.print();
    }
}