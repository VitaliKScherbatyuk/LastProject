package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.PersonalData;


public interface PersonalDataRepository extends JpaRepository<PersonalData, Integer> {

}
