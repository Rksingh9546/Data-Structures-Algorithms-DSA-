public class Power {
    public static int findPow(int x,int n){
        if(n == 0){
            return 1;
        }
        return x * findPow(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(findPow(2,10));
    }

}
