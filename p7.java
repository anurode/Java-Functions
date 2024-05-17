//write a function which takes in two numbers and return the greater number

import java.util.Scanner;

class Demo{

    static int printGreater(int a, int b){

        if(a > b){

            return a;
        }else{

            return b;
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("grestest number is:" +printGreater(a, b));
    }
}