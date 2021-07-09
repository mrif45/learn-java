//delok video pembuatane
// https://www.youtube.com/watch?v=bFVfaWXGTYslist=PLZS-MHyEIRo6V4_vk1s1NcM2HoW5KFG7i&index=8

/*dadi program iki due 3 class pendukung
player
weapon
armor
*/

// iki tempat nggo nyiapke player due atribut opo wae
class Player{
    String name;
    double health;
    int level;
    // objek member e player, delok ng video :v
    Weapon weapon;
    Armor armor;

    //method player ngko dinggo
    Player(String name, double health){
        this.name = name; //this nunjuk name sek ng njero parameter player() kui
        this.health = health;
    }

    //method attack ngko nggo nyerang
    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        // nah lawane iso didadikke parameter
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        // damage ne diitung ng kene
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }
    
    //milih senjata, ono ng konstruktor
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    //milih armor ng konstruktor juga ng main method
    void equipArmor(Armor armor){
        this.armor = armor;
    }

    // nggo nampilke nyawane piro
    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

public class Objek{
    public static void main(String[] args) {
        /* nah iki konstruktor e dinggo ng class player, kan ono parameter name kro health diisi ng () kui
        */
        Player player1 = new Player("ucup",100);
        Player player2 = new Player("otong",50);

        // jeneng senjata ro attacke piro
        Weapon pedang = new Weapon("pedang",15); //1
        Weapon ketapel = new Weapon("ketapel",1); //2

        // jeneng armor ro defence
        Armor bajuBesi = new Armor("baju besi",10); //1
        Armor kaos = new Armor("kaos",0); //2
        
        System.out.println("===============");
        System.out.println("PERSIAPAN\n");
        System.out.println("===============");
        // player 1 milih senjata ro armor
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2 milih senjata ro armor
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();

        System.out.println("===============");
        System.out.println("\nPERTEMPURAAAN");
        System.out.println("===============");
        System.out.println("Episode - 1");
        System.out.println("===============");
        player1.attack(player2);
        player1.display();
        player2.display();
        
        System.out.println("===============");
        System.out.println("Episode - 2");
        System.out.println("===============");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}