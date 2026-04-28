package LIFO.Ejercicios;

/*
Ejercicio de Aplicación 2: Sistema de turnos en consultorio médico (con función "deshacer")
Aquí mezclamos LIFO con un caso real: un consultorio donde la secretaria registra pacientes y a veces necesita deshacer el último registro (porque se equivocó, o el paciente canceló antes de ser atendido).
Para la cola normal de atención usaríamos FIFO, pero la función "deshacer último registro" es perfecta para LIFO.
* */

class Paciente {
    String nombre;
    String motivo;

    public Paciente(String nombre, String motivo) {
        this.nombre = nombre;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return nombre + " (" + motivo + ")";
    }
}
