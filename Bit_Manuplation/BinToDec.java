public class BinToDec {
    public static void binTodec(int  binNo){
        int pow =0;
        int decNo =0;
        int MyNo = binNo;
        while(binNo > 0){
            int lastdigit = binNo %10;
            decNo = decNo +(lastdigit * (int) Math.pow(2,pow));
            pow++;
            binNo = binNo/10;
        }
        System.out.println("decimal of " +MyNo +" = " +decNo);
    }

    public static void main(String[] args) {
        int binNo =101;
        binTodec(binNo);
    }
}
