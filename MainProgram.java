import java.util.Scanner;

public class MainProgram {
    private static Perro perro1, perro2;
    private static Scanner scanner;

    public static void main(String[] args) {
        perro1 = new Perro();
        perro2 = new Perro();
        scanner = new Scanner(System.in);
        
        System.out.println("¿Cuál el nombre del primer perro?: ");
        perro1.setNombre(scanner.nextLine());
        System.out.println("¿Cuál es la raza del primer perro?: ");
        perro1.setRaza(scanner.nextLine());
        System.out.println("¿Cuál es la edad del primer perro?: ");
        perro1.setEdad(scanner.nextInt());
        System.out.println("¿Cuál es el peso del primer perro?: ");
        perro1.setPeso(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("¿Cuál es el nombre del segundo perro?: ");
        perro2.setNombre(scanner.nextLine());
        System.out.println("¿Cuál es la raza del segundo perro?: ");
        perro2.setRaza(scanner.nextLine());
        System.out.println("¿Cuál es la edad del segundo perro?: ");
        perro2.setEdad(scanner.nextInt());
        System.out.println("¿Cuál es el peso del segundo perro?: ");
        perro2.setPeso(scanner.nextDouble());

        perro1.comer("croquetas", 100);
        System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());
        perro2.comer("pollo", 150);
        System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());
        
        scanner.close();
    }
}
