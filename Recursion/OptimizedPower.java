public class OptimizedPower {
    public static int Optimalpower(int x,int n){
        if(n ==0){
            return 1;
        }
        int halfpower = Optimalpower(x,n/2);
        int halfpowersqr = halfpower * halfpower;
        // odd
        if(n % 2 != 0){
            halfpowersqr = x * halfpowersqr;
        }
        return halfpowersqr;
    }

    public static void main(String[] args) {
        System.out.println(Optimalpower(2,10));
    }
}

