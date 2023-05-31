package Logica;

public class BuscadorDTO {

    private String palabraBuscar;

    public BuscadorDTO(String palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public String procesarBusqueda() {
        System.out.println("Estouy En La Logica Porcesando La Busqueda");
        return this.palabraBuscar;
    }
}
