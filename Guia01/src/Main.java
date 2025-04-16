
public class Main {
    public static void main(String[] args) {
        //Guia_01_Test_Ejercicios(1);
        //Guia_01_Test_Ejercicios(2);
        //Guia_01_Test_Ejercicios(3);
        //Guia_01_Test_Ejercicios(4);
        //Guia_01_Test_Ejercicios(5);
        //Guia_01_Test_Ejercicios(6);
        //Guia_01_Test_Ejercicios(7);
        //Guia_01_Test_Ejercicios(8);
        //Guia_01_Test_Ejercicios(9);
        Guia_01_Test_Ejercicios(10);
    }

    private static void Guia_01_Test_Ejercicios(int ejercicioCulero){
        switch (ejercicioCulero){
            case 1:
                //EJERCICIO 1
                Rectangulo r1 = new Rectangulo();
                r1.SetAncho(10);
                r1.SetAncho(-10);
                r1.SetAlto(100);

                System.out.println("Alto: " + r1.GetAlto());
                System.out.println("Ancho: " + r1.GetAncho());
                System.out.println("Perimetro: " + r1.GetPerimetro());
                System.out.println("Area: " + r1.GetArea());
                System.out.println("Es Cuadrado?: " + r1.EsCuadrado());

                r1.SetAncho(10);
                r1.SetAlto(10);
                System.out.println("\n");
                System.out.println("Alto: " + r1.GetAlto());
                System.out.println("Ancho: " + r1.GetAncho());
                System.out.println("Es Cuadrado?: " + r1.EsCuadrado());
                break;
            case 2:
                //EJERCICIO 2
                Circulo c1 = new Circulo();
                c1.SetRadio(100);
                System.out.println("Radio: " + c1.GetRadio());
                System.out.println("Perimetro: " + c1.GetPerimetro());
                System.out.println("Area: " + c1.GetArea());

                System.out.println();
                c1.ModifierRadio(100);
                System.out.println("Radio: " + c1.GetRadio());
                System.out.println("Area: " + c1.GetArea());

                System.out.println();
                c1.ModifierRadio(-50);
                System.out.println("Radio: " + c1.GetRadio());
                System.out.println("Area: " + c1.GetArea());
                break;
            case 3:
                //EJERCICIO 3
                Persona p1 = new Persona();
                p1.SetNombre("Mathias");
                p1.SetEdad(31);
                p1.SetAltura(1.7);
                System.out.println("Nombre: " + p1.GetNombre());
                System.out.println("Edad: " + p1.GetEdad());
                System.out.println("Altura: " + p1.GetAltura());
                System.out.println("Es Mayor de Edad: " + p1.EsMayorDeEdad());
                System.out.println("Calculo de IMC: " + p1.CalcularIMC(70));
                break;
            case 4:
                //EJERCICIO 4
                Coche cc1 = new Coche("Toyota", "Yaris", 55);
                System.out.println("Kilometraje Actual: " + cc1.getKilometraje());
                System.out.println("Autonomia: " + cc1.CalcularAutonomiaKM());
                System.out.println("Kilometraje Actual: " + cc1.getKilometraje());
                System.out.println("... Recargando 40l de combustible");
                cc1.RecargarCombustible(40);
                System.out.println("Autonomia: " + cc1.CalcularAutonomiaKM());
                System.out.println("Kilometraje Actual: " + cc1.getKilometraje());
                break;
            case 5:
                //EJERCICIO 5
                CuentaBancaria cb1 = new CuentaBancaria();
                cb1.setTitular("Mathias");
                cb1.setNumeroDeCuenta(4000400040004000L);
                cb1.setSaldo(1000000);

                System.out.println("Saldo Disponible: " + cb1.ConsultarSaldo());
                System.out.println("Depositando 100...");
                cb1.Deposiar(100);
                System.out.println("Saldo Disponible: " + cb1.ConsultarSaldo());
                System.out.println("Retirando 200...");
                cb1.Retirar(200);
                System.out.println("Saldo Disponible: " + cb1.ConsultarSaldo());
                System.out.println("Retirando 1.000.000...");
                if(!cb1.Retirar(1000000)){
                    System.out.println("Sin saldo disponible. Saldo actual: " + cb1.ConsultarSaldo());
                }
                break;
            case 6:
                //EJERCICIO 6
                Libro l1 =  new Libro();
                l1.setAutor("Mathias");
                l1.setTitulo("No me gusta laburar");
                l1.setNumeroDePaginas(5);

                double p = l1.getPaginaActual();
                l1.RetrocederPagina();  //return false
                l1.RetrocederPagina();
                l1.AvanzarPagina();
                l1.AvanzarPagina();
                l1.AvanzarPagina();
                l1.AvanzarPagina();
                l1.AvanzarPagina();     //return false
                break;
            case 7:
                //EJERCICIO 7
                Termometro t = new Termometro(20);
                System.out.println("Temp Celsius: " + t.GetTempCelsius());
                System.out.println("Temp Fahrenheit: " + t.GetTempFahrenheit());
                t.setTemperatura(10);
                System.out.println("Temp Celsius: " + t.GetTempCelsius());
                System.out.println("Temp Fahrenheit: " + t.GetTempFahrenheit());
                break;
            case 8:
                //EJERCICIO 8
                Producto pr = new Producto("Bala de goma", 1000, 10);
                if(!pr.VenderProducto(11)){
                    System.out.println("Hay mas piqueteros que balas disponibles.");
                }

                int cantidadAComprar = 5;
                if(pr.VenderProducto(cantidadAComprar)){
                    System.out.println("Se vendieron " + cantidadAComprar + " balas dd goma. \nPrecio: " + pr.getPrecio() + "\nValor: " + (pr.getPrecio() * cantidadAComprar));
                }

                pr.SetDescuento(50);
                if(pr.VenderProducto(cantidadAComprar)){
                    System.out.println("Se vendieron " + cantidadAComprar + " balas dd goma. \nPrecio: " + pr.getPrecio() + "\nValor: " + (pr.getPrecio() * cantidadAComprar));
                }
                break;

            case 9:
                //EJERCICIO 9
                Pelota pt1 = new Pelota("Nike", 100);
                Pelota pt2 = new Pelota("Nike", 50);

                if(pt1.CompararCircunferencia(pt2)){
                    System.out.println("Las circunferencias son iguales.");
                } else{
                    System.out.println("Las circunferencias son distintas.");
                }

                pt2.Inflar(50);
                if(pt1.CompararCircunferencia(pt2)){
                    System.out.println("Las circunferencias son iguales.");
                } else{
                    System.out.println("Las circunferencias son distintas.");
                }
                break;

            case 10:
                Reloj r = new Reloj(23, 59, 50);

                for(int i = 0; i<100; i++){
                    System.out.println(r.Aumentar1Segundo());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                break;
        }
    }
}