package com.example.MsConector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComentarioService {
    @Autowired 
    private RestTemplate restTemplate;

    public String obtenerMateriasPorProfesor(int id){
        String usuarioUrl = "http://localhost:8082/profesores/obtenerProfe/"+id;
        String usuarioData = restTemplate.getForObject(usuarioUrl, String.class);
        
        String materiaUrl = "http://localhost:8080/api/materias/"+id;
        String materiaData = restTemplate.getForObject(materiaUrl, String.class);

        return "{\"usuario\": "+usuarioData + " ,\"materias\": "+ materiaData+" }";
    }
}
