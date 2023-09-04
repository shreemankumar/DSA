
public class Searching_A_Nmuber {
    public static int search(int arr[], int n, int k) {

        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
               return i+1;
            }
            
            }
            return -1;
           
        }
    public static void main(String[] args) {
        int arr[]={2 ,3 ,4 ,5 ,6 ,7};
        int k;

       // position of the number
        System.out.println(search(arr, 6, 6));
        
        
    }
}
