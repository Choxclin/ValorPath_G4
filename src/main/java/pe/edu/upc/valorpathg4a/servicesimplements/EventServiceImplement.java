package pe.edu.upc.valorpathg4a.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpathg4a.entities.Event;
import pe.edu.upc.valorpathg4a.repositories.IEventRepository;
import pe.edu.upc.valorpathg4a.servicesinterfaces.IEventService;

import java.util.List;

@Service
public class EventServiceImplement implements IEventService {

    @Autowired
    private IEventRepository eR;

    @Override
    public List<Event> list() {
        return eR.findAll();
    }

    @Override
    public void insert(Event e) {
        eR.save(e);
    }


    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public void update(Event e) {
        eR.save(e);
    }

    @Override
    public List<Event> buscar(String nombre) {
        return List.of();
    }

    @Override
    public List<String[]> cantidadVeteranosporEvento() {
        return eR.quatityVeteransinEvent();
    }
}
