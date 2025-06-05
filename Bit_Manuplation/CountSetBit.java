public class CountSetBit {
    public static int countSetBit(int n){
        int count =0;
        while(n >0){
            if((n & 1)!= 0){
                count++;
            }
            n =n >>1;
        }
        return count;
    }
    public static int fastExpo (int a,int n){
        int ans =1;

        while(n > 0){
            if((n & 1)!= 0){
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(12));
        System.out.println(fastExpo(2,50));
    }
}
