public class PrintSubArray {
    public static void printSubarry(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start =0;
            for(int j=i;j<arr.length;j++){
                int end =j;
                for(int k=start; k<end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarry(arr);
    }
}
