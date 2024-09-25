package pe.edu.upc.valorpathg4a.servicesinterfaces;

import pe.edu.upc.valorpathg4a.entities.UseResources;
import pe.edu.upc.valorpathg4a.entities.Users;

import java.util.List;

public interface IUseResourcesService {
    public List<UseResources> listaruso();
    public void insert(UseResources useResources);
}
