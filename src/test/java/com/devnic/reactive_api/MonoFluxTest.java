package com.devnic.reactive_api;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @Test
    public void fluxtest(){
        Flux<String> stringFlux = Flux.just("Spring","SpringBoot", "Hibernate")
                .concatWith(Flux.error(new RuntimeException("Exception thrown")))
                .log();
        stringFlux.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }
}
