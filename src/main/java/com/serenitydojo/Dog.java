package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    public static String makeNoise;
    private boolean isFed;

    public Dog(String name, String favoriteToy, int age, String makeNoise) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        Dog.makeNoise = makeNoise;
    }

    public Dog() {
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
    public String getMakeNoise() {return makeNoise; }
    public void feed(String food) {
        System.out.println(name +" eat some " +food);
        this.isFed = true;
    }

    public boolean isFed() {
        return isFed;
    }
    public String makeNoise() { return makeNoise; }
}
