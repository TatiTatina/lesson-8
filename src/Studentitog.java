public class Studentitog {
    public  static void main(String[] args) {

        String Student1 = "Ivan Ivanov";
        String Student2 = "Evgenij Petrov";

        Student firstStudent = new Student(Student1);
        Student secondStudent = new Student(Student2);

        firstStudent.addGrade(2);
        firstStudent.addGrade(5);
        secondStudent.addGrade(5);
        secondStudent.addGrade(3);

        System.out.println(firstStudent);
        System.out.println(secondStudent);

        firstStudent.toString();
        secondStudent.toString();

        firstStudent.GetStudent();
        secondStudent.GetStudent();
    }
}
