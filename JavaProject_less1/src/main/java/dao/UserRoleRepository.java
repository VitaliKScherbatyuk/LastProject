package dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.UserRole;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {

	@Query("select a.role from UserRole a, user b where b.userName=?1 and a.userId = b.userId")
	public List<String> findRolesByUserName(String username);
}
