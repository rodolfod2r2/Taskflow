package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.repository;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Remark;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public interface RemarkRepository extends ReactiveMongoRepository<Remark, String> {
}
