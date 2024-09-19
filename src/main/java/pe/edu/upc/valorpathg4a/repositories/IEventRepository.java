package pe.edu.upc.valorpathg4a.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4a.entities.Event;

@Repository
public interface IEventRepository extends JpaRepository<Event, Integer> {
}
