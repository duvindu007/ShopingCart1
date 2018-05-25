/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import database.DB_Conn;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class users implements Serializable  {
     Connection c;
    public String userEmail = null;
    public int userId = 0;
    public String username;
    public String address;
    public String gender;
    public String userImage;
    public String mobileNum;
   
    
   
    
    public void setUserEmail (String userEmail) throws SQLException, ClassNotFoundException{
    
        this.userEmail = userEmail;        
    }
    public String getUserEmail (){
        return userEmail;
    }
    public int getUserId (){
        return userId;
    }
     public String getUsername (){
        return username;
    }
    public String getAddress (){
        return address;
    }
    public String getGender (){
        return gender;
    }
    public String getMobileNum (){
        return mobileNum;
    }

    

    public void setUsername(String name) {
        this.username=name;
    }
    public void setAddress(String address) {
        this.address=address;
    }
     public void setGender(String gender) {
        this.gender=gender;
    }
 
   public void setMobileNum(String mobile) {
        this.mobileNum=mobile;
    }
}
