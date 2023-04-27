public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", 555);
        Teacher t2 = new Teacher("Kerem", "FZK", 0000);
        Teacher t3 = new Teacher("Samet", "BIO", 1011);


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biolgy = new Course("Biology", "101", "BIO");
        biolgy.addTeacher(t3);


        Student s1 = new Student("Kerem", "123", "4", tarih, fizik, biolgy);
        s1.addSozluNote(50,50,50);
        s1.addBulExamNote(100, 40, 90);
        s1.isPass();

        Student s2=new Student("Samet","321","4",tarih,fizik,biolgy);
        s2.addSozluNote(70,70,90);
        s2.addBulExamNote(90,80,100);
        s2.isPass();
    }
}
