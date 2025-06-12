public class selectionsort {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minele = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minele] > arr[j]){
                    minele = j;
                }
            }
            int temp = arr[minele];
            arr[minele] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
        printArr(arr);
    }
}
