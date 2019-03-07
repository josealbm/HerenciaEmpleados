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
public class Empleado {

    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String nif;
    protected int edad;
    protected int salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, 
            String nif, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = primeraMayuscula(nombre);

    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = primeraMayuscula(apellido1);
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = primeraMayuscula(apellido2);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad2(int edad) {
        Scanner sc = new Scanner(System.in);
        boolean validar = false;
        this.edad = edad;
        if (edad >= 16) {
            validar = true;
        } else {
            while (validar == false) {
                System.out.println("No puede ser menor de 16 años, por favor"
                        + " vuelve a introducirlo");
                setEdad(sc.nextInt());
                if (getEdad() >= 16) {
                    validar = true;
                }
            }
        }
    }

    public void setEdad(int edad) {
        Scanner sc = new Scanner(System.in);

        while (edad <16) {
            System.out.println("No puede ser menor de 16 años, por favor"
                    + " vuelve a introducirlo");
            edad=sc.nextInt();
        }
        this.edad=edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void mostrarAtributos() {
        System.out.println("Primer apellido: " + this.apellido1);
        System.out.println("Segundo apellido: " + this.apellido2);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("NIF: " + this.nif);
        System.out.println("Salario: " + this.salario);
    }

    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer apellido");
        setApellido1(sc.nextLine());
        System.out.println("Dime el segundo apellido");
        setApellido2(sc.nextLine());
        System.out.println("Dime el nombre");
        setNombre(sc.nextLine());
        System.out.println("¿Qué edad tiene?");
        setEdad(sc.nextInt());
        System.out.println("Dime el DNI");
        sc.nextLine();
        setNif(sc.nextLine());
        System.out.println("¿Cuál será el salario de este empleado?");
        setSalario(sc.nextInt());
    }

    public static String primeraMayuscula(String string) {

        char[] array = string.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);
    }

}
