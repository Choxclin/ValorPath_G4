package pe.edu.upc.valorpathg4a.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4a.entities.Event;

import java.util.List;

@Repository
public interface IEventRepository extends JpaRepository<Event, Integer> {
    @Query(value = "SELECT u.id AS userId, COUNT(u.Id) as userxEvent \n"+
            "From users u \n" +
            "JOIN event e \n" +
            "ON u.id = e.veteran_id \n" +
            "GROUP BY desc",nativeQuery = true)
    public List<String[]> quatityVeteransinEvent();

    @Query(value = "SELECT e.id AS eventId, COUNT(e.Id) as qpsicoevent \n"+
            "From event e \n" +
            "JOIN users u \n" +
            "ON e.id = e.veteran_id \n" +
            "GROUP BY desc",nativeQuery = true)
    public List<String[]> quatityPsicoEvent();
    public List<String[]> cantidadVeteranosporEvento();
}
