public class GetInBits {
    public static int  getInbits(int n , int i){
        int bitmask =1 << i;
        if((n & bitmask)==0 ){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setInbits(int n ,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearInbit(int n,int i){
        int bitmask =~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n,int i){
        n = clearInbit(n,i);
        int newBit = 0;
        int bitmas = newBit<<i;
        return n| bitmas;
    }
    public static int clearIBits(int n,int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static boolean ispoweroftwo(int n){
        return (n &(n-1)) ==0;
    }

    public static void main(String[] args) {
        System.out.println(getInbits(10,2));
        System.out.println(setInbits(10,2));
        System.out.println(clearInbit(10,1));
        System.out.println(updateIthBit(10,2));
        System.out.println(clearIBits(15,2));
        System.out.println(ispoweroftwo(16));
    }

}
