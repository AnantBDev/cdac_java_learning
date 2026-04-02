package com.day1.models;

public class Date implements Cloneable{
    private int day;
    private String month;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date(){
        day=1;
        month="Jan";
        year=1960;
    }
    
    public Date(int day, String month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDate(int d, String m, int y){
        day=d;
        month=m;
        year=y;
    }

    public void setDay(int day){
        if(day>0){
            this.day=day;
        }
    }

    public int getDay(){
        return day;
    }

    public String toString(){
        return day+"/"+month+"/"+year;
    }

    public void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
