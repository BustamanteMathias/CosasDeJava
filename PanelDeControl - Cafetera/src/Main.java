import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Cafetera c = new Cafetera();
        PanelControl panel = new PanelControl(c);

        do {
            System.out.println("CAFETERA INTELIGENTE Y SU PANEL DE CONTROL");
            System.out.println("\t[1] Encender/Apagar");
            System.out.println("\t[2] Elegir tamaño");
            System.out.println("\t[3] Preparar cafe");
            System.out.println("\t[4] Mostrar estado");
            System.out.println("[0] SALIR");
            System.out.print("[SELECCION]: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    panel.presionarEncendido();
                    break;
                case 2:
                    System.out.println("[ELEGIR] chica - mediana - grande: ");
                    panel.elegirTamaño(sc.nextLine());
                    break;
                case 3:
                    panel.prepararCafe();
                    break;
                case 4:
                    panel.mostrarEstado();
                    break;
                default:
                    System.out.println("[ERROR] OPCION NO VALIDA");
            }
        } while (option != 0);

        sc.close();
    }
}