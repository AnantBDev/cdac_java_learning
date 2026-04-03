package Git_Java.cdac_java_learning.Java_OOPS.Student;

public class studentMain {
    public static void main(String[] args){
        // Creating student objects
        Student s1 = new Student("Krutik", 101, new int[]{85,90,88});
        Student s2 = new Student("Ranjan", 102, new int[]{78,82,91});
        Student s3 = new Student("Anmol", 201, new int[]{92,88,95});

        // Displaying total count
        Student.displayStudentCount();

        // Adding to the Department
        Student[] students = {s1, s2, s3};
        Department csDept = new Department(students);

        //Calculations
        System.out.println("Average Marks: " + csDept.calculateAverage());
        System.out.println("Average Percentage: " + csDept.calculatePercentage(500) + "%");

        // Testing toString
        System.out.println(s1);
    }
}
