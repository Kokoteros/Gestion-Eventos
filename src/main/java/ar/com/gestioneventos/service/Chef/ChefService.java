package ar.com.gestioneventos.service.Chef;

import ar.com.gestioneventos.domain.Chef;
import java.util.List;
import java.util.UUID;

public interface ChefService {
    void registrarChef();
    List<String> listarChefs();
    List <Chef> getTodosLosChef();
    Chef buscarChefPorId(UUID id);
}
