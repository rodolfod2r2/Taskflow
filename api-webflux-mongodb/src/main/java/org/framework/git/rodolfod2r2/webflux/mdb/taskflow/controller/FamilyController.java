package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Family;
import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.service.FamilyServiceImp;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/family")
public class FamilyController {

    final
    FamilyServiceImp familyServiceImp;

    public FamilyController(FamilyServiceImp familyServiceImp) {
        this.familyServiceImp = familyServiceImp;
    }

    @GetMapping
    public Flux<Family> getAllFamily() {
        return familyServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Family> getFamilyById(@PathVariable String id) {
        return familyServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Family> save(@RequestBody Family family) {
        return familyServiceImp.save(family);
    }

}
