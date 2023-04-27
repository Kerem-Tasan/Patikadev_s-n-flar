
public class Main {
public static void main(String[] args){
Fighter f1=new Fighter("A",10,120,100,40);
Fighter f2=new Fighter("B",20,80,90,35);

   Match match=new Match(f1,f2,100,90);
  match.run();
}
}

