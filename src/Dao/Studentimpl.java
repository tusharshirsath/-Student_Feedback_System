/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Studentimpl implements StudentDao{

    @Override
    public void insertStudent(String s1, String s2, String s3, String s4, String s5) {
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfeedbacksystem?autoReconnect=true&useSSL=false","root","1234");
                PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
                ps.setString(1, s1);
                ps.setString(2, s2);
                ps.setString(3, s3);
                ps.setString(4, s4);
                ps.setString(5, s5);
                ps.executeUpdate();
                {
                    JOptionPane.showMessageDialog(null, "Student Signup Successful");
                }
        } catch (Exception e) {
        }
    }
    
}
