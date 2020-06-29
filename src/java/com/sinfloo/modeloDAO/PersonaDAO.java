
package com.sinfloo.modeloDAO;

import com.sinfloo.config.Conexion;
import com.sinfloo.modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PersonaDAO implements IntefazpersonaDAO{

    @Override
    public List<Persona> getPersonas() {
         List<Persona>personas=new ArrayList<>();
        String sql="select * from persona";
        try {
             PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             while (rs.next()) {                
                Persona p=new Persona();
                p.setId(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setApellidos(rs.getString(3));
                p.setCorreo(rs.getString(4));
                personas.add(p);
            }
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }
       
        return personas; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona getId(int id) {
        String sql="select * from persona where idPersona=?";
        Persona persona=new Persona();
        try {
             PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs=ps.executeQuery();
             while (rs.next()) {               
                persona.setId(rs.getInt(1));
                persona.setNombres(rs.getString(2));
                persona.setApellidos(rs.getString(3));
                persona.setCorreo(rs.getString(4));                
            }
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }
        return  persona;
    }

    @Override
    public int add(Persona p) {
        int resultado=0;
        String sql="insert into persona(Nombres,Apellidos,Correo)values(?,?,?)";
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getCorreo());
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error to add in BD"+e);
        }
        return resultado;
    }

    @Override
    public int update(Persona p) {
        int resultado=0;
        String sql="update persona set Nombres=?,Apellidos=?,Correo=? where idPersona=?";
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getCorreo());
            ps.setInt(4, p.getId());
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error to add in BD"+e);
        }
        return resultado;
    }

    @Override
    public int delete(int id) {
         int resultado=0;
         String sql="delete from persona where idPersona="+id;
         try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            resultado = ps.executeUpdate();
        } catch (Exception e) {
        }
        return resultado;
    }
   
    
}
