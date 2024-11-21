/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classfour_callbyvalue_callbyreferences;








public class ClassFour_callbyvalue_callbyreferences {


    public static void main(String[] args) {
         Time f1= new Time();
        Time f2= new Time(12, 12, 13);
        Time f3= new Time(10);
         Time f4= new Time(f2);
        System.out.println("Using method");
        Usingmethod f5= new Usingmethod();
        f5.Usingmethod();
        Usingmethod f6= new Usingmethod();
        f6.Usingmethod(12, 12, 13);
        Usingmethod f7= new Usingmethod();
        f7.Usingmethod(10);
        Usingmethod f8= new Usingmethod();
        f8.Usingmethod(f6);


    }

}