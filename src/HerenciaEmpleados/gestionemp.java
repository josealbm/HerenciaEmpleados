package HerenciaEmpleados;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javaapplication7;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// *
// * @author josea
// */
//public class GestionEmpleado {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        ArrayList<Empleado> listaempleados = new ArrayList<Empleado>();
////        listaempleados.add(new Empleado("nombre","apellido1","apellido2","nif",0,0));
////        listaempleados.add(new Comercial(5,5, "comercial", "apellidocom1","apellidovcom2","nifcom", 0,0));
////        listaempleados.add(new Repartidor(0,"zona","repartidor","apellidorep1","apellidorep2","nifrep", 0,0));
////        for (int i = 0; i<listaempleados.size(); i++){
////            System.out.println("Soy de la clase: "+listaempleados.get(i).getClass());
////            System.out.println("======================");
////            listaempleados.get(i).mostrarAtributos();
//        Scanner sc = new Scanner(System.in);
//        boolean salir = false;
//        int opcion;
//        while (!salir){
//            System.out.println("Bienvenidos/as al sistema de gestión de "
//                    + "empleados");
//            System.out.println("Por favor, escoge una de las opciones");
//            System.out.println("1. Dar de alta un empleado");
//            System.out.println("2. Dar de alta un comercial");
//            System.out.println("3. Dar de alta un repartidor");
//            System.out.println("4. Mostrar los atributos de un empleado");
//            System.out.println("5. Salir");
//            opcion = sc.nextInt();
//            switch(opcion){
//                case(1):{
//                    System.out.println("Vamos a dar de alta a un empleado");
//                    Empleado emp = new Empleado();
//                    emp.pedirAlta();
//                    listaempleados.add(emp);
//                    break;
//                }
//                case(2):{
//                    System.out.println("Vamos a dar de alta a un comercial");
//                    Comercial com = new Comercial();
//                    com.pedirAlta();
//                    listaempleados.add(com);
//                    break;
//                }
//                case(3):{
//                    System.out.println("Vamos a dar de alta un repartidor");
//                    Repartidor rep = new Repartidor();
//                    rep.pedirAlta();
//                    listaempleados.add(rep);
//                    break;
//                }
//                case(4):{
//                    System.out.println("Dime el id del empleado que quieres "
//                            + "mostrar");
//                    int id = sc.nextInt();
//                    listaempleados.get(id).mostrarAtributos();
//                    break;
//                }
//                case(5):{
//                    salir = false;
//                }
//                default:{
//                    System.out.println("Por favor, escoje una opción contenida "
//                            + "en el menú");
//                }
//                
//            }
//        }
//        
//    
//    }
//    }
//    
//
