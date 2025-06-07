public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}
abstract class Animals{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animals{
    void walk(){
        System.out.println(" walks on four legs");
    }
}
class chicken extends Animals{
    void walk(){
        System.out.println("walks on two legs");
    }
}
