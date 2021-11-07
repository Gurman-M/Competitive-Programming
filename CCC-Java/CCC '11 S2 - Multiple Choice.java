import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int questions = sc.nextInt();
    int count = 0;
    int correct = 0;
    ArrayList<String> student_ans = new ArrayList<String>();
    ArrayList<String> teacher_ans = new ArrayList<String>();
    

      while (count != questions) {
      String student_MC = sc.next();
      student_ans.add(student_MC);
      count++;
      }

     if (count == questions) {
       while (count != questions * 2) {
        String teacher_MC = sc.next(); 
        teacher_ans.add(teacher_MC);
        count++;
       }
      }

      
      for (int i = 0; i < questions; i++) {
          if(student_ans.get(i).equals(teacher_ans.get(i))) {
            correct++;
          }
      
   }


    System.out.println(correct);


  }
}
