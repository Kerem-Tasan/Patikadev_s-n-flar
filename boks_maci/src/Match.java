public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;


    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {

        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }

    void run() {

        if (isCheck()) {
            System.out.println(this.f1.name + " boksörünün hasarı " + this.f1.damage + " canı " + this.f1.health
                    + "\n" + this.f2.name + " boksörünün hasarı " + this.f2.damage + " canı " + this.f2.health);

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==NEW RAUND==");
              if(isStart()==true){
                  f2.health = f1.hit(f2);
                  if (isWin()) {
                      break;
                  }
                  f1.health = f2.hit(this.f1);
                  if (isWin()) {
                      break;
                  }

              }
              else{
                  f1.health = f2.hit(f1);
                  if (isWin()) {
                      break;
                  }
                  f2.health = f1.hit(this.f2);
                  if (isWin()) {
                      break;
                  }

              }



                System.out.println(this.f1.name + "'nın canı\t" + this.f1.health + "\t" + this.f2.name + "'nın canı \t" + this.f2.health);
            }
        } else {
            System.out.println("Sikletler uyuşmuyor!");
        }
    }

    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }

        return false;

    }

    boolean isStart() {
        double start = Math.random() * 100;
        if (start > 50) {
            System.out.println("A sporcusu başlayacak.");
            return true;
        } else {
            System.out.println("B sporcusu başlayacak");
            return false;
        }

    }

}
