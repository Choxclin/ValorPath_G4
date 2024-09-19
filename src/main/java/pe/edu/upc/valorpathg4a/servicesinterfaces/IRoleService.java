package pe.edu.upc.valorpathg4a.servicesinterfaces;


import pe.edu.upc.valorpathg4a.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Integer idRol);

    public Role listarId(Integer idRol);
}
