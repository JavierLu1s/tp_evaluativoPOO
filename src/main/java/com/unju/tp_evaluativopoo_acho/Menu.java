/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tp_evaluativopoo_acho;

import java.util.Scanner;

/**
 *
 * @author meme
 */
public class Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menuPrincipal();
    }

    public static void menuPrincipal() {

        int opp = 0;
        while (opp != 3) {

            System.out.println("====MENU PRINCIPAL==== ");

            System.out.println("1.Empleados");
            System.out.println("2.Proyectos");
            System.out.println("3.Salir del programa");
            System.out.println("Ingrese una opcion:");

            opp = scanner.nextInt();
            switch (opp) {
                case 1:
                    menuEmpleados();
                    break;
                case 2:
                    menuProyectos();
                    break;

                case 3:
                    System.out.println("Saliendo del Programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }

        }

    }

    public static void menuEmpleados() {

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("====MENU EMPLEADO====");
            System.out.println("1.Agregar empleado");
            System.out.println("2.Eliminar empleado");
            System.out.println("3.Modificar empleado");
            System.out.println("4.Listar empleados");
            System.out.println("5.Mostar el empleado de mayor edad");
            System.out.println("6.Salir de proveedores");
            System.out.println("7.Listar empleados que superen a un determinado sueldo básico ingresado");
            System.out.println("8.Volver al menú principal");
            System.out.println("ingrese una opción");

            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:

                    break;
                case 7:
                    break;
                case 8:
                    menuPrincipal();
                    break;

                default:

                    System.out.println("Opción incorrecta");

            }

        }
    }

    public static void menuProyectos() {

        int opcion = 0;

        while (opcion != 10) {
            System.out.println("====MENU PROYECTO====");
            System.out.println("1.Agregar nuevo proyecto");
            System.out.println("2.Eliminar un proyecto");
            System.out.println("3.Listar proyectos");
            System.out.println("4.Agregar empleado a un proyecto");
            System.out.println("5.Quitar empleado de un proyecto");
            System.out.println("6.Listar datos de un proyecto");
            System.out.println("7.Calcular el total de montos destinados a proyectos");
            System.out.println("8.Calcular el monto que recibe cada participante de un proyecto");
            System.out.println("9.Listar proyectos por rangos de fechas");
            System.out.println("10.Volver al menú principal");
            System.out.println("Ingrese una opción");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:

                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    menuPrincipal();
                    break;

                default:

                    System.out.println("Opción incorrecta");

            }

        }
    }

}
