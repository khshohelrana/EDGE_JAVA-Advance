/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassFour;


public class studentClass {
    int id;
    String name, dept;
    private static final String university= "KHR";



    public  studentClass (int id, String name, String dept, String university){
        this.id= id;
        this.name=name;
        this.dept=dept;
//this.university=university;
        display();

    }

    public void display(){

        System.out.println("student Name:" + name);
        System.out.println("student ID:" + id);
        System.out.println("student Dept:" + dept);
        System.out.println("student University:" + university);

    }

}