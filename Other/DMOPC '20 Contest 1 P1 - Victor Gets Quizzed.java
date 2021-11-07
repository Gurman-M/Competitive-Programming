import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int testcases = sc.nextInt();
    String q1 = "";
    while (count != testcases) {
     q1 = sc.next();
      count++;
    
    /*
    if (q1.contains("M") && q1.contains("C")) {String negative = ("NEGATIVE MARKS");}
    if (q1.contains("M") || q1.contains("C")) {String fail = ("FAIL");}
    else {String pass = ("PASS");}
    }
    */
    
    if (q1.contains("M") && q1.contains("C")) {System.out.println("NEGATIVE MARKS");}
    else if (q1.contains("M") || q1.contains("C")) {System.out.println("FAIL");}
    else {System.out.println("PASS");}
    
    }
  }
}
