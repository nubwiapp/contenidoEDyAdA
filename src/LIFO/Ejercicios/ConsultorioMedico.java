package LIFO.Ejercicios;

import java.util.Stack;
/*
Ejercicio de Aplicación 2: Sistema de turnos en consultorio médico (con función "deshacer")
Aquí mezclamos LIFO con un caso real: un consultorio donde la secretaria registra pacientes y a veces necesita deshacer el último registro (porque se equivocó, o el paciente canceló antes de ser atendido).
Para la cola normal de atención usaríamos FIFO, pero la función "deshacer último registro" es perfecta para LIFO.
* */
public class ConsultorioMedico {
    private Stack<Paciente> registrosRecientes = new Stack<>();

    public void registrarPaciente(String nombre, String motivo) {
        Paciente p = new Paciente(nombre, motivo);
        registrosRecientes.push(p);
        System.out.println("✓ Paciente registrado: " + p);
    }

    public void deshacerUltimoRegistro() {
        if (registrosRecientes.isEmpty()) {
            System.out.println("✗ No hay registros que deshacer.");
            return;
        }
        Paciente eliminado = registrosRecientes.pop();
        System.out.println("↶ Registro deshecho: " + eliminado);
    }

    public void verUltimoRegistrado() {
        if (registrosRecientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        System.out.println("Último registrado: " + registrosRecientes.peek());
    }

    public void mostrarTodos() {
        System.out.println("\n--- Pacientes en cola (más reciente primero) ---");
        for (int i = registrosRecientes.size() - 1; i >= 0; i--) {
            System.out.println((registrosRecientes.size() - i) + ". " + registrosRecientes.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ConsultorioMedico consultorio = new ConsultorioMedico();

        consultorio.registrarPaciente("Ana López", "Control general");
        consultorio.registrarPaciente("Carlos Pérez", "Dolor de cabeza");
        consultorio.registrarPaciente("María Gómez", "Vacunación");

        consultorio.mostrarTodos();
        consultorio.verUltimoRegistrado();   // María Gómez

        // Ups, María canceló
        consultorio.deshacerUltimoRegistro();

        consultorio.verUltimoRegistrado();   // Carlos Pérez
        consultorio.mostrarTodos();
    }
}
