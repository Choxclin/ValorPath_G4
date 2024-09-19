package pe.edu.upc.valorpathg4a.servicesinterfaces;


import pe.edu.upc.valorpathg4a.entities.Resource;

import java.util.List;

public interface IResourceService {
    public List<Resource> list();
    public void insert(Resource resour);
}
