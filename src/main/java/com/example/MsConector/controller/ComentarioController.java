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

    @GetMapping("/comentarios/{id}")
    public ResponseEntity<String> obtenerMaterias(@PathVariable int id){
        return ResponseEntity.ok(comentarioService.obtenerMateriasPorProfesor(id));
    }
    
}
