public class IncreaseNo {
    public static void PrintIncre(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        PrintIncre(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n =10;
        PrintIncre(n);
    }

}
