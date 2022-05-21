import java.util.Scanner;
public class CoffeeMachine
{
  int coffeeCups = 50;
  int coffeePrice = 10;
  int machineCash = 200;
  boolean noCups(){
    if(coffeeCups>0) return true;
    else return false;
  }
  void makeCoffee(){
    coffeeCups=-1;
    addCash(coffeePrice);
  }
  void addCash(int money ){
    machineCash+=money
  }
  void addCoffeeCups(int cups){
    coffeeCups+=cups;
  }
    void despence(){
      if(noCups){
        status();
        return "no cups"
      } 
      makeCoffee()
      status();
      return "making coffee"
    }
    void status(){
      if(noCups) system.out.println('sorry there is no cups')
      else system.out.println('making coffee :) \n Hava a great day')
    }
    public static void main(String args[]){
    }
}
