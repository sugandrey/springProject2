package org.example;

import org.springframework.transaction.annotation.Transactional;

public class Test2 {

    @Transactional
    public int doSomething2(boolean isTrue, int number) {
        if (!isTrue) {
            throw new RuntimeException("Rollback!");
        }
        else {
            return number;
        }
    }
}
