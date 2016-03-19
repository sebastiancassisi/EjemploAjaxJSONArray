/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.mapfre.ejemploajaxjsonarray;

/**
 *
 * @author cassisi
 */
public class Paises {
	

    private String codigo;
    private String nombre;
    private String continente;
    private String region;
    private int poblacion;   
    private String capital;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Paises(String codigo, String nombre, String continente, String region, int poblacion, String capital) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.continente = continente;
        this.region = region;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    public Paises() {
    }
    
     
}
