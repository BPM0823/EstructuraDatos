package com.estructura;

// Clase hija 3. Hereda de Persona.
public class Desarrollador extends Persona {

    private String lenguajeFavorito;
    private boolean remoto;

    public Desarrollador(String nombre, String apellido, int edad, String lenguajeFavorito, boolean remoto) {
        super(nombre, apellido, edad);
        this.lenguajeFavorito = lenguajeFavorito;
        this.remoto = remoto;

        this.listaHobbies.add("Programar");
        this.listaHobbies.add("Repostería");
        this.habilidadesUnicas.add("Java");
        this.habilidadesUnicas.add("Python");
        this.habilidadesUnicas.add("Git");
        this.historialCursos.addFirst("Estructura de Datos");
        this.calificaciones.put("Proyecto final", 10);
    }

    public String getLenguajeFavorito() {
        return lenguajeFavorito;
    }

    public void setLenguajeFavorito(String lenguajeFavorito) {
        this.lenguajeFavorito = lenguajeFavorito;
    }

    public boolean isRemoto() {
        return remoto;
    }

    // Polimorfismo: version propia de presentarse()
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el desarrollador " + nombre + " " + apellido +
                ". Lenguaje favorito: " + lenguajeFavorito +
                ". Trabajo remoto: " + remoto +
                ". Activo (boolean primitivo): " + isActivo_primitivo() +
                ", Becado (Boolean objeto): " + getBecado_objeto());
    }
}
