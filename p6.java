//write function print sum of all odd numbers from 1 t0 n

import java.util.Scanner;

/*class Demo{

    public static int printSum(int n){
        
        int sum =0;

        for(int i=1; i<=n; i++){

            if(i%2 ==1){
                
                sum = sum+i;
            }
           
        }
        return sum;
     }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("sum of odd numbers is:" + printSum(n));
    }
} */


class Demo{

    public static void printSum(int n){

        int sum= 0;

        for(int i=1; i<=n; i++){

            if(i%2 ==1){
                
                sum = sum+i;
            }
        }

        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSum(n);
    }
}
