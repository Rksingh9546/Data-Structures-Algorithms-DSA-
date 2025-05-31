public class Kadane {
    public static void kadanes(int arr[]){
        int maxsum =0;
        int currsum =0;
        for(int i=0;i<arr.length;i++){
            currsum = currsum + arr[i];
            if(currsum < 0){
                currsum =0;
            }
            maxsum = Math.max(currsum,maxsum);
        }
        System.out.println("max sum:" + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}






























