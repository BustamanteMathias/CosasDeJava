/*
o Diseña una clase Libro con atributos titulo, autor, numeroDePaginas, y paginaActual.
o Implementa métodos para avanzar y retroceder páginas.
o Crea un metodo que indique si el lector ha terminado de leer el libro.
 */

public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaActual;

    public Libro(){
        this.paginaActual = 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.PrintPagina();
        this.paginaActual = paginaActual;
    }

    private boolean CheckFinDelLibro(){
        return this.getPaginaActual() == this.getNumeroDePaginas();
    }

    public boolean AvanzarPagina(){
        if((this.getPaginaActual() + 1) <= this.getNumeroDePaginas()){
            this.setPaginaActual(this.paginaActual+1);

            this.PrintPagina();
            return true;
        }
        return false;
    }

    public boolean RetrocederPagina(){
        if((this.getPaginaActual() - 1) >= 1){
            this.setPaginaActual(this.paginaActual-1);

            this.PrintPagina();
            return true;
        }
        return false;
    }

    private void PrintPagina(){
        System.out.println("|-----------|");
        System.out.println("|-----------|");
        System.out.println("|-----------|");
        System.out.println("|-----------|");
        System.out.println("|-----------|");
        System.out.printf("|PAG   % 5d|\n\n", this.getPaginaActual());
    }
}
