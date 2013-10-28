package RepasoHerencia;

// En las interfaces solo se pone la declaracion de metodos, nada de variables
// Se usan interfaces ya que no se permite la herencia multiple en java
public interface Weapon {
    
    public double getWeight();
    public abstract void shoot();
    
}
