public class DecToBin {
    public static  void decTobin(int n){
        int MyNo= n;
        int pow =0;
        int binNo =0;
        while(n>0){
            int rem = n%2;
            binNo =binNo +(rem *(int) Math.pow(10,pow));
            rem++;
            n=n/2;
        }
        System.out.println("decimal of " +MyNo +" = " +binNo);
    }

    public static void main(String[] args) {
        int n =5;
        decTobin(n);
    }
}
