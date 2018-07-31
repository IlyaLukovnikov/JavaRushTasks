package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    String name;
    int age;

    String getName(Dog dog){
        return this.name;
    }

    int getAge(Dog dog){
        return this.age;
    }

    void setName(String s){
        this.name = s;
    }
    void setAge(int a){
        this.age = a;
    }

    public static void main(String[] args) {

    }
}
