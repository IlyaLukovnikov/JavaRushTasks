package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Child1", true, 15, new ArrayList<>());
        Human child2 = new Human("Child2", false, 8, new ArrayList<>());
        Human child3 = new Human("Child3", false, 20, new ArrayList<>());

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human Dad = new Human("Dad", true, 40, children);
        Human Mom = new Human("Mom", false, 39, children);

        ArrayList<Human> grandparantsChildren1 = new ArrayList<>();
        ArrayList<Human> grandparantsChildren2 = new ArrayList<>();
        grandparantsChildren1.add(Dad);
        grandparantsChildren2.add(Mom);

        Human grandDad1 = new Human("grandDad1", true, 68, grandparantsChildren1);
        Human grandMom1 = new Human("grandMom1", false, 65, grandparantsChildren1);

        Human grandDad2 = new Human("grandDad2", true, 70, grandparantsChildren1);
        Human grandMom2 = new Human("grandMom2", false, 67, grandparantsChildren1);


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(Dad);
        System.out.println(Mom);
        System.out.println(grandDad1);
        System.out.println(grandDad2);
        System.out.println(grandMom1);
        System.out.println(grandMom2);
    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
