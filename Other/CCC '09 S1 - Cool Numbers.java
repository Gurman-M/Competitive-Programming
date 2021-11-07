import java.util.*;
import java.lang.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;

    int cubeA = (int) Math.cbrt(a); //finds cube root of starting num
    int cubeB = (int) Math.cbrt(b); //finds cube root of ending num

    for (int i = cubeA; i <= cubeB; i++) {
      double num = i*i*i;
      if (num >= a) {
        if (Math.sqrt(num) % 1 == 0)
        count++;
      }
    }

    System.out.println(count);
   

    }
  }
