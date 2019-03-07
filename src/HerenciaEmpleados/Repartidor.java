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
final public class Repartidor extends Empleado {
    private int horas_trabajadas;
    private String zona;

    public Repartidor() {
    }

    public Repartidor(int horas_trabajadas, String zona) {
        this.horas_trabajadas = horas_trabajadas;
        this.zona = zona;
    }

    public Repartidor(int horas_trabajadas, String zona, String nombre, 
            String apellido1, String apellido2, String nif, int edad, 
            int salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horas_trabajadas = horas_trabajadas;
        this.zona = zona;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Zonas:" +this.zona);
        System.out.println("Horas trabajadas: " +this.horas_trabajadas);
    }
    @Override
    public void pedirAlta(){
        Scanner sc = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Dime la zona de reparto");
        setZona(sc.nextLine());
        System.out.println("Confirma la comisión");
        setHoras_trabajadas(sc.nextInt());        
    }
}
