public class pairArray {
    public static void printpairs(int nums[]){
        int totalpair =0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("(" + curr+ ","+nums[j] + ")");
                totalpair++;
            }
            System.out.println();

        }
        System.out.println("print the total pairs:"+totalpair);

    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        printpairs(nums);
    }
}
