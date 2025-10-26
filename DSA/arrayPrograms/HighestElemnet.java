public class HighestElemnet{
    public static void main(String[] args) {
        int arr []={110,20,310,40};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}