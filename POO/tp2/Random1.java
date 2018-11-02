package tp2;

import java.util.Random;
import java.lang.Math;

public class Random1{
  public static double random1(){
    return new Random().nextInt(50+1);
  }

  public static double random1Math(){
    return (int)(Math.random()*(50+1));
  }

  public static double random2(){
    return new Random().nextInt((50+1)-(-20+1))-(20-1);
  }

  public static double random2Math(){
    return (int)((Math.random()*(50+1-(-20+1)))-(20-1));
  }
  
  public static double random3(int a, int b){
	  return new Random().nextInt((b+1) - a) + a;
  }
  
  public static double randomEven(int a, int b){
	  return ((new Random().nextInt((b/2)+1 - (a/2)) + (a/2)) *2);
  }
  
  public static double randomN(int a, int b, int n){
	  return ((new Random().nextInt((int)Math.ceil((b/n)+1 - (a/n)) + (a/n)) *n));
  }
}

