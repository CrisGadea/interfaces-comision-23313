package org.edu.cac;

import org.edu.cac.enums.Club;
import org.edu.cac.enums.Posicion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Map<String, Integer> posiciones = new HashMap<>();
        posiciones.put("LFP", 2);
        posiciones.put("Copa Sudamericana", 1);
        posiciones.put("Copa Libertadores", 3);
        Equipo equipo1 = new Equipo(Club.BOCA, posiciones);

        Jugador jugador1 = new Jugador("Federico", 1, equipo1, Posicion.ARQUERO);
        Jugador jugador2 = new Jugador("Juan", 2, equipo1, Posicion.DEFENSOR);
        Jugador jugador3 = new Jugador("Carlos", 7, equipo1, Posicion.MEDIOCAMPISTA);
        Jugador jugador4 = new Jugador("Roberto", 11, equipo1, Posicion.DELANTERO);

        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);

        System.out.println("Los jugadores del equipo " + equipo1.getNombre() + ", fueron: ");

        Iterator it = equipo1.getJugadores().keySet().iterator();

        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + equipo1.getJugadores().get(key));
        }
*/
        // INTERFACES y CLASES ABSTRACTAS

        // INTERFAZ: Contrato en donde se especifican
        // los comportamientos que deben tener las clases que las implementen

        // Para definir una interfaz, debemos comprender cu´´l o cuáles comportamientos serán compartidos por
        // objetos de distinto tipo (distintas clases).

        // Definimos una Interfaz "Comunicable"


        // CLASE ABSTRACTA (Herencia)

        // Es una clase que NO PUDE SER INSTANCIADA.
        // Para poder ser una clase abstracta, al menos 1 de sus métodos tiene que ser abstracto
        // es decir, que no tenga cuerpo (solo la firma)
        // Puede tener métodos no abstractos (comunes)



        // Programacion Funcional

        // Interfaces Funcionales: Son interfaces con 1 unico metodo abstracto.
        // @FuncionalInterface
        // public void operacion(Integer x, Integer y);

        // Expresiones lambda: Representan una operación -> (flecha) / metodo implementado.
        // ej: s -> System.out.println(s)

        // (La flecha lambda se realiza con el signo menos seguido del signo mayor que - > )


        // Referencia a metodos: Utilizando el :: (operador de ambito), para hacer referencia a una funcion
        // de una clase especifica (System.out::println)

        // Streams: Encapsulamiento de Colecciones para trabajarlas mediante la concatenacion de diferentes
        // métodos y filtros (que no mantienen estado), es decir, que no modifican al original.

        //EJ:

        List<String> nombres = List.of("Cristian", "Mariana", "Carlos", "Luciana");

        List<String> nombresConC = nombres.stream()
                .filter(nombre -> nombre.charAt(0) == 'C')
                .collect(Collectors.toList());

        System.out.println("Lista original:");
        nombres.forEach(System.out::println);

        System.out.println("Lista filtrada:");
        nombresConC.forEach(System.out::println);

    }
}