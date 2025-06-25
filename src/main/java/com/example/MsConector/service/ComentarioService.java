package com.example.MsConector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComentarioService {
    @Autowired 
    private RestTemplate restTemplate;

    public String obtenerMateriasPorProfesor(int id){
        try {
        String usuarioUrl = "http://localhost:8082/profesores/obtenerProfe/"+id;
        String usuarioData = restTemplate.getForObject(usuarioUrl, String.class);
        
        String materiaUrl = "http://localhost:8080/api/cursos/profesor/"+id;
        String materiaData = restTemplate.getForObject(materiaUrl, String.class);

        return "{\"usuario\": "+usuarioData + " ,\"materias\": "+ materiaData+" }";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error: Hubo un problema al llamar al profesor o las materias " + e.getMessage();
        }

    }

    public String obtenerMateriasDeAlumno(int id){
        try {
        String usuarioUrl = "http://localhost:8082/alumnos/obtenerAlumno/"+id;
        String usuarioData = restTemplate.getForObject(usuarioUrl, String.class);
        
        String materiaUrl = "http://localhost:8080/api/cursos/"+id;
        String materiaData = restTemplate.getForObject(materiaUrl, String.class);

        return "{\"usuario\": "+usuarioData + " ,\"materias\": "+ materiaData+" }";            
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: Hubo un problema al llamar al alumno o las materias " + e.getMessage();
        }

    }
}
