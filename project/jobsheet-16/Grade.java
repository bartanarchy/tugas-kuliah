public class Grade {
    Student student;
    Course course;
    double nilai;

    public Grade(Student student, Course course, double nilai) {
        this.student = student;
        this.course = course;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return student.nim + "\t" + student.nama + "\t" +
               course.nama + "\t" + course.sks + "\t" + nilai;
    }
}
