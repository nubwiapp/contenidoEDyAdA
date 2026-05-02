package FIFO.QUIZ1;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.LinkedList;

public class SistemaTurnosComsultorio {
    private Queue<Paciente> colaEspera;
    private int contadorTurnos;

    public SistemaTurnosComsultorio() {
        this.colaEspera = new LinkedList<>();
        this.contadorTurnos = 0;
    }

    public Paciente registrarPaciente(String nombre, String tipoConsulta) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if (tipoConsulta == null || tipoConsulta.trim().isEmpty()){
            throw new IllegalArgumentException("El tipo de consulta es obligatorio");
        }

        contadorTurnos++;
        Paciente nuevo = new Paciente(nombre, tipoConsulta, contadorTurnos);
        colaEspera.add(nuevo);

        System.out.println("Paciente registrado " + nuevo);
        return nuevo;
    }

    public Paciente llamarPaciente() {
        if (colaEspera.isEmpty()){
            throw new NoSuchElementException("Paciente no encontrado");
        }
        Paciente atendido = colaEspera.remove();
        System.out.println("Paciente atendido : " + atendido);
        return atendido;
    }

    public void verSiguiente() {
        if (colaEspera.isEmpty()){
            System.out.println("No hay pacientes en la sala de espera");
            return;
        }
        Paciente proximo = colaEspera.element();

        System.out.println("Paciente en espera  : " + proximo);
    }

    public int pacientesEnEspera() {
        return colaEspera.size();
    }

    public boolean salaVacia() {
        return colaEspera.isEmpty();
    }

    public void mostrarColaCompleta(){
        System.out.println("Pacientes en cola de espera:");
        if (colaEspera.isEmpty()){
            System.out.println("No hay pacientes en la sala de espera");
        }else{
            int posicion = 1;
            for (Paciente paciente : colaEspera){
                String marca = (posicion == 1) ? " <-- siguiente " : "";
                System.out.println(posicion + " - " + paciente + marca);
            }
            System.out.println("Total pacientes en espera: " + pacientesEnEspera());
            System.out.println("----------------------------------------------------");
        }
    }
}
