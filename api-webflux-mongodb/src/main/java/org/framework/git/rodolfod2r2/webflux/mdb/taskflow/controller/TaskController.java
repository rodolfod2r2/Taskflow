package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Task;
import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.service.TaskServiceImp;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/task")
public class TaskController {

    final
    TaskServiceImp taskServiceImp;

    public TaskController(TaskServiceImp taskServiceImp) {
        this.taskServiceImp = taskServiceImp;
    }

    @GetMapping
    public Flux<Task> getAllTask() {
        return taskServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Task> getTaskById(@PathVariable String id) {
        return taskServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Task> save(@RequestBody Task task) {
        return taskServiceImp.save(task);
    }

}
