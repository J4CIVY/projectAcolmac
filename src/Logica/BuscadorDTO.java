/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

public class BuscadorDTO {

    private String palabraBuscar;

    public BuscadorDTO (String palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }
    public String procesarBusqueda(){
        System.out.println("Estouy En La Logica Porcesando La Busqueda");
        return this.palabraBuscar;
    }
}
