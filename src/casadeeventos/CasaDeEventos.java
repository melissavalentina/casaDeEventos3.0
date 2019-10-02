
package casadeeventos;

import java.util.Date; 




public class CasaDeEventos {

    private int numeroDeCajas;
    private int numeroDeTrabajadores; 
    private Date fechaDeApertura;
    private String nombreDelDueño;
    private boolean tieneSucursales; 

    public CasaDeEventos(int numeroDeCajas, int numeroDeTrabajadores, Date fechaDeApertura, String nombreDelDueño, boolean tieneSucursales) {
        this.numeroDeCajas = numeroDeCajas;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeApertura = fechaDeApertura;
        this.nombreDelDueño = nombreDelDueño;
        this.tieneSucursales = tieneSucursales;
    }

    public int getNumeroDeCajas() {
        return numeroDeCajas;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    public String getNombreDelDueño() {
        return nombreDelDueño;
    }

    public boolean isTieneSucursales() {
        return tieneSucursales;
    }

    public void setNumeroDeCajas(int numeroDeCajas) {
        this.numeroDeCajas = numeroDeCajas;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public void setNombreDelDueño(String nombreDelDueño) {
        this.nombreDelDueño = nombreDelDueño;
    }

    public void setTieneSucursales(boolean tieneSucursales) {
        this.tieneSucursales = tieneSucursales;
    }
    
    
}
