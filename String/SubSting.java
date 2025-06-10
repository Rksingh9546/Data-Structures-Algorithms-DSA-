public class SubSting {
    public static String substring(String str, int st,int ed){
        String substr = "";
        for(int i=st;i<ed;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));
        //System.out.println(substring(str,0,5));
    }
}
