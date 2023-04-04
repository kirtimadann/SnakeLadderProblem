package com.bl.snakeladder;

public class SnakeLadder {

    int position = 0;
  static void dieRole(){

      int diaValue = (int)(Math.random()*10 % 6)+1;
      System.out.println(diaValue);

  }
    public static void main(String[] args) {

             dieRole();
    }
}
