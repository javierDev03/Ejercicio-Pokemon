
package ejercicio.integrador;


public class PIkachu extends Pokemon implements Electrico {

    public PIkachu() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
         System.out.println("PIkachu atacarPlacaje");
    }

    @Override
    protected void atacarAranazo() {
         System.out.println("PIkachu atacarAranazo");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("PIkachu atacarMordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("PIkachu atacarImpactrueno");
    }

    @Override
    public void atacarpunotrueno() {
        System.out.println("PIkachu atacarpunotrueno");
    }
    
}
