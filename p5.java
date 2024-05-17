// Enter 3 no and make a function to print their average

import java.util.Scanner;

class Demo{

    public static int printAverage(int a, int b, int c){

        int Average = a+b+c/3;
        return Average;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int Average = printAverage(a, b, c);

        System.out.println("Average of num is:" +Average);
    }
}