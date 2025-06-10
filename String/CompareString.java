public class CompareString {
    public static void main(String[] args) {
        String s1 = "Haluman";
        String s2 = "Haluman";
        String s3 = new String("Haluman");

        if(s1 == s2){
            System.out.println("String is equal");
        }
        else{
            System.out.println("String is not equal");
        }
        if(s1 .equals(s3)){
            System.out.println("String is equal");
        }
        else{
            System.out.println("String is not equal");
        }
    }
}
