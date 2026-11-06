package com.estructura;

// Clase hija 2. Hereda de Persona.
public class Profesor extends Persona {

    private String departamento;
    private double horasClase;

    public Profesor(String nombre, String apellido, int edad, String departamento, double horasClase) {
        super(nombre, apellido, edad);
        this.departamento = departamento;
        this.horasClase = horasClase;

        this.listaHobbies.add("Investigar");
        this.habilidadesUnicas.add("Ensenar");
        this.habilidadesUnicas.add("Publicar papers");
        this.calificaciones.put("Evaluacion docente", 10);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Polimorfismo: version propia de presentarse()
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " " + apellido +
                " del departamento de " + departamento +
                ". Imparto " + horasClase + " horas de clase." +
                " Estatura (double primitivo): " + getEstatura_primitiva() +
                ", Peso (Double objeto): " + getPeso_objeto());
    }
}
