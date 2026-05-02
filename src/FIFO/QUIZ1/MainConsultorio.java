package FIFO.QUIZ1;

public class MainConsultorio {
    static void main() {
        SistemaTurnosComsultorio sistema = new SistemaTurnosComsultorio();
        /*
        * PRUEBA 1: Registro inicial de pacientes
        */

        System.out.println("APERTURA DEL CONSULTORIO");

        sistema.registrarPaciente("Ana Mendez", "Control General");
        sistema.registrarPaciente("Juan Perez", "Dolor de Cabeza");
        sistema.registrarPaciente("Pedro Sanchez", "Vacunacion");
        sistema.registrarPaciente("Rodrigo Hernandez", "Examen de Sangre");
        sistema.registrarPaciente("Maria Angel", "Dermatologia");


        /*
        *
        * Ver pacientes en espera:
        *
        * */
        sistema.mostrarColaCompleta();

        /*
        * Ver el siguiente en espera
        *
        * */

        System.out.println("Verificación del proximo paciente");
        sistema.verSiguiente();
        System.out.println("Paciente en espera");
        sistema.pacientesEnEspera();

        /*
         *
         * Atender Paciente
         * */

        System.out.println("Atender Paciente en Orden FIFO");
        sistema.llamarPaciente();
        sistema.llamarPaciente();

        sistema.verSiguiente();
        sistema.mostrarColaCompleta();
    }



}
