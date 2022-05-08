package domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "specialty")
public class Specialty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "specialty_id")
	private Integer id;
	@Column
	private String specialityName; // назва спеціальності на фікультеті
	@Column
	private Integer numberOfEntrants; // кількість абітурієнтів на факультеті
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "specialty")
	@Column(nullable = false)
	private Set<Subjects> subjects; // предмети у фільтрі
	
	
	public Specialty() {
	}

	public Specialty(String specialityName, Integer numberOfEntrants, Set<Subjects> subjects) {
		this.specialityName = specialityName;
		this.numberOfEntrants = numberOfEntrants;
		this.subjects = subjects;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpecialityName() {
		return specialityName;
	}

	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}

	public Integer getNumberOfEntrants() {
		return numberOfEntrants;
	}

	public void setNumberOfEntrants(Integer numberOfEntrants) {
		this.numberOfEntrants = numberOfEntrants;
	}

	public Set<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numberOfEntrants == null) ? 0 : numberOfEntrants.hashCode());
		result = prime * result + ((specialityName == null) ? 0 : specialityName.hashCode());
		result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
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
		Specialty other = (Specialty) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberOfEntrants == null) {
			if (other.numberOfEntrants != null)
				return false;
		} else if (!numberOfEntrants.equals(other.numberOfEntrants))
			return false;
		if (specialityName == null) {
			if (other.specialityName != null)
				return false;
		} else if (!specialityName.equals(other.specialityName))
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Specialty [id=" + id + ", specialityName=" + specialityName + ", numberOfEntrants=" + numberOfEntrants
				+ ", subjects=" + subjects + "]";
	}
	
	
	
}
