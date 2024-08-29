package EvaluadorDeClases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvaluadorDeClases {
    public static void main(String[] args) {

        //Creamos una lista de estudiantes con diferentes calificaciones
        //Utiliza un HashMap para almacenar las calificaciones de los estudiantes, donde la llave es el nombre del estudiante y el valor es un ArrayList de notas.
        Map<String, ArrayList<Integer>> estudiantes = new HashMap<>();

        //Solicita al usuario que ingrese la cantidad de alumnos y la cantidad de notas por alumno.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de alumnos");
        int cantidadAlumnos = sc.nextInt();

        System.out.println("Ingresa la cantidad de notas por alumno");
        int cantidadNotasPorAlumno = sc.nextInt();

        //Solicita el nombre de cada alumno y las notas correspondientes, almacenándolas en el HashMap.
        for (int i = 1; i <= cantidadAlumnos; i++) {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese el nombre del alumno " + i + " : ");
            String nombreAlumno = sc.next();
            for (int j = 1; j <= cantidadNotasPorAlumno; j++) {
                System.out.println("Ingrese la nota " + j + " del alumno " + nombreAlumno + " : ");
                int notaAlumno = sc.nextInt();
                while (notaAlumno > 8 || notaAlumno < 0) {
                    System.out.println("A T E N C I O N, Nota no aceptada");
                    notaAlumno = (int) sc.nextFloat();
                }
                notas.add(notaAlumno);
            }
            estudiantes.put(nombreAlumno, notas);
        }

        //Notas almacenadas en el HashMap
        System.out.println("Estas son las notas de los alumnos");
        System.out.println(estudiantes);

        for (String nombreAlumno : estudiantes.keySet()) {
            ArrayList<Integer> notas = estudiantes.get(nombreAlumno);

            int notasSumadas = 0;
            int notasPromedio = 0;
            int notaMaxima = 0;
            int notaMinima = 0;

            for (Integer nota : notas) {
                notasSumadas += nota;
                // Nota Máxima
                if (nota > notaMaxima) {
                    notaMaxima = nota;
                }
                // Nota Mínima
                if (nota < notaMinima) {
                    notaMinima = nota;
                }

                int promedio = notasSumadas / nota;

            }

        }

        int menuDeOpciones;
        do {
            System.out.println(" << < Menu de opciones > >> ");
            System.out.println("1. Ver el promedio de notas por estudiante.");
            System.out.println("2. Ver si la nota es aprobatoria o reprobatoria por estudiante.");
            System.out.println("3. Ver si la nota está por sobre o por debajo del promedio del curso por estudiante.");
            System.out.println("0. Salir del menu");
            System.out.println("Ingrese una opcion:");
            menuDeOpciones = sc.nextInt(); //opcion a escoger
            System.out.println();
        }


    }
}
