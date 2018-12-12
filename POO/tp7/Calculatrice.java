import java.util.*;

class Calculatrice{

  public static int calcul(String tabStr[]){
    Stack<Integer> pile = new Stack<Integer>() ;
    int firstElement;
    int secondElement;

    for (String s : tabStr) {

      if(s.equals("-")){
        secondElement = pile.pop();
        firstElement = pile.pop();
        pile.push(firstElement - secondElement);
      }
      else if(s.equals("/")){
        secondElement = pile.pop();
        firstElement = pile.pop();
        pile.push(firstElement / secondElement);
      }
      else if(s.equals("+")){
        secondElement = pile.pop();
        firstElement = pile.pop();
        pile.push(firstElement + secondElement);
      }
      else if(s.equals("~")){
        firstElement = pile.pop();
        pile.push(-firstElement);
      }
      else if(s.equals("*")){
        secondElement = pile.pop();
        firstElement = pile.pop();
        pile.push(firstElement * secondElement);
      }
      else {
        pile.push(Integer.parseInt(s));
      }
    }

    return pile.pop();
  }


  public static int rechercheDichotomique(List<Integer> list, int e){
    Collections.sort(list);
    int length = list.size();
    int middle = (int) length / 2;
    if(list.get(middle) < e){
      rechercheDichotomique(list.subList(0,middle+1),e);
    }
    else if(list.get(middle) > e){
      rechercheDichotomique(list.subList(middle,length+1),e);
    }
    else{
      return middle;
    }
    return -1 ;
  }
}
