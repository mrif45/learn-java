class Hero {
    String name;
    int hp;
    int atk;
    int def;

    public Hero(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    void attack(Minion minion) {
        int damage = Math.max(0, this.atk - this.def);
        minion.defend(damage);
    }

    void attack(Zombie zombie) {
        int damage = Math.max(0, this.atk - this.def);
        zombie.defend(damage);
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.hp + " hp");
        System.out.println("Attack : " + this.atk);
        System.out.println("Defend : " + this.def);
    }
}

// abstraction
abstract class Enemy {
    int hp;
    int atk;
    int def;
    boolean is_aggresive;

    public Enemy(int hp, int atk, int def, boolean is_aggresive) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.is_aggresive = is_aggresive;
    }
}

// inheritance
class Minion extends Enemy {
    public Minion(int hp, int atk, int def) {
        super(hp, atk, def, false);
    }

    void defend(int damage) {
        if (this.hp < 100) {
            damage *= 1.15;
        } else if (this.hp > 250) {
            damage *= 0.8;
            this.hp -= damage;
        }
    }

    void display() {
        System.out.println("\nHealth : " + this.hp + " hp");
        System.out.println("Attack : " + this.atk);
        System.out.println("Defend : " + this.def);
    }
}

// polymorphism
class Zombie extends Enemy {
    public Zombie(int hp, int atk, int def) {
        super(hp, atk, def, false);
    }

    void defend(int damage) {
        if (this.hp > 5) {
            damage *= 0.7;
            this.hp -= damage;
        }
    }
}

class uas {
    public static void main(String[] args) {
        Hero kamenRider = new Hero("Kamenrider", 100, 50, 25);
        Minion minion = new Minion(50, 10, 15);

        kamenRider.display();
        kamenRider.attack(minion);
        minion.display();
        kamenRider.display();
    }
}
