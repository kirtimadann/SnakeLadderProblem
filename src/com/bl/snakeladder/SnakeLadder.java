package com.bl.snakeladder;

public class SnakeLadder {

    int position = 0;
  static void dieRole(){
      int diaValue = (int)(Math.random()*10 % 6)+1;
      System.out.println(diaValue);

  }
  static  void  play(){
      int number =(int)(Math.random()*10%3);

      switch (number){

          case 0:
              System.out.println("No Player Move");
              break;
          case 1:
              System.out.println("Ladder the player moves ahead");
              break;
          case 2:
              System.out.println("Snake the player moves behind");
              break;
      }

  }
    public static void main(String[] args) {

             dieRole();
             play();
    }
}
