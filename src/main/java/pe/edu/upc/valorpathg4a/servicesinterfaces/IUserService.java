package pe.edu.upc.valorpathg4a.servicesinterfaces;


import pe.edu.upc.valorpathg4a.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Integer idUsuario);

    public Users listarId(Integer idUsuario);
}
