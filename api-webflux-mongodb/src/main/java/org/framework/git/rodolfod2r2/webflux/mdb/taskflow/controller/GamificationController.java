package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Gamification;
import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.service.GamificationServiceImp;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/gamification")
public class GamificationController {

    final
    GamificationServiceImp gamificationServiceImp;

    public GamificationController(GamificationServiceImp gamificationServiceImp) {
        this.gamificationServiceImp = gamificationServiceImp;
    }

    @GetMapping
    public Flux<Gamification> getAllGamification() {
        return gamificationServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Gamification> getGamificationById(@PathVariable String id) {
        return gamificationServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Gamification> save(@RequestBody Gamification gamification) {
        return gamificationServiceImp.save(gamification);
    }

}
