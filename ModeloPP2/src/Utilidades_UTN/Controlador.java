package Utilidades_UTN;
import Entidades.*;

import java.util.*;

public class Controlador {
    public static void Controller_Opcion_01() {
        List<Nave> list = new ArrayList<>();

        Nave.agregarNave(new NaveExploracion("NaveExploracion",  8, 2, TipoMision.CARTOGRAFÍA), list);
        Nave.agregarNave(new Carguero("Carguero",  8, 11, 1), list);
        Nave.agregarNave(new CruceroEstelar("CruceroEstelar",  3, 5, 500), list);
        Nave.mostrarNaves(list);
        Nave.iniciarExploracion(list);

        Nave.ordenarCriterio(list, Comparator.comparing(Nave::getAnioDeLanzamiento));
        Nave.mostrarNaves(list);
        Nave.ordenarCriterio(list, Comparator.comparing(Nave::getAnioDeLanzamiento).reversed());
        Nave.mostrarNaves(list);
        Nave.ordenarCriterio(list, Comparator.comparing(Nave::getCapacidadTripulacion));
        Nave.mostrarNaves(list);
        Nave.ordenarCriterio(list, Comparator.comparing(Nave::getCapacidadTripulacion).reversed());
        Nave.mostrarNaves(list);
        Collections.sort(list);
        Nave.mostrarNaves(list);
        Collections.sort(list.reversed());
        Nave.mostrarNaves(list);
    }
}
