public class DecreseNo {
    public static void PrintDec(int n){
        if(n ==1){
            System.out.print(n+" ");
            return ;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        PrintDec(n);
    }
}
