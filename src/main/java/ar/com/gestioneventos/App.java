package ar.com.gestioneventos;

import ar.com.gestioneventos.service.Participante.ParticipanteService;
import ar.com.gestioneventos.service.Participante.Impl.ParticipanteServiceImpl;
import ar.com.gestioneventos.service.Resena.Impl.ResenaServiceImpl;
import ar.com.gestioneventos.service.Resena.ResenaService;
import ar.com.gestioneventos.service.archivos.impl.ArchivosEventosServiceImpl;
import ar.com.gestioneventos.service.archivos.ArchivosEventosService;
import ar.com.gestioneventos.service.Evento.EventoService;
import ar.com.gestioneventos.service.Evento.Impl.EventoServiceImpl;
import ar.com.gestioneventos.service.Menu.MenuService;
import ar.com.gestioneventos.service.Menu.impl.MenuServiceImpl;
import ar.com.gestioneventos.service.Chef.ChefService;
import ar.com.gestioneventos.service.Chef.Impl.ChefServiceImpl;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ParticipanteService participanteService = new ParticipanteServiceImpl();
        ChefService chefService = new ChefServiceImpl();
        EventoService eventoService = new EventoServiceImpl(participanteService, chefService);
        ResenaService resenaService = new ResenaServiceImpl(eventoService, participanteService);
        ArchivosEventosService archivosEventosService = new ArchivosEventosServiceImpl();

        MenuService menuService = new MenuServiceImpl(eventoService, participanteService, chefService, resenaService, archivosEventosService);

        Scanner scanner = new Scanner(System.in);
        menuService.mostrarMenu(scanner);
        scanner.close();
        archivosEventosService.cerrarWriter();
    }
}