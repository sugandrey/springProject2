package org.example;

import org.springframework.transaction.annotation.Transactional;

public class Test1 {

    @Transactional
    public void doSomething1() {
        System.out.println("I do something useful");
    }
}
