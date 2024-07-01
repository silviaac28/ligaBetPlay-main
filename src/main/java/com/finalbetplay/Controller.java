package com.finalbetplay;

import java.util.ArrayList;
import java.util.Hashtable;

import com.finalbetplay.clases.Equipo;
import com.finalbetplay.clases.Estadio;
import com.finalbetplay.clases.Jugador;
import com.finalbetplay.clases.Partido;
import com.finalbetplay.clases.Permiso;
import com.finalbetplay.clases.Resultado;
import com.finalbetplay.clases.Rol;
import com.finalbetplay.clases.Tarjeta;
import com.finalbetplay.clases.Usuario;

public class Controller {

    public static Hashtable <String, Equipo> equipos = new Hashtable<>();
    public static Hashtable <String, Estadio> estadios = new Hashtable<>();
    public static Hashtable <String, Jugador> jugadores = new Hashtable<>();
    public static Hashtable <String, Permiso> permisos = new Hashtable<>();
    public static Hashtable <String, Rol> rols = new Hashtable<>();
    public static Hashtable <String, Usuario> usuarios = new Hashtable<>();
    public static Hashtable <String, Partido> partidos = new Hashtable<>();
    public static Hashtable <String, Resultado> resultados = new Hashtable<>();
    public ArrayList<Tarjeta> tarjetas = new ArrayList<>();


        
}
