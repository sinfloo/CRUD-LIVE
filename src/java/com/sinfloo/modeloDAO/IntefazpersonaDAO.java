
package com.sinfloo.modeloDAO;

import com.sinfloo.modelo.Persona;
import java.util.List;

public interface IntefazpersonaDAO {
     public List<Persona>getPersonas();
     public Persona getId(int id);
     public int add(Persona p);
     public int update(Persona p);
     public int delete(int id);
}
