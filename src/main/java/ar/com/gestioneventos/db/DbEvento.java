package ar.com.gestioneventos.db;

import ar.com.gestioneventos.domain.Evento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DbEvento {

    private static List<Evento> eventoList;

    public static List<Evento> getEventoList() {
        List<Evento> eventoList = new ArrayList<Evento>();
        eventoList.add(new Evento(UUID.randomUUID(), "9 de Julio", "Empanadas de la Independencia", LocalDateTime.of(2024,07,9,12,00), "Plaza Independencia", 150, 100));
        eventoList.add(new Evento(UUID.randomUUID(), "Concurso de Pasteleria", "Concurso de Pasteleria", LocalDateTime.of(2024,8,25,8,00), "Salon de Eventos Casino Gala", 200, 130));
        eventoList.add(new Evento(UUID.randomUUID(),"Fiesta de las Colectividades", "Fiesta de las Colectividades-Día del Inmigrante", LocalDateTime.of(2024,9,4,19,00), "Domo Centenario", 300, 120));


        return eventoList;
    }
}
