package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Dog.DOG_NOISE;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void creating_dog_method() {
        Dog fido = new Dog("Fido", "Bone", 5);
        fido.makeNoise();
        System.out.println(DOG_NOISE);

        fido.feed("steaks");

            Assert.assertTrue("Fido is not fed", fido.isFed());
    }
}