package ar.com.unpaz.inicio;

import java.util.HashMap;
import java.util.Scanner;
import ar.com.unpaz.model.*;
import ar.com.unpaz.repositorio.LecturaArchivoRepositorio;
import ar.com.unpaz.repositorioImp.LecturaArchivoRepositorioImp;
import ar.com.unpaz.servicio.*;
import ar.com.unpaz.servicioImp.*;

public class Main {

    public static void main(String[] args) {
        // 1. Inicializamos el Scanner, la lógica y el mapa de datos
        Scanner teclado = new Scanner(System.in);
        LecturaArchivoRepositorio lectura = new LecturaArchivoRepositorioImp();
        LogicaReserva logica = new LogicaReservaImp();
        HashMap<Integer, Reserva> mapaReservas = new HashMap<>();
        mapaReservas = lectura.leerReservas();
        int opcion = 0;

        // 3. Bucle del menú
        do {
            System.out.println("\n=== MENU DE GESTION DE RESERVAS ===");
            System.out.println("1. Mostrar todas las reservas con su importe final");
            System.out.println("2. Buscar reserva por codigo");
            System.out.println("3. Calcular total recaudado por el hotel");
            System.out.println("4. Mostrar reserva con mayor importe final");
            System.out.println("5. Contar cuantas reservas Premium existen");
            System.out.println("6. Mostrar reservas con importe mayor a $100.000");
            System.out.println("7. Calcular promedio de importe de reservas Simples");
            System.out.println("8. Listar nombres de clientes Premium");
            System.out.println("9. Mostrar codigos ordenados de Mayor a Menor importe");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = teclado.nextInt();
            System.out.println("----------------------------------------");

            switch (opcion) {
                case 1:
                    logica.mostrarReservasJuntoImporteFinal(mapaReservas);
                    break;
                case 2:
                    System.out.print("Ingrese el codigo de la reserva a buscar: ");
                    int codBuscado = teclado.nextInt();
                    logica.buscarReservaPorCodigo(mapaReservas, codBuscado);
                    break;
                case 3:
                    double total = logica.calcularTotalHotel(mapaReservas);
                    System.out.println("El total recaudado por el hotel es: $" + total);
                    break;
                case 4:
                    System.out.println("Reserva con mayor importe:");
                    logica.mostrarReservaMayorImporteFinal(mapaReservas);
                    break;
                case 5:
                    long cantidadPremium = logica.cuantasReservasPremiumExisten(mapaReservas);
                    System.out.println("Cantidad de reservas Premium: " + cantidadPremium);
                    break;
                case 6:
                    System.out.println("Reservas que superan los $100.000:");
                    logica.mostrarReservasImporteFinalMayor100mil(mapaReservas);
                    break;
                case 7:
                    double promedioSimples = logica.calcularPromedioImporteFinalReservasSimples(mapaReservas);
                    System.out.println("El promedio de las reservas simples es: $" + promedioSimples);
                    break;
                case 8:
                    System.out.println("Clientes con reservas Premium:");
                    System.out.println(logica.listaNombresReservasPremium(mapaReservas));
                    break;
                case 9:
                    System.out.println("Codigos ordenados de mayor a menor importe final:");
                    logica.mostrarCodigosMayorMenorImporteFinal(mapaReservas);
                    break;
                case 0:
                    System.out.println("¡Saliendo del sistema! Saludos.");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 0);

        teclado.close(); // Cerramos el recurso del teclado
    }
}