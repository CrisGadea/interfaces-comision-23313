package org.edu.cac;

import org.edu.cac.enums.Club;

import java.util.HashMap;
import java.util.Map;

public class Equipo {

    Map<Integer, String> jugadores;

    Club nombre;

    Map<String, Integer> posicionEnLigas;

    public Equipo(Club nombre, Map<String, Integer> posicionEnLigas){
        this.nombre = nombre;
        this.posicionEnLigas = posicionEnLigas;
        this.jugadores = new HashMap<>();
    }

    public Map<Integer, String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<Integer, String> jugadores) {
        this.jugadores = jugadores;
    }

    public Club getNombre() {
        return nombre;
    }

    public void setNombre(Club nombre) {
        this.nombre = nombre;
    }

    public Map<String, Integer> getPosicionEnLigas() {
        return posicionEnLigas;
    }

    public void setPosicionEnLigas(Map<String, Integer> posicionEnLigas) {
        this.posicionEnLigas = posicionEnLigas;
    }

    public void agregarJugador(Jugador jugador){
        jugadores.put(jugador.getNro_camiseta(), jugador.getNombre());
    }

}
