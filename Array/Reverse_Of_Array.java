import java.util.Scanner;
public class Reverse_Of_Array{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
          }

          int i=0;
          int j=n-1;
          while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
          }
          for( i=0;i<n;i++){
            System.out.print(arr[i]+" ");
          }


        
        }

    }
