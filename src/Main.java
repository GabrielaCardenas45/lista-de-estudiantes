import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = sc.nextInt();

        int[] edades = new int[cantidadEstudiantes];

        int mayoresCinco = 0,  sumaMayoresCinco = 0, menoresCinco = 0, sumaMenoresCinco = 0, igualACinco = 0;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            edades[i] = sc.nextInt();

            if (edades[i] > 5) {
                mayoresCinco++;
                sumaMayoresCinco += edades[i];
            } else if (edades[i] < 5) {
                menoresCinco++;
                sumaMenoresCinco += edades[i];
            } else {
                igualACinco++;
            }
        }
        if (mayoresCinco == 0) {
            System.out.println("no se puede sacar la media de los estudiantes mayores de 5");
        }
        else {
            igualACinco = sumaMayoresCinco / mayoresCinco;
            System.out.println("La media de los mayores 5 es: "+mayoresCinco);
        }
        if (menoresCinco == 0) {
            System.out.println("no se puede sacar la media de los estudiantes menores de 5");
        }
        else {
            igualACinco = menoresCinco / sumaMenoresCinco;
            System.out.println("La media de los estudiantes menores 5 es: "+menoresCinco);
        }
        System.out.println("La cantidad de estudiantes que tiene exactamente 5 años es: "+igualACinco);
    }
}