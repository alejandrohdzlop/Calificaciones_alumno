public class CalificacionesAlumno {
    // Atributos de la clase
    private String nombre;
    private double[] calificaciones = new double[5];

    // Constructor para inicializar el nombre y las calificaciones
    public CalificacionesAlumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método que calcula el promedio de las calificaciones
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método que determina la calificación final en base al promedio
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método que imprime los resultados del estudiante
    public void imprimirResultados(String nombre, double[] calificaciones, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Definir las calificaciones del alumno
        double[] calificaciones = {85, 90, 78, 92, 88};

        // Crear una instancia de la clase CalificacionesAlumno
        CalificacionesAlumno alumno = new CalificacionesAlumno("Juan Pérez", calificaciones);

        // Calcular el promedio
        double promedio = alumno.calcularPromedio(calificaciones);

        // Obtener la calificación final
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);

        // Imprimir los resultados
        alumno.imprimirResultados(alumno.nombre, calificaciones, promedio, calificacionFinal);
    }
}
