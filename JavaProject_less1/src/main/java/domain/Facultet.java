package domain;

import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "facultet")
public class Facultet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String facultetName; // назва факультету
	@Column
	private Set<Specialty> speciality; //перелік спеціальностей на факультеті
	@Column
	private Set<Subjects> subjects; // перлік предметів
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "subjectsScore")
	@MapKeyColumn(name = "subject_id")
	private Map<Subjects,Double> subjectsScore; //прохідний бал по предмету
	
	public Facultet() {

	}

	public Facultet(String facultetName, Map<Subjects, Double> subjectsScore) {
		super();
		this.facultetName = facultetName;
		this.subjectsScore = subjectsScore;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFacultetName() {
		return facultetName;
	}

	public void setFacultetName(String facultetName) {
		this.facultetName = facultetName;
	}

	public Set<Specialty> getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Set<Specialty> speciality) {
		this.speciality = speciality;
	}

	public Set<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}

	public Map<Subjects, Double> getSubjectsScore() {
		return subjectsScore;
	}

	public void setSubjectsScore(Map<Subjects, Double> subjectsScore) {
		this.subjectsScore = subjectsScore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultetName == null) ? 0 : facultetName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((speciality == null) ? 0 : speciality.hashCode());
		result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
		result = prime * result + ((subjectsScore == null) ? 0 : subjectsScore.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Facultet other = (Facultet) obj;
		if (facultetName == null) {
			if (other.facultetName != null)
				return false;
		} else if (!facultetName.equals(other.facultetName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (speciality == null) {
			if (other.speciality != null)
				return false;
		} else if (!speciality.equals(other.speciality))
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		if (subjectsScore == null) {
			if (other.subjectsScore != null)
				return false;
		} else if (!subjectsScore.equals(other.subjectsScore))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Facultet [id=" + id + ", facultetName=" + facultetName + ", speciality=" + speciality + ", subjects="
				+ subjects + ", subjectsScore=" + subjectsScore + "]";
	}

	
	
}
