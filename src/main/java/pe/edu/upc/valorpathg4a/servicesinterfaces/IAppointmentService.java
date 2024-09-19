package pe.edu.upc.valorpathg4a.servicesinterfaces;



import pe.edu.upc.valorpathg4a.entities.Appointment;

import java.util.List;

public interface IAppointmentService {
    public void insert (Appointment appointment);
    public void update (Appointment appointment);
    public void delete (int id);
    public List<Appointment> list();
    public Appointment listId (int id);
    public List<String[]> cantidadCitasAtendidasPorUsuarios();
    public List<String[]> cantidadCitasAtendidasPorPsicologo();
}
