package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.repository;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public interface ProjectRepository extends ReactiveMongoRepository<Project, String> {
}
