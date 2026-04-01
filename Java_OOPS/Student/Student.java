package Git_Java.cdac_java_learning.Java_OOPS.Student;

public class Student{
    private String name;
    private int rollno;
    private int[] marks;
    private int totalMarks;
    private static int count = 0;
    
    // DEFAULT CONSTRUCTOR
    public Student(){
            rollno = 1;
            name = "Anthony";
            marks = new int[]{12,45,60};
            totalMarks = marks[0] + marks[1] + marks[2];
            count++;
        }

    // PARAMETERIZED CONSTRUCTOR
    public Student(String name, int rollno, int[] marks){
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
            this.totalMarks = 0;
            count++;
    }

    // GETTERS AND SETTERS
    public void setName(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setRollNo(int rollno){
        this.rollno = rollno;
    }
    public int getrollno(){
        return rollno;
    }

    public void setMarks(int[] marks){
        this.marks = marks;
        totalMarks = 0;
        for(int m : marks) { 
            totalMarks += m;
        }
    }
    public int[] getMarks(){
        return marks;
    }
    
    public int getTotalMarks(){
        return totalMarks;
    }

    public static void displayStudentCount(){
        System.out.println("Total no of students: " + count);
    }
    public double calculateAverage(){
        double total = 0.0;
        for(int mark: marks){
            total += mark;
        }
        return total/marks.length;
    }
    public double calculatePercentage(){
        double total = 0.0;
        for(int mark: marks){
            total += mark;
        }
        return (total / marks.length) / 100 * 100;
        
    }

    // Method to Display
    @Override
    public String toString(){
        return "Roll no: " + rollno + " , Name: " + name + " , Total Marks: " + marks;
    }
}
