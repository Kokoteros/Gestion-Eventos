package ar.com.gestioneventos.service.Participante;

import ar.com.gestioneventos.domain.Evento;
import ar.com.gestioneventos.domain.Participante;
import java.util.List;
import java.util.UUID;

public interface ParticipanteService {
    void registrarParticipante();
    List<Evento> obtenerHistorialEventos(Participante participante);
    List<Participante> getTodosLosParticipantes();
    List <String> listarParticipantes();
    Participante buscarParticipantePorId(UUID id);
    String getNombreParticipantePorId(UUID idParticipante);
}
