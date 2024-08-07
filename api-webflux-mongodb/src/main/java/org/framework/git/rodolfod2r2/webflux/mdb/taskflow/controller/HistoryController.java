package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.History;
import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.service.HistoryServiceImp;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/history")
public class HistoryController {

    final
    HistoryServiceImp historyServiceImp;

    public HistoryController(HistoryServiceImp historyServiceImp) {
        this.historyServiceImp = historyServiceImp;
    }

    @GetMapping
    public Flux<History> getAllHistory() {
        return historyServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<History> getHistoryById(@PathVariable String id) {
        return historyServiceImp.findById(id);
    }

    @PostMapping
    public Mono<History> save(@RequestBody History history) {
        return historyServiceImp.save(history);
    }

}
