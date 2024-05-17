// find factorial of number

import java.util.Scanner;

class Demo {

    public static int printFacto(int a){

        int prod = 1;

        for(int i=a; i>=1; i--){

            prod = prod*i;
        }
        return prod;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int prod = printFacto(a);

        System.out.println("factorial of number is:" +prod);
    }
}