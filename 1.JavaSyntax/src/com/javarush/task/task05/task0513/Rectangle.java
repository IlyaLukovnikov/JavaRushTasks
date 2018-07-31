package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
   private int top = 0, left = 0, width = 0, height = 0;

   public void initialize(int top, int left, int width, int height){
       this.top = top;
       this.left = left;
       this.width = width;
       this.height = height;
   }
   public void initialize(int top, int left){
       this.top = top;
       this.left = left;
   }
   public void initialize(int top, int left, int width){
       this.top = top;
       this.left = left;
       this.width = width;
       this.height = width;
   }

   public void initialize(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.height = rectangle.height;
        this.width = rectangle.width;
   }
    public static void main(String[] args) {

    }
}
