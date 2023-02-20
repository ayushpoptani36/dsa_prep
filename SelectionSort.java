public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,5,3,2};
        int j=0;
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int k=i;k<arr.length;k++){
                if(arr[k]<arr[min]){
                    min=k;
                }
            }
            swap(arr,j,min);
            j++;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void swap(int[] arr ,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
