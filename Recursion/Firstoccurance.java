public class Firstoccurance {
    public static int findFirstOccur(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       return  findFirstOccur(arr,key,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,3,2,1,4,5,7,4,5,7,4,};
        System.out.println(findFirstOccur(arr,5,0));
    }
}
