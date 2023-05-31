package Logica;

import Persistencia.UsuariosDAO;
import java.sql.ResultSet;

public class UsuarioDTO {

    public boolean registrar(String id, String name, String surname, String pass, String email) {

        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.create(id, name, surname, pass, email);
        return true;
    }

    public ResultSet validacionLogin(String id, String pass) {

        ResultSet rs;

        UsuariosDAO usuariosDAO = new UsuariosDAO();
        rs = usuariosDAO.validateUserLogin(id, pass);

        return rs;

    }

}
