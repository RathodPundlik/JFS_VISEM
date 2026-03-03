import java.util.Scanner;
public class CountDigits{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int ec = 0, oc = 0, ac = 0;

    System.out.print("Enter Roll No: ");
    String rollNo = sc.nextLine();

    if(rollNo.length() == 10){
      System.out.println("\nValid Roll Number\n");
      for(char ch: rollNo.toCharArray()){
        if(Character.isLetter(ch)) ac++;
        else{
          if((ch-48)%2 == 0) ec++;
          else oc++;
        }
      }
      System.out.println("Number of Odd Digits: "+oc);
      System.out.println("Number of Even Digits: "+ec);
      System.out.println("Number of Aplhabets: "+ac);
    }
    else System.out.println("\nNot a Valid Roll Number...\nTry again...");
  }
}