import java.util.*;

class TestCalculatrice{

  public static void main(String[] args) {
    String[] str = {"12","5", "4", "+", "3","-", "*"};

    System.out.println(Calculatrice.calcul(str));

    List<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(7);
    list.add(2);
    list.add(5);
    list.add(19);
    list.add(1);

    System.out.println(Calculatrice.rechercheDichotomique(list,2));
  }
}
