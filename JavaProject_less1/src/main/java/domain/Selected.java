package domain;

import java.util.Map;

import javax.security.auth.Subject;

public class Selected {
// корзина
	private Integer id;
	private PersonalData personalData;
	private Specialty specialty;
	private Map<Subject, Integer> znoScore;
	private ListOfEntrants listOfEntrants;
	
	public Selected() {
	}

	public Selected(PersonalData personalData, Specialty specialty, Map<Subject, Integer> znoScore,
			ListOfEntrants listOfEntrants) {
		super();
		this.personalData = personalData;
		this.specialty = specialty;
		this.znoScore = znoScore;
		this.listOfEntrants = listOfEntrants;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public Map<Subject, Integer> getZnoScore() {
		return znoScore;
	}

	public void setZnoScore(Map<Subject, Integer> znoScore) {
		this.znoScore = znoScore;
	}

	public ListOfEntrants getListOfEntrants() {
		return listOfEntrants;
	}

	public void setListOfEntrants(ListOfEntrants listOfEntrants) {
		this.listOfEntrants = listOfEntrants;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listOfEntrants == null) ? 0 : listOfEntrants.hashCode());
		result = prime * result + ((personalData == null) ? 0 : personalData.hashCode());
		result = prime * result + ((specialty == null) ? 0 : specialty.hashCode());
		result = prime * result + ((znoScore == null) ? 0 : znoScore.hashCode());
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
		Selected other = (Selected) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listOfEntrants == null) {
			if (other.listOfEntrants != null)
				return false;
		} else if (!listOfEntrants.equals(other.listOfEntrants))
			return false;
		if (personalData == null) {
			if (other.personalData != null)
				return false;
		} else if (!personalData.equals(other.personalData))
			return false;
		if (specialty == null) {
			if (other.specialty != null)
				return false;
		} else if (!specialty.equals(other.specialty))
			return false;
		if (znoScore == null) {
			if (other.znoScore != null)
				return false;
		} else if (!znoScore.equals(other.znoScore))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Selected [id=" + id + ", personalData=" + personalData + ", specialty=" + specialty + ", znoScore="
				+ znoScore + ", listOfEntrants=" + listOfEntrants + "]";
	}
	
}
