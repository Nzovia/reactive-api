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

@Service
public class TutorialServiceImpl implements TutorialService{
    @Override
    public Mono<Tutorial> saveTutorial(Tutorial tutorial) {
        return null;
    }
    @Override
    public Flux<Tutorial> fetchAll() {
        return null;
    }
    @Override
    public Mono<Tutorial> updateTutorial(Long id, Tutorial tutorial) {
        return null;
    }
    @Override
    public Mono<Tutorial> deleteTutorial(Long id) {
        return null;
    }
    @Override
    public Mono<Tutorial> getTutorialById(Long id) {
        return null;
    }
}
