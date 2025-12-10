public class ArrayRotation2 {
    public static void main(String[] args) {
        
          int arr[]={12,14,15,16};
        // output={16,15,14,12};
        int n=3;
        for(int j=0;j<=n;j++){ 
       int last=arr[arr.length-1];
 
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
            
        }
         arr[0]=last;
        System.out.println(Arrays.toString(arr));
        }
    }
    
    
}
