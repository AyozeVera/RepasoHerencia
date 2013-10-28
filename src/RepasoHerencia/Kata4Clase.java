
package RepasoHerencia;


public class Kata4Clase {

    public static void main(String[] args) {
        Tank tank = new Tank(2.0);
        System.out.println(tank.getWeight());
        Weapon weapon = tank;
        System.out.println(weapon.getWeight());
        weapon.shoot();
        Vehicle tankVehicle = tank;
        System.out.println(tankVehicle.getWeight());
        //tankVehicle.shoot();// no se puede xk es un vehicle
        
    }
}
