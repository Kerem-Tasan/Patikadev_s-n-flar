public class Employee {
    String name;
    double maas;
    String lastName;
    int workHours;
    int hireYear;
    double bonus=0;
    double tax=0;
    double salaryIncrease=0;
    double total=0;
    Employee(String name,String lastName ,int maas ,int workHours, int hireYear) {
        this.name = name;
        this.lastName=lastName;
        this.maas = maas;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void addSalary() {
        if (maas > 1000) {
            this.tax = (this.maas * 0.03);

        }


        if (workHours > 40) {
            this.bonus = (workHours - 40) * 30;
        } else {
            this.bonus = 0;
        }


        if (2021 - hireYear <= 10) {
            this.salaryIncrease = (this.maas * 0.05);
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            this.salaryIncrease = (this.maas * 0.10);
        } else if (2021 - hireYear > 19) {
            this.salaryIncrease = (this.maas * 0.15);

        }
         this.total=(this.maas-this.tax+this.bonus+this.salaryIncrease);
        yazdir();
    }
    void yazdir(){
        System.out.println(this.name+" "+this.lastName+" adlı çalışana ait bilgiler.");
        System.out.println("Maaşı\t:"+this.maas);
        System.out.println("Haftalık çalışma saati\t:"+this.workHours);
        System.out.println("İşe alınma tarihi\t:"+this.hireYear);
        System.out.println("Alınan vergi\t:"+this.tax);
        System.out.println("Verilen bonus\t:"+this.bonus);
        System.out.println("Yapılan zam\t:"+this.salaryIncrease);
        System.out.println("Toplam maaş\t:"+this.total);

    }
}
