//write a function that takes in the radiusas input and return the circumference of circle

import java.util.*;

class Demo{

    public static Double printCircum(Double r){

        return 2*3.14*r;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();

        System.out.println("Circumference of circle is:" +printCircum(r));
    }
}