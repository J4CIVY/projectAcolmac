package Logica;

import Presentacion.Filtro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class ConsultaApiPaisesDTO {

    private static final String BASE_URL = "https://restcountries.com/v3.1/name/";
    public StringBuffer response;

    public String getPaisInfo(String nombrePais) throws IOException {

        @SuppressWarnings("deprecation")
        URL url = new URL(BASE_URL + nombrePais);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("Failed : HTTP error code : " + responseCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        this.response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            this.response.append(inputLine);
        }
            return null;
    }
        
        public String getPaisRegularNombre () {
            
        JSONArray jsonArray = new JSONArray(this.response.toString());
        JSONObject jsonObject = jsonArray.getJSONObject(0);

        for (Object obj : jsonArray) {

            return new JSONObject(((JSONObject) obj).get("name").toString()).get("common").toString();          
        } 
        return null;
        }
        
        public String getPaisOfficialNombre () {
            
        JSONArray jsonArray = new JSONArray(this.response.toString());
        JSONObject jsonObject = jsonArray.getJSONObject(0);

        for (Object obj : jsonArray) {

            return new JSONObject(((JSONObject) obj).get("name").toString()).get("official").toString();          
        } 
        return null;
        }
        
        public String getPaisCOICodigo () {
            
        JSONArray jsonArray = new JSONArray(this.response.toString());
        JSONObject jsonObject = jsonArray.getJSONObject(0);

        for (Object obj : jsonArray) {

            return ((JSONObject) obj).get("cca3").toString();          
        } 
        return null;
        }
        
        public String getPaisGiniIndice () {
            
        JSONArray jsonArray = new JSONArray(this.response.toString());
        JSONObject jsonObject = jsonArray.getJSONObject(0);

        for (Object obj : jsonArray) {

            return new JSONObject(((JSONObject) obj).get("gini").toString()).get("2019").toString();        
        } 
        return null;
        }
}