package pe.edu.upc.valorpathg4a.repositories;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4a.entities.UseResources;

@Repository
public interface IUseResourceRepository extends JpaRepository<UseResources,Integer> {
}
