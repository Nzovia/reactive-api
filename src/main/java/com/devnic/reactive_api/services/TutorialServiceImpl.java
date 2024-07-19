package com.devnic.reactive_api.services;

import com.devnic.reactive_api.models.Tutorial;
import com.devnic.reactive_api.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @author Nicholas Nzovia
 * @On 19/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

@Service
public class TutorialServiceImpl implements TutorialService {
    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public Mono<Tutorial> saveTutorial(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }

    @Override
    public Flux<Tutorial> fetchAll() {
        return tutorialRepository.findAll();
    }

    @Override
    public Mono<Tutorial> updateTutorial(Long id, Tutorial tutorial) {
        return tutorialRepository.findById(id).map(Optional::of)
                .defaultIfEmpty(Optional.empty())
                .flatMap(optionalTutorial -> {
                            if (optionalTutorial.isPresent()) {
                                tutorial.setId(id);
                                return tutorialRepository.save(tutorial);
                            }
                            return Mono.empty();
                        }
                );
    }

    @Override
    public Mono<Void> deleteTutorial(Long id) {
        return tutorialRepository.deleteById(id);
    }

    @Override
    public Mono<Tutorial> getTutorialById(Long id) {
        return null;
    }
}
