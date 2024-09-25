package pe.edu.upc.valorpathg4a.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpathg4a.entities.UseResources;
import pe.edu.upc.valorpathg4a.repositories.IUseResourceRepository;
import pe.edu.upc.valorpathg4a.servicesinterfaces.IUseResourcesService;

import java.util.List;
@Service
public class UseResourceServiceImplement implements IUseResourcesService {

    @Autowired
    private IUseResourceRepository iur;
    @Override
    public List<UseResources> listaruso() {
        return iur.findAll();
    }

    @Override
    public void insert(UseResources useResources) {
        iur.save(useResources);
    }
}
