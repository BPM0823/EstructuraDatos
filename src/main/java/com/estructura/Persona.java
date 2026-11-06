package com.estructura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

// Clase padre. Las hijas heredan de aqui.
public class Persona {

    // Atributos publicos, protegidos y privados (encapsulamiento)
    public String nombre;
    protected String apellido;

    private int edad_primitiva;       // tipo primitivo
    private Integer edad_objeto;      // tipo objeto (wrapper)

    private double estatura_primitiva;
    private Double peso_objeto;
    private boolean activo_primitivo;
    private Boolean becado_objeto;
    private char genero_primitivo;
    private Character inicial_objeto;
    private long id_primitivo;
    private Long telefono_objeto;
    private float promedio_primitivo;
    private Float salario_objeto;

    // Colecciones
    protected ArrayList<String> listaHobbies;
    protected LinkedList<String> historialCursos;
    protected HashSet<String> habilidadesUnicas;
    protected HashMap<String, Integer> calificaciones;

    // Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad_primitiva = edad;
        this.edad_objeto = Integer.valueOf(edad);

        this.estatura_primitiva = 1.70;
        this.peso_objeto = 70.0;
        this.activo_primitivo = true;
        this.becado_objeto = Boolean.FALSE;
        this.genero_primitivo = 'M';
        this.inicial_objeto = Character.valueOf(nombre.charAt(0));
        this.id_primitivo = 1000L;
        this.telefono_objeto = 5500000000L;
        this.promedio_primitivo = 8.5f;
        this.salario_objeto = 0.0f;

        this.listaHobbies = new ArrayList<>();
        this.historialCursos = new LinkedList<>();
        this.habilidadesUnicas = new HashSet<>();
        this.calificaciones = new HashMap<>();
    }

    // Getters y setters
    public int getEdad_primitiva() {
        return edad_primitiva;
    }

    public void setEdad_primitiva(int edad_primitiva) {
        if (edad_primitiva >= 0) {
            this.edad_primitiva = edad_primitiva;
            this.edad_objeto = edad_primitiva;
        }
    }

    public Integer getEdad_objeto() {
        return edad_objeto;
    }

    public double getEstatura_primitiva() {
        return estatura_primitiva;
    }

    public void setEstatura_primitiva(double estatura_primitiva) {
        this.estatura_primitiva = estatura_primitiva;
    }

    public Double getPeso_objeto() {
        return peso_objeto;
    }

    public void setPeso_objeto(Double peso_objeto) {
        this.peso_objeto = peso_objeto;
    }

    public boolean isActivo_primitivo() {
        return activo_primitivo;
    }

    public void setActivo_primitivo(boolean activo_primitivo) {
        this.activo_primitivo = activo_primitivo;
    }

    public Boolean getBecado_objeto() {
        return becado_objeto;
    }

    public void setBecado_objeto(Boolean becado_objeto) {
        this.becado_objeto = becado_objeto;
    }

    // Metodo que las hijas van a sobrescribir (polimorfismo)
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " " + apellido +
                ", tengo " + edad_primitiva + " años. Soy una persona normal.");
    }

    public void agregarHobby(String hobby) {
        listaHobbies.add(hobby);
    }

    public void mostrarColecciones() {
        System.out.println("  Hobbies (ArrayList): " + listaHobbies);
        System.out.println("  Cursos (LinkedList): " + historialCursos);
        System.out.println("  Habilidades (HashSet): " + habilidadesUnicas);
        System.out.println("  Calificaciones (HashMap): " + calificaciones);
    }
}
