package pe.edu.upc.valorpathg4a.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4a.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
