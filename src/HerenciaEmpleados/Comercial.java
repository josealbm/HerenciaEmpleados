/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEmpleados;

import java.util.Scanner;

/**
 *
 * @author josea
 */
final public class Comercial extends Empleado {
    private int ventas;
    private float comision;

    public Comercial() {
    }

    public Comercial(int ventas, float comision) {
        this.ventas = ventas;
        this.comision = comision;
    }

    public Comercial(int ventas, float comision, String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.ventas = ventas;
        this.comision = comision;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    @Override
   public void mostrarAtributos(){
       super.mostrarAtributos();
       System.out.println("Ventas: "+this.ventas);
       System.out.println("Comision: "+this.comision);
   }
   @Override
    public void pedirAlta(){
        Scanner sc = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Dime las ventas");
        setVentas(sc.nextInt());
        System.out.println("Confirma la comisión");
        setComision(sc.nextInt());
    }
    
}

