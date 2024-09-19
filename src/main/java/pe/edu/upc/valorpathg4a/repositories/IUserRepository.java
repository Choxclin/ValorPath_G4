package pe.edu.upc.valorpathg4a.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4a.entities.Users;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
    public Users findByUsername(String username);
}