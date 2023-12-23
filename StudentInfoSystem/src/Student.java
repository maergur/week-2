public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student (String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3)
    {
        if(note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }

    }

    void addOralNote(int note1, int note2, int note3)
    {
        if(note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }

    }
    void isPass () {
        calculateAvg();
        if (this.average > 55) {
            System.out.println("Hababam sınıfı uyanıyor!");
        }
        else {
            System.out.println("Hababam sınıfı, sınıfta kaldı!");
        }
    }

    void calculateAvg () {
        this.average = (this.c1.note * 0.8 + this.c1.oral * 0.2 +
                this.c2.note * 0.7 + this.c2.oral * 0.3
                + this.c3.note * 0.65 +this.c3.oral * 0.35) / 3.0;

    }
    void printNote() {

        System.out.println(c1.name + " Notu: " + c1.note);
        System.out.println(c2.name + " Notu: " + c2.note);
        System.out.println(c3.name + " Notu: " + c3.note);

    }

}
