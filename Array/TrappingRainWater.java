public class TrappingRainWater  {
    public static int  findtrappingRainwater(int height[]){
        int n= height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }
        int rightmax[] =new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum += Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(findtrappingRainwater(height));
    }

}
