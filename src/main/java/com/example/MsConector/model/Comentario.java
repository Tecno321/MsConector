package com.example.MsConector.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comentario {

    private int id;
    private int idUsuario;
    private String nombreMateria;
    
    
}
