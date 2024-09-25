package pe.edu.upc.valorpathg4a.servicesinterfaces;


import pe.edu.upc.valorpathg4a.entities.Event;

import java.util.List;

public interface IEventService {

    public List<Event> list();
    public void insert(Event e);
    public void delete(int id);
    public void update(Event e);
    public List<Event>buscar(String nombre);
   // public List<String[]> cantidadVeteranosporEvento();
    //public List<String[]> cantidadEventoporPsicologo();
}
