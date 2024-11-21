package Math;

import CaIcuIation.subtract;
import CaIcuIation.sum;
import CaIcuIation.sum_using_conctructor;

public class main {

    public static void main(String[] args) {
        sum s = new sum();
        s.calculateSum(10, 5);
        System.out.println("Sum: " + s.calculateSum(10, 4));


        subtract subtract = new subtract(10,5);
       // System.out.println(subtract.calculatesub());


        sum_using_conctructor sUC = new sum_using_conctructor(10,5,10,20);



    }
}
