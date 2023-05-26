
package Logica;

import Persistencia.UsuariosDAO;

public class UsuarioDTO {
    
    public boolean registrar(String id, String name, String surname, String pass, String email){
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.create(id, name, surname, pass, email);
        return true;
    }
    
    public boolean validacionLogin (String id, String pass) {
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.validateUserLogin(id, pass);
        
        return true;
        
    }
    
}
