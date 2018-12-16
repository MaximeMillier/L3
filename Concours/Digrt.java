import java.util.*;

class Digrt{

  public static void digroot(){
    Scanner sc = new Scanner (System.in);
    int mod,rest,number = 0;
    int res = 0;
    while((number = sc.nextInt()) != 0){
      while(number > 9){
        res = 0;
        mod = number % 10 ;
        rest = number / 10;
        while(mod != 0){
          res += mod;
          mod = rest % 10;
          rest /= 10;
       }
       number = res;
      }
      System.out.println(res);
    }
    return;
  }
  
  public static void main(String[] args) {
    Digrt.digroot();
  }
}
