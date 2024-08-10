package com.devnic.reactive_api.controllers;

import com.devnic.reactive_api.models.Tutorial;
import com.devnic.reactive_api.services.TutorialService;
import com.devnic.reactive_api.services.TutorialServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Nicholas Nzovia
 * @On 19/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

@RestController
@RequestMapping("/api/v1/tutorial")
public class TutorialController {
    private final TutorialService tutorialService;

    public TutorialController(TutorialServiceImpl tutorialService) {
        this.tutorialService = tutorialService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Tutorial> saveTutorial(@RequestBody Tutorial tutorial) {
        return tutorialService.saveTutorial(tutorial);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<Tutorial> getAllTutorials() {
        return tutorialService.fetchAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Tutorial> getTutorialById(@PathVariable Long id){
        return tutorialService.getTutorialById(id);
    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Tutorial> updateTutorial(@PathVariable Long id, @RequestBody Tutorial tutorial) {
        return tutorialService.updateTutorial(id, tutorial);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteTutorial(@PathVariable Long id){
        return tutorialService.deleteTutorial(id);
    }
}
