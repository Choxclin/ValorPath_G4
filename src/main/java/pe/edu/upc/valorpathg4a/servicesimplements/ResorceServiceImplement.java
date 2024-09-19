package pe.edu.upc.valorpathg4a.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpathg4a.entities.Resource;
import pe.edu.upc.valorpathg4a.repositories.IResourceRepository;
import pe.edu.upc.valorpathg4a.servicesinterfaces.IResourceService;

import java.util.List;

@Service
public class ResorceServiceImplement implements IResourceService {

    @Autowired
    private IResourceRepository rR;

    @Override
    public List<Resource> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Resource resour) {
        rR.save(resour);
    }

}
