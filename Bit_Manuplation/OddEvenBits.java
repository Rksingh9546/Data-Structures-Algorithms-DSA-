public class OddEvenBits {
    public static void oddorEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(11);
        oddorEven(16);
    }
}
