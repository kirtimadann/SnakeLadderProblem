package com.bl.snakeladder;

public class SnakeLadder {

    int position = 0;
   int dieRole(){
      int diaValue = (int)(Math.random()*10 % 6)+1;
      System.out.println(diaValue);
    return diaValue;
  }
   void  play() {

       while (position < 100) {


       int number = (int) (Math.random() * 10 % 3);
       int diaValue = dieRole();

       switch (number) {

           case 0:
               System.out.println("No Player Move");
               break;
           case 1:
               System.out.println("Ladder the player moves ahead");
               position = position + diaValue;
               break;
           case 2:
               System.out.println("Snake the player moves behind");
               position = position - diaValue;
               break;
           default:{
               System.out.println("Other option");
           }
       }
           System.out.println("position is :" + position);
   }
  }

  static void  WinPlay(){
      int winposision = 100;
  }
  public static void main(String[] args) {

      SnakeLadder obj = new SnakeLadder();

             obj.dieRole();
             obj.play();
    }

}
