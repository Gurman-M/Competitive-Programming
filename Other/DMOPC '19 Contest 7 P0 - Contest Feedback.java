import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
  public static void main(String[] args) throws Exception{


    Scanner sc = new Scanner(System.in);


    double a_score = sc.nextDouble();
    double b_score = sc.nextDouble();
    double c_score = sc.nextDouble();
    double d_score = sc.nextDouble();

    String err_msg = "Value must be in between 1 and 10.";

    if (a_score > 10) {
      throw new Exception(err_msg);
    } else if (a_score < 0) {
      throw new Exception(err_msg);
    }

    
    if (b_score > 10) {
      throw new Exception(err_msg);
    } else if (b_score < 0) {
      throw new Exception(err_msg);
    }

    
    if (c_score > 10) {
      throw new Exception(err_msg);
    } else if (c_score < 0) {
      throw new Exception(err_msg);
    }

    
    if (d_score > 10) {
      throw new Exception(err_msg);
    } else if (d_score < 0) {
      throw new Exception(err_msg);
    }
 
    averages(a_score, b_score, c_score, d_score);
  }

  public static void averages (double a, double b, double c, double d) {
    
    DecimalFormat df = new DecimalFormat("0.000000");

    double avg_ab = (a + b)/2;
    double avg_ac = (a + c)/2;
    double avg_ad = (a + d)/2;
    double avg_bc = (b + c)/2;
    double avg_bd = (b + d)/2;
    double avg_cd = (c + d)/2;

    double avg_abc = (a + b + c)/3;
    double avg_abd = (a + b + d)/3;
    double avg_acd = (a + c + d)/3;
    double avg_bcd = (b + c + d)/3;

    double avg_abcd = (a + b + c + d)/4;

    System.out.println(df.format(avg_ab));
    System.out.println(df.format(avg_ac));
    System.out.println(df.format(avg_ad));
    System.out.println(df.format(avg_bc));
    System.out.println(df.format(avg_bd));
    System.out.println(df.format(avg_cd));

    System.out.println(df.format(avg_abc));
    System.out.println(df.format(avg_abd));
    System.out.println(df.format(avg_acd));
    System.out.println(df.format(avg_bcd));

    System.out.println(df.format(avg_abcd));
  }
}
