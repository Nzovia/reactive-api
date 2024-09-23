package com.devnic.reactive_api;

import reactor.core.publisher.Mono;
import org.junit.jupiter.api.Test;

/**
 * @author Nicholas Nzovia
 * @On 23/09/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public class MonoFluxTest {
    @Test
    public void monoTest(){
       Mono<?> monoString  =  Mono.just("Dev Nick")
               .then(Mono.error(new RuntimeException("Exception thrown")))
               .log();
       monoString.subscribe(System.out::println, (e)-> System.out.println(e.getMessage()));
    }
}
