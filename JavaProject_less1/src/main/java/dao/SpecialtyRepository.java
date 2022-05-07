package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

}
