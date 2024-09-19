package pe.edu.upc.valorpathg4a.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpathg4a.entities.Appointment;
import pe.edu.upc.valorpathg4a.repositories.IAppointmentRepository;
import pe.edu.upc.valorpathg4a.servicesinterfaces.IAppointmentService;

import java.util.List;

@Service
public class AppointmentServiceImplement implements IAppointmentService {
@Autowired
    private IAppointmentRepository aR;
    @Override
    public void insert(Appointment appointment) {
        aR.save(appointment);
    }

    @Override
    public void update(Appointment appointment) {
        aR.save(appointment);
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);
    }

    @Override
    public List<Appointment> list() {
        return aR.findAll();
    }

    @Override
    public Appointment listId(int id) {
        return aR.findById(id).orElse(new Appointment());
    }

    @Override
    public List<String[]> cantidadCitasAtendidasPorUsuarios() {
        return aR.quantityAppointmentsAttendedByUsers();
    }

    @Override
    public List<String[]> cantidadCitasAtendidasPorPsicologo() {
        return aR.quantityAppointmentsAttendedByUsers();
    }
}
