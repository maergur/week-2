public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double oral;
    int note;

    Course (String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
        }
        else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
        }
    }
    void printTeacherInfo() {
        this.teacher.print();
    }
}
