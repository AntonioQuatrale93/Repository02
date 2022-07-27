package it.develhope.Repository02.repositories;

import it.develhope.Repository02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages")
public interface ProgrammingLanguagesRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
