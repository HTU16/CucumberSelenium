package com.krafttech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before    //cucumber.java olacak.
    public void setUp(){
        System.out.println("\tThis is coming from Before Method");
    }
                                                   // her bir senaryonun öncesinde ve sonrasında calışır..
    @After                                         // test başarısız olsa bile before after çalışır.
    public void tearDown(){
        System.out.println("\tThis is coming from After Method");

    }

    @Before("@GOT")
    public void setUpDb(){
        System.out.println("\t Connecting GOT");
    }
                                                 // parantez içinde seçtiğimiz tagların başında ve sonunda çalışır.
    @After("@GOT")
    public void tearDownDb(){
        System.out.println("\t Disconnecting GOT");
    }

}
