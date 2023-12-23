import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Ali", "TRH", "0123445111123");
        Teacher teacher_2 = new Teacher("Ahmet", "FZK", "123132131");
        Teacher teacher_3 = new Teacher("Ayşe", "BIO", "21313123123");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(teacher);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(teacher_2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(teacher_3);

        Student s1 = new Student("İnek Şaban", "4", "140144015", tarih, fizik, biyo);
        s1.addBulkExamNote(50, 20, 40);
        s1.addOralNote(100,100,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "4", "2211133", tarih, fizik, biyo);
        s2.addBulkExamNote(100, 50, 40);
        s2.addOralNote(85,100,70);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "4", "221121312", tarih, fizik, biyo);
        s3.addBulkExamNote(50, 20, 40);
        s3.addOralNote(100,75,90);
        s3.isPass();
    }
}
