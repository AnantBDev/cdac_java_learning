package com.day9.module;

import java.sql.*;

public class BasicDB {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/users";
        String query="SELECT * FROM users";
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try{
                con= DriverManager.getConnection(url,"root","bda123");
                Statement st=con.createStatement();
                ResultSet records=st.executeQuery(query);
                while(records.next()){
                    System.out.println(
                            records.getInt(1)+", "+
                                    records.getString(2)+", "+
                            records.getInt(3)+", "+
                                    records.getString(4)+", "+
                            records.getString(5));
                }
            }
            finally{
                try{
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
