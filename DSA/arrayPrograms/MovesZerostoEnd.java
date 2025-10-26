import java.util.Arrays;

public class MovesZerostoEnd {
    public static void main(String[] args) {
        int arr[]={0,3,2,0,0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){ 
                arr[index]=arr[i];
                index++;
            }
        }
         for(int i=index;i<arr.length;i++){
            arr[i]=0;
           
         }
            System.out.println(Arrays.toString(arr));
         
        
    }
    
}
  