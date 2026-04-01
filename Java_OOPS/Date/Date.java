package Git_Java.cdac_java_learning.Java_OOPS.Date;
public class Date {

    private int day;
    private String month;
    private int year;

    public Date(){
            day = 1;
            month = "Apr";
            year = 2001;
        }
        
    // Constructor: Initialization of attributes
    public Date(int day, String month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
    }

    
    public void setDate(int d, String m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    public void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }

    public void setDay(int day){
        if (day>0){
            this.day = day;
        }
    }

    public void setMonth(String month){
        this.month = month;
    }

    public String getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public int getDay(){
        return day;
    }

    @Override
    public String toString(){
        return "Date {" + " day = " + day + ", month = " + month +"/"+ ", year = "+ year + "}";
    }
}
