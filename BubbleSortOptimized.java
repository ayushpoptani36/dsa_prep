public class BubbleSortOptimized {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        boolean swapped=false;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
            }
            if(!swapped) break;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
