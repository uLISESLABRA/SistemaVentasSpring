/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulises.sistemas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.ulises.sistemas.dao.PersonaDaoI;
import pe.edu.ulises.sistemas.modelo.Persona;
import pe.edu.ulises.sistemas.servicio.PersonaServicioI;


/**
 *
 * @author ulises
 */
@Service
@Transactional
public class PersonaServicioImpl implements PersonaServicioI{
 
    @Autowired
    public PersonaDaoI dao;
    
    @Override
    public List<Persona> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public List<Persona> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}
    @Override
    public Persona buscarEntidadId(int id){return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Persona persona){dao.guardarEntidad(persona);}
    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}
    @Override
    public void modificarEntidad(Persona persona){dao.modificarEntidad(persona);}
}
