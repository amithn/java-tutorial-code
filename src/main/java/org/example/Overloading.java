package org.example;

public class Overloading {

    public Overloading() {}

    public Overloading(int x) {
    }

    public Overloading(String s) {}
    public static int add(int first, int second) {
        return first + second;
    }

    public static String add(String firstname, String secondname) {
        return firstname + " " + secondname;
    }

    public static String add(String name, int age) {
        return name + " is " + age + "old";
    }


    public static void main(String[] args) {

        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading(199);
        Overloading o3 = new Overloading("Michu");

        System.out.println("Add these " + add(100, 200));
        System.out.println("Add these " + add("Amith", "Nambiar"));
        System.out.println("Add these " + add("Amith", 20));
    }
}
