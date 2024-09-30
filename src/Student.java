import java.util.ArrayList;
import java.util.List;

public final class Student {
    private List<Integer> grades = new ArrayList<>();

    String name;
    private final int minGrade;
    private final int maxGrade;

    public Student(String name, int minGrade, int maxGrade) {
        this.minGrade = minGrade;
        this.maxGrade = maxGrade;
    }
    public void addGrade(int grade) {
        if (grade >= minGrade && grade <= maxGrade)
            grades.add(grade);
    }
    public String toString() {
        return "Student{" + " grades =" + grades + ", name" + name + '}';
    }
    public void GetStudent(){
        System.out.println("Оценки студента");
    }
}
