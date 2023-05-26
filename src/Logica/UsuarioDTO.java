
package Logica;

import Persistencia.UsuariosDAO;

public class UsuarioDTO {
    
    public boolean registrar(int id, String name, String surname, String pass, String email){
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.create(id, name, surname, pass, email);
           
                return true;
    
    }
    
}
