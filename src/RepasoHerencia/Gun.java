package RepasoHerencia;


public class Gun implements Weapon {
    
    private double weight;
    public Gun (double weight){
        this.weight = weight;
    }
    
    @Override
    public void shoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeight() {
        return weight;
    }
    
}
