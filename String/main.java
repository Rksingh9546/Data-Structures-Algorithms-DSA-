import java.util.*;
public class  main {
    public static void prinLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        char arr[]= {'a','b','c','d','e'};
//        String str = "abcd";
//        String str2 = new String("xyz@123");
//
//        //String are immutable
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);

//        String fullname ="Iran man";
//        System.out.println(fullname.length());

        String firstName = "Mahabali";
        String lastName = "Haluman";
        String fullName = firstName +" "+ lastName;
//        System.out.println(fullName.charAt(1));
        prinLetters(fullName);

    }
}
