package com.estructura;

// Clase principal. Aqui se prueba herencia y polimorfismo.
public class Main {

    public static void main(String[] args) {

        System.out.println("========== TAREA 1: ESTRUCTURA DE DATOS ==========\n");

        // Se crean objetos de las hijas pero se guardan como tipo Persona (polimorfismo)
        Persona est = new Estudiante("Bruno", "Pavon", 27, "BM26520469", 4);
        Persona prof = new Profesor("Carlos", "Ramirez", 42, "Sistemas Computacionales", 12.5);
        Persona dev = new Desarrollador("Ana", "Martinez", 28, "Java", true);
        Persona generica = new Persona("Luis", "Garcia", 30);

        // Arreglo de tipo padre
        Persona[] personas = { est, prof, dev, generica };

        // Ciclo for que ejecuta el metodo en todos los objetos
        System.out.println("--- Polimorfismo (ciclo) ---\n");
        for (int i = 0; i < personas.length; i++) {
            System.out.print((i + 1) + ". ");
            personas[i].presentarse(); // cada uno usa su propia version
            System.out.println();
        }

        // Encapsulamiento: usar getter y setter
        System.out.println("--- Encapsulamiento ---\n");
        est.setEdad_primitiva(27);
        System.out.println("Edad del estudiante (primitivo): " + est.getEdad_primitiva());
        System.out.println("Edad del estudiante (objeto Integer): " + est.getEdad_objeto());

        // Colecciones
        System.out.println("\n--- Colecciones del Desarrollador ---\n");
        dev.mostrarColecciones();

        System.out.println("\n--- Colecciones del Estudiante ---\n");
        est.agregarHobby("Videojuegos");
        est.agregarHobby("Futbol");
        est.mostrarColecciones();

        System.out.println("\n========== FIN ==========");
    }
}
