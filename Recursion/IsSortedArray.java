public class IsSortedArray {
    public static boolean isSorted(int arr[] ,int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,18,9,13};
        System.out.println(isSorted(arr,0));           //O(n)
    }
}
