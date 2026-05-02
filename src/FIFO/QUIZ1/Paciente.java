package FIFO.QUIZ1;

class Paciente {

    private String nombre;
    private String tipoConsulta;
    private int numeroTurno;

    public Paciente() {
    }

    public Paciente(String nombre, String tipoConsulta, int numeroTurno) {
        this.nombre = nombre;
        this.tipoConsulta = tipoConsulta;
        this.numeroTurno = numeroTurno;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipoConsulta() {
        return tipoConsulta;
    }
    public int getNumeroTurno() {
        return numeroTurno;
    }

    @Override
    public String toString() {
        return String.format("Turno #%03d - %s - (%s) ", numeroTurno, nombre, tipoConsulta);
    }
}
