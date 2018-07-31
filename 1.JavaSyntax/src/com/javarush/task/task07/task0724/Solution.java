package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human Anna = new Human("Anna", false, 21);
        Human Vasa = new Human("Vasa", true, 24);
        Human Masha = new Human("Masha", false, 22);
        Human Misha = new Human("Misha", true, 25);

        Human Arina = new Human("Arina", false, 5, Vasa, Anna);
        Human Dima = new Human("Dima", true, 6, Vasa, Anna);
        Human Marina = new Human("Marina", false, 3, Misha, Masha);
        Human Sveta = new Human("Sveta", false, 2, Misha, Masha);
        Human Alena = new Human("Alena", false, 5, Misha, Masha);

        System.out.println(Anna.toString());
        System.out.println(Vasa.toString());
        System.out.println(Masha.toString());
        System.out.println(Misha.toString());
        System.out.println(Arina.toString());
        System.out.println(Dima.toString());
        System.out.println(Marina.toString());
        System.out.println(Sveta.toString());
        System.out.println(Alena.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















