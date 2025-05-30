package Entidades;
import java.util.Comparator;
import java.util.List;

public abstract class Nave implements Comparable<Nave> {
    protected String nombre;
    protected int capacidadTripulacion;
    protected int  anioDeLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public void setCapacidadTripulacion(int capacidadTripulacion) {
        this.capacidadTripulacion = capacidadTripulacion;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Nave aux = (Nave) obj;
        return this.getNombre().equals(aux.getNombre())
                && this.getAnioDeLanzamiento() == aux.getAnioDeLanzamiento();
    }

    public static boolean mostrarNaves(List<Nave> list){
        if (list == null || list.isEmpty()) {return false;}

        System.out.println("[LISTA DE NAVES ESTELARES]");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + (i+1) + "] " + list.get(i).toString());
        }
        return true;
    }

    public static boolean agregarNave(Nave n, List<Nave> list){
        if (list == null || list.contains(n)) {return false;}
        list.add(n);

        return true;
    }

    public static boolean iniciarExploracion(List<Nave> list){
        if (list == null || list.isEmpty()) {return false;}

        System.out.println("\n[INICIANDO EXPLORACIONES]");
        for (Nave n : list){
            switch (n.getClass().getSimpleName()){
                case "NaveExploracion":
                    System.out.println(((NaveExploracion)n).iniciarExploracion());;
                    break;
                case  "Carguero":
                    System.out.println(((Carguero)n).iniciarExploracion());;
                    break;
                case  "CruceroEstelar":
                    System.out.println(((CruceroEstelar)n).iniciarExploracion());;
                    break;
                default:
                    System.out.println(n.getClass());
                    break;
            }
        }

        return true;
    }

    public abstract String iniciarExploracion();

    @Override
    public int compareTo(Nave n) {
        return this.getNombre().compareToIgnoreCase(n.getNombre());
    }

    public static void ordenarCriterio(List<Nave> list, Comparator<Nave> criterio) {
        list.sort(criterio);
    }
}
