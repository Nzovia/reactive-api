package com.devnic.reactive_api.services;

import com.devnic.reactive_api.models.Tutorial;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Nicholas Nzovia
 * @On 19/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public interface TutorialService {
    Mono<Tutorial> saveTutorial(Tutorial tutorial);

    Flux<Tutorial> fetchAll();

    Mono<Tutorial> updateTutorial(Long id, Tutorial tutorial);

    Mono<Void> deleteTutorial(Long id);

    Mono<Tutorial> getTutorialById(Long id);
}
