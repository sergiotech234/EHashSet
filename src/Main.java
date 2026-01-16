import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<String> registro = new HashSet<String>();

        int opcion;
        do {
            System.out.println("Introduce tarea que desea buscar: ");
            System.out.println("1.Registrar un email nuevo");
            System.out.println("2. Muestra los emails");
            System.out.println("3. Comprobar los emails existentes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("email insertado por posicion: ");
                    String nuevaEmail = teclado.next();

                    if (registro.contains(nuevaEmail)) {
                        System.out.println("El email existe en el sistema");
                    } else {
                        registro.add(nuevaEmail);
                        System.out.println("Correo registrado");
                    }
                    break;
                case 2:
                    if (registro.isEmpty()) {
                        System.out.println("Email no encontrados");
                    } else {
                        for (String email : registro) {
                            System.out.println(email);
                        }
                    }
                        break;
                        case 3:
                            System.out.println("email insertado por posicion: ");
                            String ComprobarEmail = teclado.next();

                            if (registro.contains(ComprobarEmail)) {
                                System.out.println("El email existe en el sistema");
                            } else {
                                System.out.println("Correo registrado por otra persona");
                            }
                            break;

                        case 0:
                            System.out.println("Salir");
                            break;

                        default:
                            System.out.println("Error");
                    }

        } while (opcion != 0) ;
            teclado.close();

    }
}
