
package RepasoHerencia;

public class Tank extends Vehicle implements Weapon{
    private Weapon weapon;

    public Tank(double weight) {
        super(weight);
   //Version2
        final Tank tank = this;
        weapon = new Weapon(){ // o weapon = new TankWeapon
            // Clase anonima es una clase interna, pero la clase anonima no estamos obligaos a buscarle
            //nombre a la subclase. Su ventaja es que se ace igual, pero sin necesidad de buscdarle nombre
            // TankWapon seria una clase interna, y Weapon seria una clase anónima para este caso puesto en 
            //versión2.
            @Override
            public double getWeight() {
                return tank.getWeight();
            }

            @Override
            public void shoot() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        };
    }

    @Override
    public void shoot() {
        weapon.shoot();
    }
    
    private class TankWeapon implements Weapon{

        @Override
        public double getWeight() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void shoot() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    
}
