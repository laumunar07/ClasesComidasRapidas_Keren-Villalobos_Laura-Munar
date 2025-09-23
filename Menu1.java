//Laura Munar //Keren Villalobos
import java.util.ArrayList;
import java.util.Scanner;

public class Menu1 {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<String> elecciones = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        
        do {

            //MENU PRINCIPAL 
            opcion = mostrarMenu(
                "FOOD DIVERSITY",
                new String[]{"Hamburguesa", "Pizza", "Perro Caliente", "Empanada", "Pollo", "Terminar"}
            );

            switch (opcion) {
                case 1: menuHamburguesa(); break;
                case 2: menuPizza(); break;
                case 3: menuPerro(); break;
                case 4: menuEmpanada(); break;
                case 5: menuPollo(); break;
                case 6: 
                    System.out.println("Programa Terminado");
                    mostrarResumen();
                    break;
                default:
                    System.out.println("Opción no Válida");
                
            }
        } while (opcion !=6);
    }

    // PLANTILLA DE MENUS O FORMATO DE IMPRESION DE LOS MENUS
    public static int mostrarMenu(String titulo, String[] opciones) {
        System.out.println("\n----------------------");
        System.out.println("|    "+ titulo +"   |");
        System.out.println("----------------------");
            for (int i = 0; i < opciones.length; i++) {
                System.out.printf("%d. %s%n", i + 1, opciones[i]);
            }

        System.out.print("¿Qué desea? ");
        return entrada.nextInt();
    }


    //MENU DE HAMBURGUESA
    public static void menuHamburguesa() {
        int opcion = mostrarMenu("Hamburguesa",
            new String[]{"Doble", "Ranchera", "Madurita", "BBQ", "Atrás"});
        switch (opcion) {
            case 1: elecciones.add("Hamburguesa Doble"); menuTamaño(); break;
            case 2: elecciones.add("Hamburguesa Ranchera"); menuTamaño(); break;
            case 3: elecciones.add("Hamburguesa Madurita"); menuTamaño(); break;
            case 4: elecciones.add("Hamburguesa BBQ"); menuTamaño(); break;
            case 5: break;

            default:
                System.out.println("Opción no Válida");
        }
    }

    //MENU DE PIZZA
    public static void menuPizza() {
        int opcion = mostrarMenu("Pizza",
            new String[]{"Hawaiana", "Carnes", "Champiñones", "Ranchera", "Atrás"});
        switch (opcion) {
            case 1: elecciones.add("Pizza Hawaiana"); menuTamaño1(); break;
            case 2: elecciones.add("Pizza Carnes"); menuTamaño1(); break;
            case 3: elecciones.add("Pizza Champiñones"); menuTamaño1(); break;
            case 4: elecciones.add("Pizza Ranchera"); menuTamaño1(); break;
            case 5: break;
            default:
                 System.out.println("Opción no Válida");
        }
    }

    //MENU DE PERROS CALIENTES
    public static void menuPerro() {
        int opcion = mostrarMenu("Perro Caliente",
            new String[]{"Americano", "Doble", "Especial", "Ranchero", "Atrás"});
        switch (opcion) {
            case 1: elecciones.add("Perro Americano"); menuTamaño(); break;
            case 2: elecciones.add("Perro Doble"); menuTamaño(); break;
            case 3: elecciones.add("Perro Especial"); menuTamaño(); break;
            case 4: elecciones.add("Perro Ranchero"); menuTamaño(); break;
            case 5: break;
            default:
                System.out.println("Opción no Válida");
        }
    }

    //MENU DE EMPANADAS
    public static void menuEmpanada() {
        int opcion = mostrarMenu("Empanada",
            new String[]{"Pollo", "Carne", "Lechona", "Vegana", "Atrás"});
        switch (opcion) {
            case 1: elecciones.add("Empanada de Pollo"); menuTamaño(); break;
            case 2: elecciones.add("Empanada de Carne"); menuTamaño(); break;
            case 3: elecciones.add("Empanada de Lechona"); menuTamaño(); break;
            case 4: elecciones.add("Empanada Vegana"); menuTamaño(); break;
            case 5: break;
            default:
                System.out.println("Opción no Válida");
        }
    }

    //MENU DE POLLO
    public static void menuPollo() {
        int opcion = mostrarMenu("Pollo",
            new String[]{"Asado", "Broaster", "Frito", "BBQ", "Atrás"});
        switch (opcion) {
            case 1: elecciones.add("Pollo Asado"); menuTamaño1(); break;
            case 2: elecciones.add("Pollo Broaster"); menuTamaño1(); break;
            case 3: elecciones.add("Pollo Frito"); menuTamaño1(); break;
            case 4: elecciones.add("Pollo BBQ"); menuTamaño1(); break;
            case 5: break;
            default:
                System.out.println("Opción no Válida");
        }
    }

    //MENU TAMAÑO PARA POLLO Y PIZZA
    public static void menuTamaño1() {
        int opcion = mostrarMenu("Tamaño",
            new String[]{"Personal", "Familiar", "Menú Principal"});
        switch (opcion) {
            case 1: 
                elecciones.add("Tamaño: Personal");
                System.out.println("Pedido agregado");
            break;

            case 2: 
                elecciones.add("Tamaño: Familiar");
                System.out.println("Pedido agregado");
            break;

            case 3: break;
            default:
                System.out.println("Opción no Válida");
        }
    }

    //MENU TAMAÑO PARA HAMBURGUESA, PERRO CALIENTE Y EMPANADA
   public static void menuTamaño() {
        int opcion = mostrarMenu("Tamaño",
            new String[]{"Junior", "Big", "Menú Principal"});
        switch (opcion) {
            case 1: 
                elecciones.add("Tamaño: Personal");
                System.out.println("Pedido agregado");
            break;

            case 2: 
                elecciones.add("Tamaño: Familiar");
                System.out.println("Pedido agregado");
            break;

            case 3: break;
            default:
                System.out.println("Opción no Válida");
        }
    }

    // MOSTRAR RESULTADO DE PEDIDO REALIZADO
    public static void mostrarResumen() {
        System.out.println("\n======= RESUMEN DE PEDIDOS =======");
            if (elecciones.isEmpty()) {
                System.out.println("No se realizaron pedidos.");
            } else {
                for (int i = 0; i < elecciones.size(); i++) {
                System.out.println((i + 1) + ". " + elecciones.get(i));
                }
            }
        System.out.println("==================================");
    }

}
