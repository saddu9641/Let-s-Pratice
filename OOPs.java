interface Animal{
    void walk();
    

}
class Horse1 implements Animal{
    public void walk(){
        System.out.println("$ legs");
    }
}
public class OOPs {
    public static void main(String[] args) {
        Horse1 h1 =  new Horse1();
        h1.walk();
        
        
    }
    

}