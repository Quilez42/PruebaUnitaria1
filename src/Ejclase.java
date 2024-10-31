import java.util.Scanner;

public class Ejclase {
    public static void main(String[] args) {
        int op;
        do {
            Scanner sc =new Scanner(System.in);
            System.out.println("1-Introducir datos\n2-Calcular area\n3-Calcular perimetro\n4-Salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    introducirDatos();
                    break;
                case 2:
                    area();
                    break;

                case 3:
                    perimetro();
                    break;

                default:System.out.println("Selecciona una opción válida");
            }
        } while (op!=4);
    }
    static double num1;
    static double num2;
    public static void introducirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del rectángulo");
        num1 = sc.nextDouble();
        System.out.println("Introduce la anchura del rectángulo");
        num2 = sc.nextDouble();
        sc.close();
    }
    public static void perimetro() {
        double per = (num1 * 2)+(num2*2);
        System.out.println("El perimetro del rectángulo es: "+per);
    }
    public static void area() {
        double ar = num1*num2;
        System.out.println("El perimetro del rectángulo es: "+ar);
    }
}