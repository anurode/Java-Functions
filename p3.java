//multiply two numbers and return the product

import java.util.*;     //improt all classes from java.util package

class Demo{

    public static int printProd(int a, int b){

        int prod = a*b;
        return prod;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int prod = printProd(a,b);
        System.out.println("multiplication is"+ prod);
    }
}