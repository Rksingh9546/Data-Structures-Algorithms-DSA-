import java.util.*;
public class InbuildSOrt {
    public static void PrintArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {5,3,4,1,2};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,2);
        Arrays.sort(arr,Collections.reverseOrder());
        PrintArr(arr);
    }
}
