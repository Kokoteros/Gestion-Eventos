package ar.com.gestioneventos.service.Evento;
import ar.com.gestioneventos.domain.Chef;
import ar.com.gestioneventos.domain.Evento;
import ar.com.gestioneventos.domain.Participante;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public interface EventoService {
    void crearEvento();
    boolean verificarCapacidad(UUID idEvento);
    void gestionarRegistroEInscripcionGeneral(String tipoUsuario);
    void eliminarEvento(UUID idEvento);
    List<Evento> listarEventosDisponibles(LocalDateTime fecha);
    List<Evento> listarEventosPasados(LocalDateTime fecha);
    String getNombreEventoPorId(UUID idEvento);
    List<Evento> getTodosLosEventos();
    List<Evento> getEventosPasados();
}
