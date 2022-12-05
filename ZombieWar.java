
package zombiewar;

/**
 *
 * @author David Reiss
 * CSC 422
 * Professor Furtney
 */
public class ZombieWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello GITHUB");
    }
    
    //Zombie.java

   }
}

        
//Zombie Class
public class Zombie extends Character {

// Zombie types
    static final String COMMON_INFECTED = "CommonInfected";
    static final String TANK = "Tank";

    private final String zombieType;

/**
* Parameterized constructor
*
* @param zombieType
* - Zombie Type
* @param health
* - Starting Health of Zombie
* @param attack
* - how much damage the zombie inflicts
* 
*/
   
    public Zombie(String zombieType, int health, int attack) {
        super(Character.Zombie, health, attack);

// sets zombie type
        this.zombieType = zombieType;
}

    @Override
    public String toString() {
        return zombieType;
    }
}


//Tank Class
public class Tank extends Zombie {

    private static final int HEALTH = 100;
    private static final int ATTACK = 10;


    public Tank() {
        super(Zombie.TANK, HEALTH, ATTACK);
    }
}
    
}
