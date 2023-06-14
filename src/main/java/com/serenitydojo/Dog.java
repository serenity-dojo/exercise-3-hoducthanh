package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;
    public static final String DOG_NOISE = "WOOF WOOF!!";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public int getAge() {
        return age;
    }
    public void makeNoise() {
        System.out.println("Woof");
    }
    public void feed(String food) {
        System.out.println(name +" eat some " +food);
        this.isFed = true;
    }
    public boolean isFed() { return isFed; }

}
