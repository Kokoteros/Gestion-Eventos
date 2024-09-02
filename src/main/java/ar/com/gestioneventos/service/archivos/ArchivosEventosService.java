package ar.com.gestioneventos.service.archivos;

import ar.com.gestioneventos.domain.Evento;

import java.time.LocalDate;
import java.util.List;

public interface ArchivosEventosService {
    void exportarEventosCsv(List<Evento> eventos);
    void cerrarWriter();
}
