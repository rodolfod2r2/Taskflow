package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Halo;
import com.github.rodolfod2r2.webflux.taskflow.service.HaloServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class HaloController {

    final
    HaloServiceImp haloServiceImp;

    public HaloController(HaloServiceImp haloServiceImp) {
        this.haloServiceImp = haloServiceImp;
    }

    @GetMapping(value = "/halo")
    public Flux<Halo> getAllHalo() {
        return haloServiceImp.findAll();
    }

    @GetMapping(value = "/halo/{id}")
    public Mono<Halo> getHaloById(@PathVariable String id) {
        return haloServiceImp.findById(id);
    }

    @PostMapping(value = "/halo")
    public Mono<Halo> save(@RequestBody Halo halo) {
        return haloServiceImp.save(halo);
    }

}
