public class Ex5{
  public static void main(String args[]){
    String s = "atrapalham ";
    System.out.printf("1 Java atrapalha muita gente\n");
    for (int i = 2; i<=100; i++){
      s = s+"atrapalham ";
      System.out.printf("%d Java %smuita gente\n", i, s);
    }
  }
}
