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
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        JSONArray jsonArray = new JSONArray(response.toString());
        JSONObject jsonObject = jsonArray.getJSONObject(0);

        for (Object obj : jsonArray) {

            return new JSONObject(((JSONObject) obj).get("name").toString()).get("official").toString();

        }

        in.close();

        return null;
    }

}
