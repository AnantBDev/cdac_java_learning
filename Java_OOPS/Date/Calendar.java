package Git_Java.cdac_java_learning.Java_OOPS.Date;
public class Calendar {
    public static void main(String[] args){
        int i = 10;
        Date d1 = new Date();  // Creating an Instance of Date, Object is created in the Heap 
        Date d3 = new Date(12, "Jan", 1991);

        d1.setDate(10, "Jul", 2003);
        Date d2 = d1;
       
        System.out.println(i);
        System.out.println(d3);

        d3.setDay(-1);
        d1.displayDate();
        d2.displayDate();
        d3.displayDate();
    }
}