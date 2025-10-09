import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
        Ejercicio5();
    }
    public static void Ejercicio1() {
        //Crea un programa que defina tres variables: nombre, edad y ciudad. Asigna valores a cada una y muestra su contenido en la consola.
        System.out.println("EJERCICIO 1");
        String nombreDePersona = "Ana";
        int edad = 25;
        String ciudad = "Madrid";

        System.out.println("Nombre: " + nombreDePersona);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("");
    }

    public static void Ejercicio2() {
        // Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego, modifica su valor tres veces y muestra el resultado final.
        System.out.println("EJERCICIO 2");
        int puntuacion = 0;
        int modificacionpuntuacion1 = puntuacion + 5;
        int modificacionpuntuacion2 = modificacionpuntuacion1 + 5;
        int puntuacionfinal = modificacionpuntuacion2 + 5;
        System.out.println("Puntuación inicial: " + puntuacion);
        System.out.println("Puntuación modificada: " + modificacionpuntuacion1);
        System.out.println("Puntuacion segunda modificacion: " + modificacionpuntuacion2);
        System.out.println("Puntuacion final: " + puntuacionfinal);
        System.out.println("");
    }

    public static void Ejercicio3() {
        // Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char) y muestra tanto su valor como su tipo.
        System.out.println("EJERCICIO 3");
        String nombrecompleto3 = "Carlos";
        int edad3 = 30;
                boolean esEstudiante = true;
        double altura = 1.75;
        char inicial = 'C';

        System.out.println("Nombre: " + nombrecompleto3);
        System.out.println("Edad: " + edad3);
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("");

    }

    public static void Ejercicio4() {
        // Crea un programa que simule la información de un libro usando variables con nombres descriptivos. Muestra toda la información del libro en la consola.
        System.out.println("EJERCICIO 4");
        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int aniodepublicacion = 1605;
        int numpaginas = 863;
        boolean estaDisponible = true;

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + aniodepublicacion);
        System.out.println("Número de páginas: " + numpaginas);
        System.out.println("¿Está disponible?: " + estaDisponible);
        System.out.println("");
    }

    public static void Ejercicio5() {
        // Crea un programa que use constantes para almacenar información que no debe cambiar (como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar. Muestra todos los valores.
        System.out.println("EJERCICIO 5");
        final String nombreAplicacion = "Mi App";
       String version = "1.0.0";
        final double PI = Math.PI;
       String usuarioActual = "Laura";
       int nivelactual = 1;
       int puntuacion = 0;
       String usuarioActualizado = "Miguel";
       int nivelActualizado = 2;
       int puntuacionActualizada = 150;

        System.out.println("Nombre de aplicación (String): " + nombreAplicacion);
        System.out.println("Versión (MathPI): " + Math.PI);
        System.out.println("Usuario actual (String): " + usuarioActual);
        System.out.println("Nivel (int): " + nivelactual);
        System.out.println("Puntuación (int): " + puntuacion);
        System.out.println("Usuario actualizado (String): " + usuarioActualizado);
        System.out.println("Nivel actualizado (int): " + nivelActualizado);
        System.out.println("Puntuación actualizada (int):" + puntuacionActualizada);



    }

}