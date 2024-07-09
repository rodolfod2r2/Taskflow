package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.repository.TaskRepository;
import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Task;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImp implements GenericsInterfaceService<Task> {

    final
    TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Flux<Task> findAll() {
        return taskRepository.findAll();
    }

    public Mono<Task> findById(String id) {
        return taskRepository.findById(id);
    }

    public Mono<Task> save(Task task) {
        return taskRepository.save(task);
    }

}
