package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listOfEntrants")
public class ListOfEntrants {

	@Id
	@Column
	private Integer id;
	@Column
	private Double totalScore; // загальний бал
	@Column
	private boolean counting; // зарахування
	
	public ListOfEntrants() {
	}

	public ListOfEntrants(Double totalScore, boolean counting) {
		this.totalScore = totalScore;
		this.counting = counting;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}

	public boolean isCounting() {
		return counting;
	}

	public void setCounting(boolean counting) {
		this.counting = counting;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (counting ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((totalScore == null) ? 0 : totalScore.hashCode());
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
		ListOfEntrants other = (ListOfEntrants) obj;
		if (counting != other.counting)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (totalScore == null) {
			if (other.totalScore != null)
				return false;
		} else if (!totalScore.equals(other.totalScore))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListOfEntrants [id=" + id + ", totalScore=" + totalScore + ", counting=" + counting + "]";
	}
		
}
