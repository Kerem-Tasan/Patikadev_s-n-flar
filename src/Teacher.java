public class Teacher {
    String Tname;
    int mpno;
    String branch;

    Teacher(String Tname, String branch, int mpno) {
        this.Tname = Tname;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print() {
        System.out.println("Adı\t:  " + this.Tname);
        System.out.println("Tel no\t:" + this.mpno);
        System.out.println("Bölümü\t:" + this.branch);
    }

}
