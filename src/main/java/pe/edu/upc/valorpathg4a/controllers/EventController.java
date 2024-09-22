package pe.edu.upc.valorpathg4a.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpathg4a.dtos.EventDTO;
import pe.edu.upc.valorpathg4a.entities.Event;
import pe.edu.upc.valorpathg4a.servicesinterfaces.IEventService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventController {
    @Autowired
    private IEventService eS;
    @GetMapping
    @PreAuthorize("hasAnyAuthority('PSICOLOGO', 'VETERANO')")
    public List<EventDTO> listar() {
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EventDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    @PreAuthorize("hasAnyAuthority('PSICOLOGO')")
    public void insertar(@RequestBody EventDTO edto) {
        ModelMapper m = new ModelMapper();
        Event e= m.map(edto, Event.class);
        eS.insert(e);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('PSICOLOGO')")
    public void eliminar(@PathVariable("id")Integer id){
        eS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('PSICOLOGO')")
    public void modificar(@RequestBody EventDTO edto) {
        ModelMapper m = new ModelMapper();
        Event e= m.map(edto, Event.class);
        eS.update(e);
    }

    @GetMapping("/busquedas")
    public List<EventDTO> BuscarEvento(@RequestParam String n) {
        return eS.buscar(n).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EventDTO.class);
        }).collect(Collectors.toList());
    }
}
