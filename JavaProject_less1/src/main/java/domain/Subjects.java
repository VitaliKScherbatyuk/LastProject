package domain;

public class Subjects {

	private Integer id;
	private String subjectsName; // назва предмету
	private Integer filter; // прохідний поріг для ЗНО
	
	public Subjects() {
	}

	public Subjects(String subjectsName, Integer filter) {
		super();
		this.subjectsName = subjectsName;
		this.filter = filter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubjectsName() {
		return subjectsName;
	}

	public void setSubjectsName(String subjectsName) {
		this.subjectsName = subjectsName;
	}

	public Integer getFilter() {
		return filter;
	}

	public void setFilter(Integer filter) {
		this.filter = filter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filter == null) ? 0 : filter.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((subjectsName == null) ? 0 : subjectsName.hashCode());
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
		Subjects other = (Subjects) obj;
		if (filter == null) {
			if (other.filter != null)
				return false;
		} else if (!filter.equals(other.filter))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (subjectsName == null) {
			if (other.subjectsName != null)
				return false;
		} else if (!subjectsName.equals(other.subjectsName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", subjectsName=" + subjectsName + ", filter=" + filter + "]";
	}

}
