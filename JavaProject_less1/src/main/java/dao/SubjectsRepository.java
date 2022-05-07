package dao;

import javax.security.auth.Subject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<Subject, Integer> {

}
