package Logica;

import Persistencia.*;

public class ApiBaseDTO {

    public boolean guardarDatosApi(String country, String officialName, String capital, String gini, String coiCode, String population, String timeZone, String continent) {

        ApiBaseDAO apiBaseDAO = new ApiBaseDAO();
        apiBaseDAO.create(country, officialName, capital, gini, coiCode, population, timeZone, continent);
        return true;

    }

}
