public class small_element {
      public static void main(String[] args) {
        int arr []={110,20,310,40};
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

    }
    
}
