/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii;

import java.util.ArrayList;

/**
 *
 * @author Perla Solis
 */
public class Reportes {
    private String Cliente;
    private String Contenido;
    private int Precio;
    private String Retornado;
    
    ArrayList<RegistroDeCliente> Register = new ArrayList<>();
            

    public Reportes(String Cliente, String Contenido, int Precio, String Retornado) {
        this.Cliente = Cliente;
        this.Contenido = Contenido;
        this.Precio = Precio;
        this.Retornado = Retornado;
    }

    public Reportes() {
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getRetornado() {
        return Retornado;
    }

    public void setRetornado(String Retornado) {
        this.Retornado = Retornado;
    }
   public void reportes(String reporte){
       for(int i = 0; i<Register.size();i++){
           System.out.println(Register.get(i).getNumeroDeIdentidad() +""+ Register.get(i).getContenido()+""+ Register.get(i).getPrecio()+""+ Register.get(i).getPrecio());
           
       }
   }
   public void CrearRegistro(String Registrar){
   RegistroDeCliente Registro = new RegistroDeCliente();
    Register.add(Registro);
    
}
}