package pe.edu.upc.valorpathg4a.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.valorpathg4a.dtos.UseResourcesDTO;
import pe.edu.upc.valorpathg4a.servicesinterfaces.IUseResourcesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usorecurso")
public class UseResourceController {
    @Autowired
    private IUseResourcesService iurs;

    @GetMapping
    public List<UseResourcesDTO> listarusos()
    {
        return iurs.listaruso().stream().map(x->
        {
            ModelMapper m= new ModelMapper();
            return m.map(x, UseResourcesDTO.class);
        }).collect(Collectors.toList());
    }
}
