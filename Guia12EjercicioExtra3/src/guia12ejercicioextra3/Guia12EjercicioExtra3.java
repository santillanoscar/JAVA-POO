package guia12ejercicioextra3;

import AlojamientoExtrahotelero.Camping;
import AlojamientoExtrahotelero.ExtraHotelero;
import AlojamientoExtrahotelero.Residencia;
import Entidad.HotelPadre;
import Hoteles.HotelCinco;
import Hoteles.HotelCuatro;
import Hoteles.Hoteles;
import ServicioHoteles.ServicioHoteles;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia12EjercicioExtra3 {

     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
         ArrayList  <HotelPadre> listaHoteles = new ArrayList<>();
         
        //**** HotelPadre **** (String nombre, String direccion, String localidad, String gerente)
        HotelPadre hp1 = new HotelPadre("Hotel Padre 1", "Direccion Hotel Padre 1", "Direccion Hotel Padre 1", "Gerente Hotel Padre 1");
        HotelPadre hp2 = new HotelPadre("Hotel Padre 2", "Direccion Hotel Padre 2", "Direccion Hotel Padre 2", "Gerente Hotel Padre 2");
        HotelPadre hp3 = new HotelPadre("Hotel Padre 3", "Direccion Hotel Padre 3", "Direccion Hotel Padre 3", "Gerente Hotel Padre 3");

        //**** Hoteles **** int cantHabitaciones, int numCamas, int cantPisos, int precioHab, String nombre, 
        //String direccion, String localidad, String encargado)
        Hoteles h1 = new Hoteles(2, 2, 2, 50, "Hoteles 1", "Direccion Hoteles 1", "Localidad Hoteles 1", "Gerente Hoteles 1");
        Hoteles h2 = new Hoteles(4, 4, 4, 50, "Hoteles 2", "Direccion Hoteles 2", "Localidad Hoteles 2", "Gerente Hoteles 2");
        Hoteles h3 = new Hoteles(6, 6, 6, 50, "Hoteles 3", "Direccion Hoteles 3", "Localidad Hoteles 3", "Gerente Hoteles 3");
        Hoteles h4 = new Hoteles(8, 8, 8, 50, "Hoteles 4", "Direccion Hoteles 4", "Localidad Hoteles 4", "Gerente Hoteles 4");
        
        //**** HotelCuatro **** (boolean gimnasio, String NomResto, int capResto, int cantHabitaciones, int numCamas, 
        //int cantPisos, int precioHab, String nombre, String direccion, String localidad, String encargado) {
        HotelCuatro h41 = new HotelCuatro(true, "Resto Hotel 4* 1", 40, 2, 4, 4, 50, "Hotel 4* 1", "Direccion Hotel 4* 1", "Localidad Hotel 4* 1", "Gerente Hotel 4* 1");
        HotelCuatro h42 = new HotelCuatro(false, "Resto Hotel 4* 2", 50, 3, 4, 5, 50, "Hotel 4* 2", "Direccion Hotel 4* 2", "Localidad Hotel 4* 2", "Gerente Hotel 4* 2");
        HotelCuatro h43 = new HotelCuatro(true, "Resto Hotel 4* 3", 60, 4, 4, 6, 50, "Hotel 4* 3", "Direccion Hotel 4* 3", "Localidad Hotel 4* 3", "Gerente Hotel 4* 3");
        HotelCuatro h44 = new HotelCuatro(false, "Resto Hotel 4* 4", 70, 5, 4, 7, 50, "Hotel 4* 4", "Direccion Hotel 4* 4", "Localidad Hotel 4* 4", "Gerente Hotel 4* 4");

        //*** HotelCinco ****(int cantSalonConf, int cantSuites, int cantLimosinas, boolean gimnasio, String NomResto, 
        //int capResto, int cantHabitaciones, int numCamas, int cantPisos, int precioHab, String nombre, 
        //String direccion, String localidad, String encargado) {
        HotelCinco h51 = new HotelCinco(1, 2, 5, false, "Resto Hotel 5* 1", 50, 2, 3, 5, 50, "Hotel 5* 1", "Direccion Hotel 5* 1", "Localidad Hotel 5* 1", "Gerente Hotel 5* 1");
        HotelCinco h52 = new HotelCinco(2, 4, 6, true, "Resto Hotel 5* 2", 60, 4, 3, 7, 50, "Hotel 5* 2", "Direccion Hotel 5* 2", "Localidad Hotel 5* 2", "Gerente Hotel 5* 2");
        HotelCinco h53 = new HotelCinco(3, 6, 8, true, "Resto Hotel 5* 3", 80, 6, 4, 10, 50, "Hotel 5* 3", "Direccion Hotel 5* 3", "Localidad Hotel 5* 3", "Gerente Hotel 5* 3");
        HotelCinco h54 = new HotelCinco(4, 8, 10, true, "Resto Hotel 5* 4", 100, 8, 4, 15, 50, "Hotel 5* 4", "Direccion Hotel 5* 4", "Localidad Hotel 5* 4", "Gerente Hotel 5* 4");

        //**** ExtraHotelero **** (boolean privado, double metCuadrados, String nombre, String direccion, 
        //String localidad, String gerente)
        ExtraHotelero eh1 = new ExtraHotelero(true, 600, "Hotel Extra Hotelero 1", "Direccion Extra Hotelero 1", "Localidad Extra Hotelero 1", "Gerente Extra Hotelero 1");
        ExtraHotelero eh2 = new ExtraHotelero(false, 800, "Hotel Extra Hotelero 2", "Direccion Extra Hotelero 2", "Localidad Extra Hotelero 2", "Gerente Extra Hotelero 2");
        ExtraHotelero eh3 = new ExtraHotelero(false, 700, "Hotel Extra Hotelero 3", "Direccion Extra Hotelero 3", "Localidad Extra Hotelero 3", "Gerente Extra Hotelero 3");
        ExtraHotelero eh4 = new ExtraHotelero(false, 1000, "Hotel Extra Hotelero 4", "Direccion Extra Hotelero 4", "Localidad Extra Hotelero 4", "Gerente Extra Hotelero 4");

        //**** Camping **** (int capMaxCarpas, int banios, boolean Resto, boolean privado, double metCuadrados,
        //String nombre, String direccion, String localidad, String gerente)
        Camping c1 = new Camping(50, 10, true, false, 5000, "Nombre Camping 1", "Direccion Camping 1", "Localidad Camping 1", "Gerente Camping 1");
        Camping c2 = new Camping(100, 8, false, true, 6000, "Nombre Camping 2", "Direccion Camping 2", "Localidad Camping 2", "Gerente Camping 2");
        Camping c3 = new Camping(120, 12, true, false, 3000, "Nombre Camping 3", "Direccion Camping 3", "Localidad Camping 3", "Gerente Camping 3");
        Camping c4 = new Camping(120, 15, true, true, 10000, "Nombre Camping 4", "Direccion Camping 4", "Localidad Camping 4", "Gerente Camping 4");

        //**** Residencia ****(int cantHabitaciones, boolean descGremios, boolean campoDeportivo, 
        //boolean privado, double metCuadrados, String nombre, String direccion, String localidad, String gerente)
        Residencia r1 = new Residencia(4, true, true, true, 3500, "Nombre Residencia 1", "Direccion Residencia 1", "Localidad Residencia 1", "Gerente Residencia 1");
        Residencia r2 = new Residencia(6, false, true, false, 5500, "Nombre Residencia 2", "Direccion Residencia 2", "Localidad Residencia 2", "Gerente Residencia 2");
        Residencia r3 = new Residencia(8, true, false, true, 5000, "Nombre Residencia 3", "Direccion Residencia 3", "Localidad Residencia 3", "Gerente Residencia 3");
        Residencia r4 = new Residencia(10, true, true, false, 2000, "Nombre Residencia 4", "Direccion Residencia 4", "Localidad Residencia 4", "Gerente Residencia 4");

        listaHoteles.add(hp1);
        listaHoteles.add(hp2);
        listaHoteles.add(hp3);
        listaHoteles.add(h1);
        listaHoteles.add(h2);
        listaHoteles.add(h3);
        listaHoteles.add(h4);
        listaHoteles.add(h41);
        listaHoteles.add(h42);
        listaHoteles.add(h43);
        listaHoteles.add(h44);
        listaHoteles.add(h51);
        listaHoteles.add(h52);
        listaHoteles.add(h53);
        listaHoteles.add(h54);
        listaHoteles.add(eh1);
        listaHoteles.add(eh2);
        listaHoteles.add(eh3);
        listaHoteles.add(eh4);
        listaHoteles.add(c1);
        listaHoteles.add(c2);
        listaHoteles.add(c3);
        listaHoteles.add(c4);
        listaHoteles.add(r1);
        listaHoteles.add(r2);
        listaHoteles.add(r3);
        listaHoteles.add(r4);
        
        ServicioHoteles sh = new ServicioHoteles();
        
        int opcion = 0;
        do {
            System.out.println("Seleccione la consulta que desea realizar\n"
                    + "1- Todos los Alojamientos\n"
                    + "2- Todos los alojamientos ordenados por precio descendente\n"
                    + "3- Todos los Camping con Restaurante\n"
                    + "4- Todas las Residencias que tienen Descuento a Gremio\n"
                    + "5- SALIR");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" *** Todos los Alojamientos ***\n");
                    sh.todosLosAlojamientos(listaHoteles);
                    break;
                case 2:
                    System.out.println(" Falta Realizar \n");
                    
                    break;
                case 3:
                    System.out.println(" *** Todos los Camping con Restaurante ***\n");
                    sh.campigConResto(listaHoteles);
                    break;
                case 4:
                    System.out.println("*** Camping con Descuento a Gremios ***\n");
                    sh.campigConDescuentoGremio(listaHoteles);
                    break;
                case 5:
                    System.out.println(" MUCHAS GRACIAS\n ");
                    break;
                default:
                    System.out.println("ERROR!!!");
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        } while (opcion != 5);

    }
    
}
