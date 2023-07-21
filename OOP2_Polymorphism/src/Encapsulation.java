public class Encapsulation {

    public static void main(String[] args) {

        Player player = new Player("Ernesto");
        player.loseHealth(100);
        System.out.println(player.healthRemaining());

        player.restoreHealth(50);
        System.out.println(player.healthRemaining());
    }

}

class Player {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public Player(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public Player(String fullName) {
        this(fullName, 100, "Sword");
    }

    public void loseHealth(int damage) {
        if (healthPercentage - damage <= 0) {
            System.out.println("The player has been knocked out");
            healthPercentage -= damage;
        } else {
            healthPercentage -= damage;
        }
    }

    public void restoreHealth(int extraHealth) {
        if (healthPercentage + extraHealth >= 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        } else {
            healthPercentage += extraHealth;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }
}
