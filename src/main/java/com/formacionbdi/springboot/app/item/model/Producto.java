package com.formacionbdi.springboot.app.item.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    private Date createAt;
}
