public class Length {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int size=0;
        for(int i:arr){
            size++;
        }
        System.out.println(size);
        int index=0;
        try {
            while (true) { 
                int temp=arr[index];
                System.out.println(temp);
                index++;
                
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound "+index);
        }
    }
    
}
