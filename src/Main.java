import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double USD = 20.00;
        double  BRL= 0.28;
        double MX = 1.00;
        double BRLU=5.43;
        double res= 0;
        double lectura=0;
        int opcion = 0;



        System.out.println("***************************************");
        System.out.println("\n Bienvenido a la aplicacion para convertir monedas");
        System.out.println("Ingrese el tipo de cambio que requiera de acuerdo al menu");
        Scanner teclado = new Scanner(System.in);

        String menu = """

                1- Convertir de dolares a pesos mexicanos
                2- Convertir de pesos mexicanos a dolares
                3- Convertir de reales a pesos mexicanos
                4- Convertir de pesos mexicanos a reales
                5- Convertir de reales a dolares
                6- Convertir de dolares a reales
                9- Salir
                """;

        while(opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            Scanner lecturas = new Scanner(System.in);
            switch (opcion){
                case 1:
                    System.out.println("Cual es el monto de dolares que desea convertir en pesos mexicanos: ");
                    lectura = lecturas.nextDouble();
                    res= lectura * USD;
                    System.out.println("El total en pesos mexicanos: " + "$" + res );
                    break;
                case 2:
                    System.out.println("Cual es el monto de pesos que desea convertir en dolares: ");
                    lectura = lecturas.nextDouble();
                    res= lectura / USD;
                    System.out.println("El total en dolares es: " + "$" + res );
                    break;
                case 3:
                     System.out.println("Cual es el monto de reales que desea convertir en pesos mexicanos: ");
                    lectura = lecturas.nextDouble();
                    res= lectura * BRL;
                    System.out.println("El total en pesos mexicanos es: " + "$" + res );
                    break;
                case 4:
                    System.out.println("Cual es el monto de pesos mexicanos que desea convertir en reales: ");
                    lectura = lecturas.nextDouble();
                    res= lectura / BRL;
                    System.out.println("El total en reales es: " + "$" + res );
                    break;
                case 5:
                    System.out.println("Cual es el monto de reales que desea convertir en dolares: ");
                    lectura = lecturas.nextDouble();
                    res= lectura / BRLU;
                    System.out.println("El total en pesos mexicanos es: " + "$" + res );
                    break;
                case 6:
                    System.out.println("Cual es el monto de dolares que desea convertir en reales: ");
                    lectura = lecturas.nextDouble();
                    res= lectura * BRLU;
                    System.out.println("El total en reales es: " + "$" + res );
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("La opcion no es valida");
            }

        }
    }
}