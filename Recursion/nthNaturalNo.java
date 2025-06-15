public class nthNaturalNo {
    public static int NaturalSum(int n){
        if(n==0){
            return 0;
        }
        return n + NaturalSum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(NaturalSum(n));
    }
}
