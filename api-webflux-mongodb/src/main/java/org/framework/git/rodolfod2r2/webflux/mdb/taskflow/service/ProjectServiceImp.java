package org.framework.git.rodolfod2r2.webflux.mdb.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.repository.ProjectRepository;
import org.framework.git.rodolfod2r2.webflux.mdb.taskflow.document.Project;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProjectServiceImp implements GenericsInterfaceService<Project> {

    final
    ProjectRepository projectRepository;

    public ProjectServiceImp(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Flux<Project> findAll() {
        return projectRepository.findAll();
    }

    public Mono<Project> findById(String id) {
        return projectRepository.findById(id);
    }

    public Mono<Project> save(Project project) {
        return projectRepository.save(project);
    }

}