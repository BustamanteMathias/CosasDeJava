import Utilidades_UTN.Controlador;
import Utilidades_UTN.ManejadorDeDatos;

public class Main {
    public static void main(String[] args) {
        int opcion;
        final String MAIN_MENU = """
                ___________________________________________________________________________________
                [MODELO DE PARCIAL]
                 \t[1] Test.
                \t\t[0] SALIR.
                \s
                [OPCION]:\s""";

        do {
            opcion = ManejadorDeDatos.getIntRange(MAIN_MENU, "[ERROR] Opcion no valida.\n", 0, 5);
            switch (opcion) {
                case 0:
                    System.out.println("[PROGRAMA FINALIZADO]");
                    break;
                case 1:
                    Controlador.Controller_Opcion_01();
                    break;
                default:
                    System.out.println("[ERROR] Opcion no valida.");
                    break;
            }
        } while (opcion != 0);
    }
}