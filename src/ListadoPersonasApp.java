import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //defino al lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();

        boolean salir = false;
        while (!salir){
            mostrarMenu();
            try{
                salir = ejectuarOperacion(consola, personas);
            }catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static boolean ejectuarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        boolean salir = false;
        // verificamos la opcion proporcionada
        switch (opcion){
            case 1:
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var mail = consola.nextLine();
                // crear el objeto
                var persona = new Persona(nombre, tel, mail);
                //lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
                break; //fin caso 1
            case 2:
                System.out.println("Listado de Personas: ");
                //Mejora usando lambda
                //personas.forEach((persona) -> System.out.println("persona"));
                //metodo de referencia
                personas.forEach(System.out::println);
                break; //fin caso 2
            case 3:
                System.out.println("Hasta pronto...");
                salir = true;
                break;
            default:
                System.out.println("Opcion erronea: " + opcion);
                break;
        }//fin switch
        return salir;
    }

    private static void mostrarMenu(){
        System.out.println("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion: ");
    }
}