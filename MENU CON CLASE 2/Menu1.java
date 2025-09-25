import java.util.Scanner;

public class Menu1 {
    static Scanner entrada = new Scanner(System.in);
    static ClaseMenu2 clase = new ClaseMenu2();

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = mostrarMenu("Bienvenido a FOOD DIVERSITY",
                new String[]{"Crear Pedido", "Ver Pedido", "Editar Pedido", "Eliminar Pedido", "Terminar"}
            );

            switch (opcion) {
                case 1: 
                    crearPedido(-1);
                    break;
                case 2: 
                    clase.mostrarPedidos();
                    break;
                case 3: { 
                    int index = clase.seleccionarPedido();
                    if (index != -1) {
                        crearPedido(index); 
                    }
                    break;
                }
                case 4: 
                    clase.borrarPedido();
                    break;
                case 5: 
                    System.out.println("Programa Terminado");
                    clase.mostrarPedidos();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    // METODO QUE CREA PEDIDO 
    public static void crearPedido(int index) {
        int opcion;
        do {
            opcion = mostrarMenu(
                "FOOD DIVERSITY",         
                new String[]{"Hamburguesa", "Pizza", "Perro Caliente", "Empanada", "Pollo", "Terminar"}
            );

            ClaseMenu nuevo = null;

            switch (opcion) {
                case 1: nuevo = menuHamburguesa(); break;
                case 2: nuevo = menuPizza(); break;
                case 3: nuevo = menuPerro(); break;
                case 4: nuevo = menuEmpanada(); break;
                case 5: nuevo = menuPollo(); break;
                case 6: break;    
            }

            if (nuevo != null) {
                if (index == -1) {
                    clase.agregarComida(nuevo.getTipo(), nuevo.getReceta(), nuevo.getTamano());
                } else {
                    clase.reemplazarPedido(index, nuevo);
                }
            }
        } while (opcion != 6);
    }

    // PLANTILLA DE MENÚS
    public static int mostrarMenu(String titulo, String[] opciones) {
        System.out.println("\n----------------------");
        System.out.println("|    " + titulo + "   |");
        System.out.println("----------------------");
        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("%d. %s%n", i + 1, opciones[i]);
        }

        System.out.print("¿Qué desea? ");
        return entrada.nextInt();
    }

    // MENU HAMBURGUESA
    public static ClaseMenu menuHamburguesa() {
        int opcion = mostrarMenu("Hamburguesa",
            new String[]{"Doble", "Ranchera", "Madurita", "BBQ", "Atrás"});
        String receta = null;

        switch (opcion) {
            case 1: receta = "Hamburguesa Doble"; break;
            case 2: receta = "Hamburguesa Ranchera"; break;
            case 3: receta = "Hamburguesa Madurita"; break;
            case 4: receta = "Hamburguesa BBQ"; break;
            case 5: return null;
            default: System.out.println("Opción no válida");
        }
        if (receta != null) {
            String tamano = menuTamano();
            return new ClaseMenu("Hamburguesa", receta, tamano);
        }
        return null;
    }

    //MENU PIZZA
    public static ClaseMenu menuPizza() {
        int opcion = mostrarMenu("Pizza",
            new String[]{"Hawaiana", "Carnes", "Champiñones", "Ranchera", "Atrás"});
        String receta = null;

        switch (opcion) {
            case 1: receta = "Pizza Hawaiana"; break;
            case 2: receta = "Pizza de Carnes"; break;
            case 3: receta = "Pizza de Champiñones"; break;
            case 4: receta = "Pizza Ranchera"; break;
            case 5: return null;
            default: System.out.println("Opción no válida");
        }
        if (receta != null) {
            String tamano = menuTamano1();
            return new ClaseMenu("Pizza", receta, tamano);
        }
        return null;
    }

    //MENU PERRO CALIENTE
    public static ClaseMenu menuPerro() {
        int opcion = mostrarMenu("Perro Caliente",
            new String[]{"Americano", "Doble", "Especial", "Ranchero", "Atrás"});
        String receta = null;

        switch (opcion) {
            case 1: receta = "Perro Americano"; break;
            case 2: receta = "Perro Doble"; break;
            case 3: receta = "Perro Especial"; break;
            case 4: receta = "Perro Ranchero"; break;
            case 5: return null;
            default: System.out.println("Opción no válida");
        }
        if (receta != null) {
            String tamano = menuTamano();
            return new ClaseMenu("Perro Caliente", receta, tamano);
        }
        return null;
    }

    //MENU EMPANADA
    public static ClaseMenu menuEmpanada() {
        int opcion = mostrarMenu("Empanada",
            new String[]{"Pollo", "Carne", "Lechona", "Vegana", "Atrás"});
        String receta = null;

        switch (opcion) {
            case 1: receta = "Empanada de Pollo"; break;
            case 2: receta = "Empanada de Carne"; break;
            case 3: receta = "Empanada de Lechona"; break;
            case 4: receta = "Empanada Vegana"; break;
            case 5: return null;
            default: System.out.println("Opción no válida");
        }
        if (receta != null) {
            String tamano = menuTamano();
            return new ClaseMenu("Empanada", receta, tamano);
        }
        return null;
    }

    //MENU POLLO
    public static ClaseMenu menuPollo() {
        int opcion = mostrarMenu("Pollo",
            new String[]{"Asado", "Broaster", "Frito", "BBQ", "Atrás"});
        String receta = null;

        switch (opcion) {
            case 1: receta = "Pollo Asado"; break;
            case 2: receta = "Pollo Broaster"; break;
            case 3: receta = "Pollo Frito"; break;
            case 4: receta = "Pollo BBQ"; break;
            case 5: return null;
            default: System.out.println("Opción no válida");
        }
        if (receta != null) {
            String tamano = menuTamano1();
            return new ClaseMenu("Pollo", receta, tamano);
        }
        return null;
    }

    // MENU TAMAÑO PARA PIZZA Y POLLO
    public static String menuTamano1() {
        int opcion = mostrarMenu("Tamaño",
            new String[]{"Personal", "Familiar", "Menú Principal"});
        switch (opcion) {
            case 1: return "Tamaño: Personal";
            case 2: return "Tamaño: Familiar";
            case 3: return null;
            default:
                System.out.println("Opción no válida");
                return null;
        }
    }

    //MENU TAMAÑO PARA HAMBURGUESA, EMPANADA Y PERRO CALIENTE
    public static String menuTamano() {
        int opcion = mostrarMenu("Tamaño",
            new String[]{"Junior", "Big", "Menú Principal"});
        switch (opcion) {
            case 1: return "Tamaño: Junior";
            case 2: return "Tamaño: Big";
            case 3: return null;
            default:
                System.out.println("Opción no válida");
                return null;
        }
    }
}