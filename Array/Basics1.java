import java .util.Scanner;
public class Basics1{
    public static void main(String[] args) {
        
        /*  1 : take array input from the user
         *  2 : print the array in a single line
         */

         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
        int arr[]=new int[n];

        // taking input 
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //sum of the array elements

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println(sum);

        // avg of the array elements

        double avg=(double)sum/arr.length;//convert int to double (explictly type cast)
        System.out.println(avg);
        

        // fraction of +ve , -ve , and 0
        double count=0;
        double pcount=0;
        double ncount =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pcount =pcount+1;
            }
            else if(arr[i]<0){
                ncount =ncount+1;
            }
            else {
                count =count+1;
            }
        }
        System.out.println(pcount/arr.length);
        System.out.println(ncount/arr.length);
        System.out.println(count/arr.length);

    }
}