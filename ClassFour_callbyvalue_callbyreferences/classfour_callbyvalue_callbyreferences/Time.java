/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classfour_callbyvalue_callbyreferences;

/**
 *
 * @author student_user
 */
public class Time {

    int hour;
    int minute;
    int second;

    Time(){
        //hour=10;
        //minute=12;
        //second=34;
        Timeshow();

    }

    Time(int h, int m, int s){
        hour=h;
        minute=m;
        second=s;
        Timeshow();

    }

    Time(int h){
        hour=h;
        Timeshow();

    }
    Time(Time f){
        hour=f.hour;
        minute=f.minute;
        second=f.second;
        Timeshow();

    }

    void Timeshow(){

        System.out.println(hour + ":"+ minute + ":"+ second);

    }


}