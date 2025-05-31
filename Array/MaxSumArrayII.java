public class MaxSumArrayII {
    public static void prifixSubArray(int arr[]){
        int currsum =0;
        int maxsum =0;
        int prefix[] = new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=0;j<arr.length;j++){
                int end =j ;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("the max subarray:"+ maxsum);
    }

    public static void main(String[] args) {
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};
        prifixSubArray(arr);
    }
}
