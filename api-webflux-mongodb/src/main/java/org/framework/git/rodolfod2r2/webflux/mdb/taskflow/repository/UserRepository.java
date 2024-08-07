package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.repository;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
