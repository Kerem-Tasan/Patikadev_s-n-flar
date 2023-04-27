public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String Classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String Classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.Classes = Classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulExamNote(int note1, int note2, int note3) {

        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
     void addSozluNote(int sozlu1, int sozlu2, int sozlu3) {
        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.sozlu = sozlu1;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.c2.sozlu = sozlu2;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.c3.sozlu = sozlu3;
        }
         
    void isPass(){
        System.out.println("=================");
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.avarage>55){
            System.out.println("Dersi geçtiniz.");
        }else{
            System.out.println("Dersten kaldınız!");
        }
        printNote();
    }
    void printNote() {

        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu:" + this.c3.note);
        System.out.println("Sozlu notunuz sırasıyla:"
        +this.c1.sozlu+","+
        +this.c2.sozlu+","+
        +this.c3.sozlu);
        System.out.println("Ortalamanız:" + this.avarage);

    }


}
