public class Ex8{

  public static boolean itsprime(int n){
    int count = 0;
    for (int i = 2; i< n/2+1; i++){
      if (n%i == 0){
        count+=1;
      }
    }
    if (count == 0){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String args[]){
    int count = 0;
    for(int i = 100; i <= 200; i++){
      if(itsprime(i)==true){
        System.out.printf("%d\n", i);
        count+=1;
      }
    }
  }
}
