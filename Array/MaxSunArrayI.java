public class MaxSunArrayI {
    public  static void maxsubarraySum(int arr[]){
        int currsum =0;
        int maxsum =0;
        for(int i=0;i<=arr.length;i++){
            int start =i;
            for(int j=i;j<=arr.length;j++){
                int end = j;
                currsum =0;
                for(int k=start;k<end;k++){
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if(currsum >maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.print("max sum ="+ maxsum);


    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxsubarraySum(arr);
    }

}
