package com.day9.assignment;

import com.day9.module.User;

import java.sql.*;

public class BookCRUD {
        public static void selectData(Connection con , String query){
            try{
                Statement st= con.createStatement();
                ResultSet records = st.executeQuery(query);
                while(records.next()){
                    System.out.println(records.getInt(1)+","+
                            records.getString(2)+","+
                            records.getString(3)+","+
                            records.getInt(4)+",");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static  void insertData(Connection con, String query, Book book){
            try{
                PreparedStatement pst= con.prepareStatement(query);
                pst.setInt(1,book.getId());
                pst.setString(2,book.getTitle());
                pst.setString(3,book.getAuthor());
                pst.setInt(4,book.getPrice());
                int count=pst.executeUpdate();
                System.out.println(count+ "row(s) affected");
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        public static void updateData(Connection con,String query,Book book){
            try{
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1,book.getPrice());
                pst.setString(2,book.getTitle());
                int count = pst.executeUpdate();
                System.out.println(count+" row(s) affected");
            }
            catch(SQLException e){
                e.printStackTrace();
            }

        }
        public static void deleteData(Connection con,String query,Book book){
            try{
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1,book.getId());
                int count = pst.executeUpdate();
                System.out.println(count+" row(s) affected");
            }
            catch(SQLDataException e){
                e.printStackTrace();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        public static void main(String args []){
            String url="jdbc:mysql://localhost:3306/library";
            String qselect="SELECT * FROM BOOK";
            String qinsert="INSERT into BOOK VALUES (?,?,?,?)";
            String uquery="UPDATE BOOK SET price=? WHERE title=?";
            String dquery="DELETE from BOOK WHERE id=?";
            Book book1=new Book(4,"Fandamentals of Physics","HCV",1000);
            Book book2=new Book();
            book2.setTitle("Elizabeth");
            book2.setPrice(330);

            Connection con = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                try {
                    System.out.println("Setting up connection....");
                    con = DriverManager.getConnection(url, "root", "bda123");
                    selectData(con,qselect);
                    System.out.println("----------------------------");
                    updateData(con,uquery,book2);
                    selectData(con,qselect);
                    System.out.println("----------------------------");
                    deleteData(con,dquery,book1);
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
