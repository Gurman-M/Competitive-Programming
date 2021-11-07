import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
   // int c = sc.nextInt();
    //int d = sc.nextInt();
    int s = sc.nextInt();

    int Nsteps = 0;

    int Ndistance = 0;
    int Ndown = 0;

while (Nsteps != s) {

  if (Nsteps == s) {
       break;
     }

  if (Ndistance < a) {
     // while (Ndistance < a) {
        Ndistance++;
        Nsteps++;
     // }
    }

if (Ndown < b) {
     //  while (Ndown < b) {
        Ndistance--;
       // Ndown++;
     // }
     Nsteps++;

}

      Nsteps += Ndistance;
      System.out.println("steps");
       System.out.println(Nsteps);
       System.out.println("distance");
      System.out.println(Ndistance);
      System.out.println("steps back");
      System.out.println(Ndown);
      System.out.println("distance");
     
      
    }



}

}
