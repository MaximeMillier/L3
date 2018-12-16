import java.util.*;

class Puissance{

    public static boolean pow4(int n){
            while(n != 1){
                if(n % 4 != 0){
                    return false;
                }
                n /= 4;
            }
            return true;
        }

        public static boolean pow2(int n){
            while(n != 1){
                if(n % 2 != 0){
                    return false;
                }
                n /= 2;
            }
            return true;
        }

        
        public static void testPow(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(pow4(n)){
                System.out.println("4");
            }
            else if(pow2(n)){
                System.out.println("2");
            }
            else{
                System.out.println("0");
            }
        }

    public static void main(String[] args){
        
        Puissance.testPow();
    }
}