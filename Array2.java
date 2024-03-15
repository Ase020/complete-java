class Student{
    int roll_no;
    String name;
    int marks;
}

public class Array2 {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.roll_no = 1;
        student1.name = "Felix";
        student1.marks = 321;

        Student student2 = new Student();
        student2.roll_no = 2;
        student2.name = "Shelby";
        student2.marks = 458;

        Student student3 = new Student();
        student3.roll_no = 3;
        student3.name = "Axelrod";
        student3.marks = 321;

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {
            System.out.println(student.name + ": " + student.marks);
        }

    }
}
