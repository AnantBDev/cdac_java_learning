package com.day9.module;

import java.sql.*;

public class BasicCRUDOperations {
    public static void selectData(Connection con , String query){
        try{
            Statement st= con.createStatement();
            ResultSet records = st.executeQuery(query);
            while(records.next()){
                System.out.println(records.getInt(1)+","+
                        records.getString(2)+","+
                        records.getInt(3)+","+
                        records.getString(4)+","+
                        records.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static  void insertData(Connection con,String query,User user){
        try{
            PreparedStatement pst= con.prepareStatement(query);
            pst.setInt(1,user.getId());
            pst.setString(2,user.getName());
            pst.setInt(3,user.getAge());
            pst.setString(4,user.getGender());
            pst.setString(5,user.getNationality());
            int count=pst.executeUpdate();
            System.out.println(count+ "row(s) affected");
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public static void updateData(Connection con,String query,User user){
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,user.getAge());
            pst.setString(2,user.getName());
            int count = pst.executeUpdate();
            System.out.println(count+"row(s) affected");
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void deleteData(Connection con,String query,User user){
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,user.getId());
            int count = pst.executeUpdate();
            System.out.println(count+"row(s) affected");
        }
        catch(SQLDataException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String args []){
        String url="jdbc:mysql://localhost:3306/users";
        String qselect="SELECT * FROM USER";
        String qinsert="INSERT into user VALUES (?,?,?,?,?)";
        String uquery="UPDATE user SET age=? WHERE name=?";
        String dquery="DELETE from user WHERE id=?";
        User user1=new User(5, "Canada","female",21,"Elizabeth");
        User user2=new User();
        user2.setName("Elizabeth");
        user2.setAge(33);

        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, "root", "bda123");
                selectData(con,qselect);
                System.out.println("----------------------------");
                updateData(con,uquery,user2);
                selectData(con,qselect);
                System.out.println("----------------------------");
                deleteData(con,dquery,user1);
                selectData(con,qselect);
            }catch(SQLException e){
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try{
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
