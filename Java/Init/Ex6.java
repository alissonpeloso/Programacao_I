import java.util.*;

public class Ex6{
  public static void main(String args[]){
    Calendar cal = Calendar.getInstance();
    int tyear = cal.get(Calendar.YEAR);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Em que ano você nasceu? ");
    int year = scanner.nextInt();
    System.out.println("Ok, então você tem "+(tyear-year)+" anos!");
  }
}
