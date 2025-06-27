package com.example.MsConector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.MsConector.service.ComentarioService;

@RestController
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/materiasProfesor/{id}")
    public ResponseEntity<String> obtenerMateriasProfesor(@PathVariable int id){
        String resultado = comentarioService.obtenerMateriasPorProfesor(id);
        if (resultado.startsWith("Error")) {
             return ResponseEntity.status(400).body(resultado); 
        }
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/materiasAlumno/{id}")
    public ResponseEntity<String> obtenerMateriasAlumno(@PathVariable int id){
                String resultado = comentarioService.obtenerMateriasDeAlumno(id);
        if (resultado.startsWith("Error")) {
             return ResponseEntity.status(400).body(resultado); 
        }
        return ResponseEntity.ok(resultado);
    }
    
}
