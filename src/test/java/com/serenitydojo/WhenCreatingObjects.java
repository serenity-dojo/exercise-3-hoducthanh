package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog();
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void creating_dog_method() {
        Dog fido = new Dog("Fido", "Bone", 5, "Woof");
        fido.makeNoise();
        System.out.println(fido.makeNoise());

        fido.feed("steaks");

        Assert.assertEquals(fido.getMakeNoise(), "Woof");
        Assert.assertTrue("Fido is fed", fido.isFed());
    }
}