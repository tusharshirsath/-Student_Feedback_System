/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author HP
 */
public class Student {
    private String First_Name;
    private String Last_Name;
    private int Roll_Number;
    private String Password;
    private String Course;

    public Student() {
    }

    public Student(String First_Name, String Last_Name, int Roll_Number, String Password, String Course) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Roll_Number = Roll_Number;
        this.Password = Password;
        this.Course = Course;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public int getRoll_Number() {
        return Roll_Number;
    }

    public void setRoll_Number(int Roll_Number) {
        this.Roll_Number = Roll_Number;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }
           
            
}
