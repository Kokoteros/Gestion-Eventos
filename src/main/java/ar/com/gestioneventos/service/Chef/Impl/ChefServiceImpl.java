package ar.com.gestioneventos.service.Chef.Impl;

import ar.com.gestioneventos.domain.Chef;
import ar.com.gestioneventos.service.Chef.ChefService;

import java.util.*;

public class ChefServiceImpl implements ChefService {
    private static List<Chef> todosLosChef = new ArrayList<>();

    @Override
    public void registrarChef() {
        Chef nuevoChef = new Chef();
        Scanner sc = new Scanner(System.in);
        UUID id = UUID.randomUUID();
        nuevoChef.setId(id);

        System.out.println("Ingrese el nombre y apellido del Chef: ");
        String nombreChef = sc.nextLine();
        nuevoChef.setNombreYApellido(nombreChef);

        System.out.println("Ingrese la especialidad del Chef: ");
        String especialidad = sc.nextLine();
        nuevoChef.setEspecialidad(especialidad);

        nuevoChef.setEventosAsistidos(new ArrayList<>());

        todosLosChef.add(nuevoChef);

        System.out.println("El ID del Chef es: " + nuevoChef.getId() +"\n");
    }


    @Override
    public List<String> listarChefs() {
        List<String> listaDetalles = new ArrayList<>();

        if (todosLosChef.isEmpty()) {
            System.out.println("No hay Chefs registrados.");
        } else {
            System.out.println("----Lista de Chefs----");
            for (Chef chef : todosLosChef) {
                StringBuilder detalles = new StringBuilder();
                detalles.append("ID: ").append(chef.getId()).append("\n");
                detalles.append("Nombre y Apellido: ").append(chef.getNombreYApellido()).append("\n");
                detalles.append("Especialidad del Chef: ").append(chef.getEspecialidad()).append("\n");
                detalles.append("--------------------------------------");
                listaDetalles.add(detalles.toString());
                System.out.println(detalles);
            }
        }
        return listaDetalles;
    }

    @Override
    public List<Chef> getTodosLosChef() {
        return this.todosLosChef;
    }

    @Override
    public Chef buscarChefPorId(UUID id) {
        for (Chef c : getTodosLosChef()) {
            if (c.getId().equals(id)) {
                return c;
            }else System.out.println("ID del Chef es incorrecto: " + c.getId());
        }
        return null;
    }
}



