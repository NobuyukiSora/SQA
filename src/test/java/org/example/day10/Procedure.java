package org.example.day10;

import org.testng.annotations.*;

public class Procedure {
    @Test
    public void test() {
        System.out.println("test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void beforeMethode() {
        System.out.println("beforeMethode");
    }

    @Test
    public void testOne() {
        System.out.println("testOne");
    }

    @Test
    public void testTwo() {
        System.out.println("testTwo");
    }

    @AfterClass // untuk clean data
    public void aftarClass() {
        System.out.println("aftarClass");
    }
    @AfterMethod // untuk screenshot
    public void afterMethode() {
        System.out.println("afterMethode");
    }
}
