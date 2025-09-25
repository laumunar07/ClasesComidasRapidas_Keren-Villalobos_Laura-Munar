import java.util.ArrayList;
import java.util.Scanner;

class ClaseMenu2 {
    private ArrayList<ClaseMenu> eleccion = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);


    public void agregarComida(String tipo, String receta, String tamano) {
        eleccion.add(new ClaseMenu(tipo, receta, tamano));
    }

    public void editarPedido(int index, String nuevoTipo, String nuevaReceta, String nuevoTamano){
        if (index >= 0 && index < eleccion.size()){
            ClaseMenu  comida = eleccion.get(index);
                comida.setTipo(nuevoTipo);
                comida.setReceta(nuevaReceta);
                comida.setTamano(nuevoTamano);
            System.out.println("Pedido actualizado correctamente.");
        } else {
            System.out.println("Opción inválida");
        }
    }

//Operación que seleccionar pedido a editar
    public int seleccionarPedido() {
         mostrarPedidos();
        if (eleccion.isEmpty()){
            return - 1;
        } 
        System.out.print("Ingrese el número del pedido: ");
        int index = entrada.nextInt() - 1;
        entrada.nextLine(); // limpiar buffer

        if (index >= 0 && index < eleccion.size()) {
            return index;
        } else {
            System.out.println("Índice inválido.");
            return -1;
        }
    }

    public void reemplazarPedido(int index, ClaseMenu nuevo) {
        if (index >= 0 && index < eleccion.size()) {
            eleccion.set(index, nuevo);

            System.out.println("Pedido reemplazado correctamente.");
        } else {
            System.out.println("Índice inválido.");
        }
    }


    public void mostrarPedidos() {
        System.out.println("\n======= RESUMEN DE PEDIDOS =======");
        if (eleccion.isEmpty()) {
            System.out.println("No se realizaron pedidos.");
        } else {
            for (int i = 0; i < eleccion.size(); i++) {
                ClaseMenu comida = eleccion.get(i);
                System.out.printf("%d. %s - %s - %s%n",
                i + 1, comida.getTipo(), comida.getReceta(), comida.getTamano());
            
            }
        }
        System.out.println("==================================");
    }

    public void borrarPedido() {
        int index = seleccionarPedido();
        if (index != -1) {
            eleccion.remove(index);
            System.out.println("Pedido eliminado.");
        }
    }
}

