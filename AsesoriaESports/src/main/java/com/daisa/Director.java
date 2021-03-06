package com.daisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase Director.
 * @author David Roig
 * @author Isabel Montero
 */
public class Director {
    private String dni;
    private String nombre;
    private String telefono;
    private String email;
    private List<Equipo> equipos;
    private String idUsuario;

    public Director(String dni, String nombre, String telefono, String email, String idUsuario) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.idUsuario = idUsuario;
        equipos = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return Objects.equals(dni, director.dni);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dni);
    }
}
