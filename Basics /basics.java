
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class ram{
        /**
         * @param args
         */
        public static void main(String args[]){
             Scanner sc = new Scanner(System.in);
             /*
              jan ,mar,may,July,aug,oct,dec
              1,3,5,7,8,10,12

              */
             /*  int i=0;
              for( ; i<2;){
                System.out.println("w");
                i++;
              }
              */
              //int n=10;
            //  for(int i=1;i<=10;i++){
              //  System.out.println(i);
              //}
              //int num=sc.nextInt();
             /* 
             int n=0;
              for(int i=100;i>=n;i--){
                if(i%2==0){
                    System.out.println(i);
                }
                
              }
              for(int i=10;i>=0;i-=2){
                System.out.println(i);
              }*/ 
            //   int n=sc.nextInt();
            //   int sum=0;
            //   for(int i=1;i<=n;i++){
            //      sum+=i;
                
            //   }
            //   System.out.println(sum);
            
                // int i=1;
                // while(i<=12){
                //     System.out.println(i+=2);
                //     i++;
                // }
                //sum of digits of number u have to find the answer
                //123=3+2+1=6,   n%10
                // int n= sc.nextInt();
                // int sum=0;
                // while(n>0){
                //     int digit=n%10;
                //      sum+=digit;
                //      n/=10;
                // }
                // System.out.println(sum);
                // System.out.println("enter a number");
                // int n = sc.nextInt();

                // while(n%2==0){
                //     System.out.println("enter a number");
                //     n=sc.nextInt();
                    
                //}
                // int n;
                // do{
                //     System.out.println("enter a number");
                //     n=sc.nextInt();
                // }while(n%2==0);
                    // for(int i =1;i<=2; i++){
                    //     System.out.println("a");
                    //     for(int j=1;j<=3;j++){
                    //         System.out.println("b");//
                    //     }
                    //  System.out.println("ram bhai");
                    // }
                    // for(int i=0;i<=10;i++){
                    //    // System.out.println(i);
                    //     if(i==5){
                    //     continue;
                    //     }
                    //     System.out.println(i);
                    // }
//                     int m=sc.nextInt();
//                     int n= sc.nextInt();
// //int sum=0;
//                     for(int i=1;i<=m;i++){
//                         for(int j=1;j<=n;j++){
//                             System.out.print(j=j+i);
                           
//                         }
//                         System.out.println();
//                     }
                // int n=sc.nextInt();
                // for(int i=1;i<=n;i++){
                //     for(int j=1;j<=n-i;j++){
                //         System.out.print(" ");
                //     }for(int j=1;j<=i;j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }
            //     int n =sc.nextInt();
            //    // int mul;
            //    for(int i= 1;i<=n;i++){
            //     for(int j=1;j<=10;j++){
            //         System.out.println(n);
            //         int mul=n*i;
            //         System.out.println(mul);
            //     }
            //     //int mul=n*i;
            //     //System.out.println(mul);
            //    }
            //    //System.out.println(mul);



                // System.out.print("enter a number : ");
                // int n=sc.nextInt();
                // for(int i=1;i<=10;i++){
                //     System.out.println(n+"x"+i+"="+n*i);
                // }
                // int n=sc.nextInt();
                //     for(int i=1;i<=n;i++){
                //         for(int j= 1;j<=n+i;j++){
                //             System.out.print(" ");
                //         }
                //         for(int j=1;j<=n-i;j++){
                //             System.out.print(" *");
                //         }
                //         System.out.println();
                        
                //     }
             
                //******  begin with java question pratices******/

                    //        int sum=0;
                    //     for(int i=1;i<=10;i++){
                        
                    // sum+=i;
                            
                    //     }



        //             //     System.out.println(sum);
        // int  n = sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     if(n<0){
        //         System.out.println("not possible");
        //         break;
        //     }
            
        //     System.out.println(n*i);
        // }            



        // int n=sc.nextInt();
        // int mul=1;
        // for(int i=1;i<=n;i++){
        //     mul*=i;

        // }
        // System.out.println(mul);



        // double a=sc.nextDouble();
        // double b=sc.nextDouble();
        // double c=Math.pow(a, b);
        // System.out.println(c);        //with java inbuild function


        //without using inbuilding function
        //     int a=sc.nextInt();
        //     int b= sc.nextInt();
        //     int c=1;
        // for(int i=1;i<=b;i++){
        //    c*=a;
        // }
        // System.out.println(c);





        //concept of array......



        // int []arr=new int[5];
        // System.out.println(arr);
       // int []arr=new int[5];
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] +" ");
        // }
       // System.out.println();
        // arr[2]=6;
        // arr[4]=12;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        //System.out.println();

        // int []aaa={1,2,3,4,5,6};
        // System.out.println(aaa.length);
        // for(int i=0;i<aaa.length;i++){
        //     System.out.print(aaa[i]+" ");
        // }
        



        //./............/...../..../
         //   System.out.println("enter value of array which you are stored :");
     //int n =sc.nextInt();
     //int []arr =new int[n];
     //int a=0;
    //  for(int i=0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
        
    //  }
    //  for(int i=0;i<arr.length;i++){
    //    System.out.print(arr[i]);
    //  }
    //  double avg=(double)a/n;
    //  //double b=Math.max(arr[i]);
    //  System.out.print(avg);

    //     int n=sc.nextInt();
    //     int []arr=new int[n];
        
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int a=0;
    //     int b=0;
    //     int c=0;

    //  for(int i=0;i<n;i++){
    //     if(arr[i]==0){
    //         a++;
    //     }
    //     else if(arr[i]>0){
    //         b++;
    //     }
    //     else{
    //         c++;
    //     }
        
    //  }
    //  System.out.println(a);  
    //  System.out.println(b);
    //  System.out.println(c);
    // int n= sc.nextInt();
    //    for(int i=5;i>=0;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" *");
    //     }
    //     System.out.println();
    //    }


       //int n=sc.nextInt();
    //    int target= sc.nextInt();
    //    int ans=-1;
    //    int []arr={2,3,4,5,6};
    //    int n=arr.length;
    //    for(int i=0;i<n;i++){
    //     arr[i]=sc.nextInt();
    //    }
    //    for(int i=0;i<n;i++){
    //     if(arr[i]==target)
    //     {
    //         ans=i;
    //     }
    //     else if(ans!=target)
    //     {
    //         System.out.print(ans+1);
    //     }
    //     else
    //     {
    //         System.out.print(ans);
    //     }
        
    //    }
    
    


   // reverse of array

//    int []arr={1,2 ,3,4,5,6,7};
//    int n=arr.length;
//    int i=0;
//    int j=n-1;
//    while(i<j){
//     int temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
//     i++;
//     j--;
    

//    }
//    for(i=0;i<n;i++){
//     System.out.print(arr[i]+" ");
//    }




//another way of printing the contact of arr,here it is not preferable ,for loop is better hehehe eee





//  int []arr={2,3,44,5,6,77};
//  for(int x:arr){
//     System.out.println(x);
//  } 
//                                         MAXIMUM INTEGER OF AN ARRAY 
// int []arr={1,3,4,55,677,88,8};

// int ans=Integer.MAX_VALUE;
// //int ans=arr[1];
// for(int i=1;i<arr.length;i++){
//         if(arr[i]< ans){
//             ans=arr[i];
//         }
//     }
//     System.out.println(ans);
    

//to print 2-d array


// int [][]mat=new int [3][3];
// mat[2][1]=8;
// for(int i=0;i<mat.length;i++){
//     for(int j=0;j<mat[i].length;j++){
//         System.out.print(mat[i][j]+" ");
//     }
//     System.out.println();
// }
 

//to take inpit and take sum of all elements of the matrix


// int m=sc.nextInt();
// int n=sc.nextInt();
// int sum=0;
// int [][]mat=new int [m][n];
// for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         mat[i][j]=sc.nextInt();

//     }
// }
// for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//        if(i+j==2)
//        {
//         sum+=mat[i][j];
        
//        }
       
//     }
    
   
// }
// System.out.println(sum);




//strings//



// String s = "hello my name";
// System.out.println(s);
// System.out.println(s.length());
//  System.out.println(s.indexOf('a'));
// System.out.println(s.charAt(1));
//  System.out.println(s.indexOf('m',7));
//  System.out.println(s.indexOf("name"));
//  System.out.println(s.indexOf("my",6 ));
//  System.out.println(s.toUpperCase());
// System.out.println(s.toLowerCase());

// System.out.println(s.replace('e','w'));
// System.out.println(s.substring(3,7));
// System.out.println(s.replace("m","dy"));


 //concept of replacing in string

// String []ram=s.split(" ");
// String[]ram=s.split("y");
// for(String m:ram){
//     System.out.print(m);


  //String s=sc.nextLine();
//   String s=sc.nextLine();
//   String s1=sc.next();
//  System.out.println(s);
//  System.out.println(s1);
// String a= sc.next();
//  char n=sc.next().charAt(0);
//  System.out.println(n);


int n=sc.nextInt();
int []arr=new int [n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int max=-1;
int ans=0;

for( int i=0;i<n;i++){
    if(max<arr[i]){

    }
    
}






        }





        }

