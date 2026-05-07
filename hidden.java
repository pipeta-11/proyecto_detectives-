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

        System.out.print("Cual es tu edad?: ");
        int edad = sc.nextInt();

        if (edad < 12) {

            System.out.println("Todavia eres muy joven para ser detective");

        } else if (edad >= 12 && edad <= 17) {

            System.out.println("Puedes ser un detective junior");

        } else if (edad >= 18 && edad <= 59) {

            System.out.println("Bienvenido al equipo de detectives");

        } else if (edad >= 60) {

            System.out.println("Eres un detective experimentado");
        }

        System.out.print("Cuantas pistas encontraste?: ");
        int pistas = sc.nextInt();

        if (pistas >= 5) {

            System.out.println("Eres un detective excepcional");
            System.out.println("Puedes resolver el caso.");

        } else if (pistas >= 3) {

            System.out.println("Buen trabajo detective");
            System.out.println("Necesitas unas pistas más.");

        } else if (pistas >= 1) {

            System.out.println("Vas por buen camino");
            System.out.println("Sigue investigando");

        } else if (pistas == 0) {

            System.out.println("Debes tener pistas");
            System.out.println("Necesitas al menos una.");
        }

        while (opcion != 3) {

            System.out.println("Hola " + nombre + ". Que quieres hacer?");
            System.out.println("\n1. Interrogar  2. Resolver  3. Salir");

            opcion = sc.nextInt();

            if (opcion == 1) {

                System.out.println("A quien interrogas?");

                for (int i = 0; i < 4; i++) {

                    if (activos[i]) {

                        System.out.println(i + ". " + nombres[i]);
                    }
                }

                int s = sc.nextInt();

                if (s == 0) {

                    System.out.println("Victoria: 'Yo lavaba mi blusa por una mancha de vino tinto.' (Nota: Ese dia sirvieron vino blanco!)");

                } else if (s == 1) {

                    System.out.println("Bruno: 'Yo me hice la cicatriz arreglando una valla, puedes comprobarlo.'");

                } else if (s == 2) {

                    System.out.println("Simon: 'Yo no escribi  la nota. Solo la recogi del escritorio.'");

                } else if (s == 3) {

                    System.out.println("Aurelio: 'Yo me fui a las 22:30.' (Nota: El taxista dice que lo recogio a las 00:15)");
                }

                System.out.print("¿Descartar a este sospechoso? (1: Si, 2: No): ");

                if (sc.nextInt() == 1) {

                    activos[s] = false;
                }

            } else if (opcion == 2) {

                System.out.print("Escribe el nombre del culpable: ");

                sc.nextLine();

                String culpable = sc.nextLine().toLowerCase();

                if (culpable.contains("aurelio")) {

                    System.out.println("¡CORRECTO! Don Aurelio mintio sobre su hora de salida y enveneno la copa.");

                    opcion = 3;

                } else {

                    System.out.println("Incorrecto. Sigue buscando pistas.");
                }
            }
        }

        System.out.println("Buen trabajo, detective " + nombre);

        System.out.println("\nREGISTRO DEL POLICIA");

        System.out.print("Id: ");
        int id = sc.nextInt();

        System.out.print("Experiencia: ");
        int experiencia = sc.nextInt();

        System.out.print("Telefono: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombrePolicia = sc.nextLine();

        System.out.print("Agencia: ");
        String agencia = sc.nextLine();

        System.out.print("Rango: ");
        String rango = sc.nextLine();

        System.out.print("Arma: ");
        String arma = sc.nextLine();

        System.out.print("Estacion: ");
        String estacion = sc.nextLine();

        System.out.print("Acompanante: ");
        String acompanante = sc.nextLine();

        System.out.print("Area: ");
        String area = sc.nextLine();

        Policia p1 = new Policia(
                id,
                experiencia,
                telefono,
                nombrePolicia,
                agencia,
                rango,
                arma,
                estacion,
                acompanante,
                area
        );

        p1.reportar();

        System.out.println(p1.obtenerInfo());
    }
}

class Policia
{
    protected int id;
    protected int experiencia;
    protected int telefono;
    protected String arma;
    protected String estacion;
    protected String acompanante;
    protected String area;
    protected String nombre;
    protected String agencia;
    protected String rango;

    public Policia(int id, int experiencia, int telefono, String nombre, String agencia, String rango, String arma, String estacion, String acompanante, String area)
    {
        this.id = id;
        this.nombre = nombre;
        this.agencia = agencia;
        this.rango = rango;
        this.experiencia = experiencia;
        this.telefono = telefono;
        this.arma = arma;
        this.acompanante = acompanante;
        this.area = area;
        this.estacion = estacion;
    }

    public void reportar()
    {
        System.out.println(nombre + " reportar a " + agencia);
    }

    public String obtenerInfo()
    {
        return nombre + "[" + rango + "]";
    }
}
