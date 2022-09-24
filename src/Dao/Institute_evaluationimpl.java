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
public class Institute_evaluationimpl implements Institute_evaluationdao{

    @Override
    public void insertInstitute_evaluation(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15) {

    try{
       
          
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfeedbacksystem?autoReconnect=true&useSSL=false","root","1234");
            PreparedStatement ps = con.prepareStatement("insert into institute_evaluation values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");          
                   ps.setString(1, s1);
                ps.setString(2, s2);
                ps.setString(3, s3);
                ps.setString(4, s4);
                ps.setString(5, s5);
                ps.setString(6, s6);
                ps.setString(7, s7);
                ps.setString(8, s8);
                ps.setString(9, s9);
                ps.setString(10, s10);
                ps.setString(11, s11);
                ps.setString(12, s12);
                ps.setString(13, s13);
                ps.setString(14, s14);
                ps.setString(15, s15);
                    ps.executeUpdate();
                    {  
                        JOptionPane.showMessageDialog(null, "Institute Feedback Submitted Successfully");  
                    }
            }
            
        catch (Exception ex)   
                {  
                    JOptionPane.showMessageDialog(null, "Something Error !!\nPlease fill again");
                    System.out.println(ex);  
                }    }
    
}
