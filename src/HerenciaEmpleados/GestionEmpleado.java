/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEmpleados;

import java.util.ArrayList;
import java.util.Scanner;
import static HerenciaEmpleados.Empleado.primeraMayuscula;



public class GestionEmpleado {
    
    public static void buscarNombre(ArrayList<Empleado> listaEmpleados, 
            String nombreEmp){
        boolean encontrado = false;
        int i = 0;
        while (encontrado==false && i<listaEmpleados.size()){
            if (listaEmpleados.get(i).getNombre().equals
        (primeraMayuscula(nombreEmp))){
                 listaEmpleados.get(i).mostrarAtributos();
                 encontrado = true;
                 i++;
            }else{
                System.out.println("No existe el empleado");
                i++;
                
            }
        }
    }
    public static void buscarDni(ArrayList<Empleado> listaEmpleados, 
            String dniEmp){
        boolean encontrado = false;
        int i = 0;
        while (encontrado==false && i<listaEmpleados.size()){
            if (listaEmpleados.get(i).getNombre().equals(primeraMayuscula(dniEmp))){
                 listaEmpleados.get(i).mostrarAtributos();
                 encontrado = true;
                 i++;
            }else{
                System.out.println("No existe el empleado");
                i++;
                
            }
        }
    
        
    }
    public static void buscarApellido(ArrayList<Empleado> listaEmpleados, 
            String apellidoEmp){
        boolean encontrado = false;
        int i = 0;
        while (encontrado==false && i<listaEmpleados.size()){
            if (listaEmpleados.get(i).getApellido1().equals
        (primeraMayuscula(apellidoEmp))){
                 listaEmpleados.get(i).mostrarAtributos();
                 encontrado = true;
                 i++;
            }else{
                System.out.println("No existe el empleado");
                i++;
                
            }
        }
    
        
    }
    
    public static void main(String[] args) {
        ArrayList<Empleado> listaempleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("Bienvenidos/as al sistema de gestión de "
                    + "empleados");
            System.out.println("Por favor, escoge una de las opciones");
            System.out.println("1. Dar de alta un empleado");
            System.out.println("2. Dar de alta un comercial");
            System.out.println("3. Dar de alta un repartidor");
            System.out.println("4. Mostrar los atributos de un empleado");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case(1):{
                    System.out.println("Vamos a dar de alta a un empleado");
                    Empleado emp = new Empleado();
                    emp.pedirAlta();
                    listaempleados.add(emp);
                    break;
                }
                case(2):{
                    System.out.println("Vamos a dar de alta a un comercial");
                    Comercial com = new Comercial();
                    com.pedirAlta();
                    listaempleados.add(com);
                    break;
                }
                case(3):{
                    System.out.println("Vamos a dar de alta un repartidor");
                    Repartidor rep = new Repartidor();
                    rep.pedirAlta();
                    listaempleados.add(rep);
                    break;
                }
                case(4):{
                    System.out.println("¿Cómo quieres hacer la búsqueda del "
                            + "empleado?");
                    System.out.println("1. Por nombre");
                    System.out.println("2. Por apellido");
                    System.out.println("3. Por NIF");
                    int opcionbusqueda = sc.nextInt();
                    switch (opcionbusqueda){
                        case 1:{
                            System.out.println("Por nombre");
                            System.out.println("Confirma el nombre");
                            sc.nextLine();
                            buscarNombre(listaempleados, sc.nextLine());
                            break;
                        }
                        case 2:{
                            System.out.println("Por apellidos");
                            System.out.println("Confirma el apellido");
                            sc.nextLine();
                            buscarApellido(listaempleados, sc.nextLine());
                            break;
                        }
                        case 3:{
                            System.out.println("Por NIF");
                            System.out.println("Escribe el NIF");
                            sc.nextLine();
                            buscarDni(listaempleados, sc.nextLine());
                            break;
                        }
                        default: {
                            System.out.println("Escoje una opción válida");
                            break;
                        }
                    
                }                    
                    break;
                }
                case(5):{
                    salir = true;
                    break;
                }
                default:{
                    System.out.println("Por favor, escoje una opción contenida "
                            + "en el menú");
                }
                
            }
        }
    
    }
        
    }
    

