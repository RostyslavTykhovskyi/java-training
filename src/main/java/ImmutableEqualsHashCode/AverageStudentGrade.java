package ImmutableEqualsHashCode;

public class AverageStudentGrade {
    private final double averageGrade;
    private final Student student;

    public AverageStudentGrade(double averageGrade, Student student) {
        this.averageGrade = averageGrade;
        this.student = new Student(student.getName(), student.getAge(), student.getGroup());
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public Student getStudent() {
        return new Student(student.getName(), student.getAge(), student.getGroup());
    }
}
