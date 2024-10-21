
package ejercicio.integrador;


public class Squirtle extends Pokemon implements Agua {

    public Squirtle() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle atacarPlacaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Squirtle atacarAranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle atacarMordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle atacarHidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle atacarBurbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle atacarPistolaAgua");
    }
    
}
