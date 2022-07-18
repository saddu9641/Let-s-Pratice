public class AddElement{
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public void AddAtFirst(int num){
        Node newnode = new Node(num);
        newnode.next =head;
        head = newnode;
    }
    public void AddAtLast(int num){
        Node newnode = new Node(num);
        newnode.next = null;
        if(head == null ){
            newnode.next = head;
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
            
        }
        
    }
    public void AddMiddle(int num){
        Node newnode = new Node(num);
        newnode.next = null;
        int position = 0;
        if (position < 1){
            System.out.println("Invalid Position");
        }
        else if(position == 1){
            head.next = newnode;
        }
        // else{
        //     position = 3;
        //     Node temp = head;
        //     while(position-- !=0){
                
        //     }
        // }
          
       

    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        AddElement l = new AddElement();
        l.AddAtFirst(3);
        l.AddAtFirst(4);
        l.AddAtFirst(5);
        l.AddAtLast(1);
        l.print();
        
    }
}