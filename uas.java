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
            int damage = Math.max(0, this.atk - minion.def);
            minion.defend(damage);
        }

        void attack(Tower tower) {
            int damage = Math.max(0, this.atk - tower.def);
            tower.defend(damage);
        }
    }


    abstract class Enemy {
        int hp;
        int atk;
        int def;
        boolean is_aggressive;

        public Enemy(int hp, int atk, int def, boolean is_aggressive) {
            this.hp = hp;
            this.atk = atk;
            this.def = def;
            this.is_aggressive = is_aggressive;
        }
    }

    class Minion extends Enemy {
        public Minion(int hp, int atk, int def) {
            super(hp, atk, def, false);
        }

        void defend(int damage) {
            if (this.hp < 10)
                damage *= 1.15;
            if (this.hp > 25)
                damage *= 0.8;
            this.hp -= damage;
        }
    }

    class Tower extends Enemy {
        public Tower(int hp, int atk, int def) {
            super(hp, atk, def, true);
        }

        void defend(int damage) {
            if (this.hp < 10)
                damage *= 1.15;
            if (this.hp > 25)
                damage *= 0.8;
            this.hp -= damage;
        }
    }

    public class uas{
        public static void main(String[] args) {
            Hero ryoma = new Hero("Ryoma", 1000, 700, 500);
            Hero nakroth = new Hero("Nakroth", 200, 1000, 800);
            Hero maloch = new Hero("Maloch", 2000, 400, 1000);

            System.out.println(ryoma);
            System.out.println(maloch);
        }
    }