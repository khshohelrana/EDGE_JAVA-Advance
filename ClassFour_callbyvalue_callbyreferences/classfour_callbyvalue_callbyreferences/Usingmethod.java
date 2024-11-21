/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classfour_callbyvalue_callbyreferences;

/**
 *
 * @author student_user
 */
public class Usingmethod {



    private int hour, minute, second;

   

    void Usingmethod(){
        //hour=10;
        //minute=12;
        //second=34;
        Timeshow();

    }

    void Usingmethod(int h, int m, int s){
        this.hour=h;
        this.minute=m;
        this.second=s;
        Timeshow();

    }

    void Usingmethod(int h){
        this.hour=h;
        Timeshow();

    }
    void Usingmethod(Usingmethod f){
        this.hour=f.hour;
        this.minute=f.minute;
        this.second=f.second;
        Timeshow();

    }

    public void Timeshow(){

        System.out.println(hour + ":"+ minute + ":"+ second);

    }


}