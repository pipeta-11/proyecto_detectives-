import java.util.Scanner;
 public class CasoDetective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = {"Victoria Mendoza", "Bruno Castellano", "Simon Quiroga", "Aurelio Vasquez"};
        boolean[] activos = {true, true, true, true};
        int opcion = 0;

        System.out.println(" Caso de investigacion ");
        System.out.print("Hola detective, cual es tu nombre?: ");
        String nombre = sc.nextLine();

        while (opcion != 3) {
            System.out.println("Hola " + nombre + ". Que quieres hacer?");
            System.out.println("\n1. Interrogar  2. Resolver  3. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("A quien interrogas?");
                for (int i = 0; i < 4; i++) {
                    if (activos[i]) System.out.println(i + ". " + nombres[i]);
                }
                int s = sc.nextInt();
               
               
                if (s == 0) System.out.println("Victoria: 'Yo lavaba mi blusa por una mancha de vino tinto.' (Nota: Ese dia sirvieron vino blanco!)");
                else if (s == 1) System.out.println("Bruno: 'Yo me hice la cicatriz arreglando una valla, puedes comprobarlo.'");
                else if (s == 2) System.out.println("Simon: 'Yo no escribi  la nota. Solo la recogi del escritorio.'");
                else if (s == 3) System.out.println("Aurelio: 'Yo me fui a las 22:30.' (Nota: El taxista dice que lo recogio a las 00:15)");

                System.out.print("¿Descartar a este sospechoso? (1: Si, 2: No): ");
                if (sc.nextInt() == 1) activos[s] = false;

            } else if (opcion == 2) {
                System.out.print("Escribe el nombre del culpable: ");
                sc.nextLine();
                String culpable = sc.nextLine().toLowerCase();

                if (culpable.contains("aurelio")) {
                    System.out.println("¡CORRECTO! Don Aurelio mintio sobre su hora de salida y enveneno la copa[cite: 107].");
                    opcion = 3;
                } else {
                    System.out.println("Incorrecto. Sigue buscando pistas.");
                }
            }
        }
        System.out.println("Buen trabajo, detective " + nombre);
    }
}


