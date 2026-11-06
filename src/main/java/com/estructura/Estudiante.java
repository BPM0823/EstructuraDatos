package com.estructura;

// Clase hija 1. Hereda de Persona.
public class Estudiante extends Persona {

    private String matricula;
    private int semestre;

    public Estudiante(String nombre, String apellido, int edad, String matricula, int semestre) {
        super(nombre, apellido, edad); // llama al constructor del padre
        this.matricula = matricula;
        this.semestre = semestre;

        this.habilidadesUnicas.add("Estudiar");
        this.historialCursos.add("Programacion Orientada a Objetos");
        this.calificaciones.put("Estructura de Datos", 9);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    // Polimorfismo: version propia de presentarse()
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el estudiante " + nombre + " " + apellido +
                ". Matricula: " + matricula + ", semestre " + semestre +
                ". Edad (primitivo): " + getEdad_primitiva() +
                ", Edad (objeto Integer): " + getEdad_objeto());
    }
}
