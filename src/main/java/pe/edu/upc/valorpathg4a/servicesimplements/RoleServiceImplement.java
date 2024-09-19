package pe.edu.upc.valorpathg4a.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpathg4a.entities.Role;
import pe.edu.upc.valorpathg4a.repositories.IRoleRepository;
import pe.edu.upc.valorpathg4a.servicesinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role rol) {
        rR.save(rol);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Integer idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Role listarId(Integer idRol) {
        return rR.findById(idRol).orElse(new Role());
    }
}
