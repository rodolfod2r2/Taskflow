package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.repository;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Task;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public interface TaskRepository extends ReactiveMongoRepository<Task, String> {
}
