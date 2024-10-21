
package ejercicio.integrador;


public class Bulbasor extends Pokemon implements Planta {

    public Bulbasor() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("BUlbasor placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("BUlbasor atacarAranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("BUlbasor atacarMordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("BUlbasor atacarDrenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("BUlbasor atacarParalizar");
    }
    
}
