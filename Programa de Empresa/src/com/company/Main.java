package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import  java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Programa de empresa ME-QUEDÉ.
        HashMap <String, Float> listaProductos = new HashMap <>();
        ArrayList <String> vendedores = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vendedor;
        int opcion;
        float mayor = 0;
        float menor = 0;
        float promedio = 0;
        float acumulador = 0;
        int v;

        while (true) {
            System.out.println("ME-QUEDÉ...");
            System.out.println("\n\t1.- Ingresar venta");
            System.out.println("\t2.- Corregir venta");
            System.out.println("\t3.- Ver todas las ventas");
            System.out.println("\t4.- Ver venta mensual");
            System.out.println("\t5.- Ver estadistica");
            System.out.println("\t6.- Salir");
            System.out.print("\nIntroduce el numero de la opción que quieras: ");

            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (NumberFormatException | IOException e) {
                opcion = 0;
            }


            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el nombre del vendedor: ");
                    vendedor = br.readLine();
                    System.out.print("Introduzca la venta mensual: ");
                    String venta = br.readLine();
                    float ventaM = Float.parseFloat(venta);
                    vendedores.add(vendedor);
                    guardarProducto(vendedor, ventaM, listaProductos);
                    acumulador = acumulador + ventaM;


                    for (v = 0; v <= 100; v++){
                    if (vendedores.size() == 1){
                        mayor = ventaM;
                        menor = ventaM;
                    }else if (ventaM > mayor){
                        mayor = ventaM;
                    }else if (ventaM < menor){
                        menor = ventaM;
                    }
                    promedio = (acumulador / vendedores.size());}
                    break;

                case 2:
                    System.out.print("\nIntroduzca el nombre del vendedor al cual desea cambiar la venta: ");
                    vendedor = br.readLine();
                    modificaPrecio(vendedor, listaProductos);

                    break;
                case 3:
                    System.out.println("Las ventas realizadas son: ");
                    mostrarProductos(listaProductos);

                    break;
                case 4:
                    System.out.println("La Venta mensual total es de: " + acumulador);
                    break;
                case 5:
                    System.out.println("\nLa estadisticas son: ");
                    System.out.println("\n\tEl vendedor que mas vendió es: " + mayor);
                    System.out.println("\tEl vendedor que menos vendió es: " + menor);
                    System.out.println("\tLa venta promedio es: " + promedio);
                    if (acumulador > 100000) {
                        System.out.println("Se superó la meta de 100,000.00.");
                    } else
                        System.out.println("\nNo se superó la meta de 100,000.00.");
                    break;

                case 6:
                    System.out.println("Gracias por utilizar este servicio.");

                    return;

                default:
                    System.out.println("Tienes que introducir una opción valida");
            }

        }

    }



    private static void mostrarProductos(HashMap <String, Float> listaProductos) {
        String clave;
        Iterator <String> productos = listaProductos.keySet().iterator();
        System.out.println("Hay las sigientes ventas: ");
        while (productos.hasNext()) {
            clave = productos.next();
            System.out.println(clave + " - " + listaProductos.get(clave));
        }
    }

    private static void modificaPrecio(String ventaM, HashMap <String, Float> listaProductos) {
        Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(ventaM)) {
            System.out.println("Introduzca la venta del vendedor: ");
            listaProductos.put(ventaM, sc.nextFloat());
        } else {
            System.out.println("No hay ninguna venta con este vendedor.");
        }
    }

    private static void guardarProducto(String vendedor, float precio, HashMap <String, Float> listaProductos) {
        if (listaProductos.containsKey(vendedor)) {
            System.out.println("No se puede introducir el vendedor. Ya ha introducido esta venta.");
        } else {
            listaProductos.put(vendedor, precio);
        }
    }
}