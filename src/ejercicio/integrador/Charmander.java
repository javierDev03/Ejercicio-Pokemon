
package ejercicio.integrador;


public class Charmander extends Pokemon implements Fuego {

    public Charmander() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander atacarPlacaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Charmander atacarAranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander atacarMordisco");
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Charmander atacarPunoFuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander atacarLanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander atacarAscuas");
    }
    
}
