package main.hw8;

public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }


    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        System.out.println(declareWinner(fighter1, fighter2, "Harry"));
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (fighter1.name.equals(firstAttacker)) {
            while (true) {
                if ((fighter2.health -= fighter1.damagePerAttack) <= 0) return fighter1.name;
                if ((fighter1.health -= fighter2.damagePerAttack) <= 0) return fighter2.name;
            }
        } else if (fighter2.name.equals(firstAttacker)) {
            while (true) {
                if ((fighter1.health -= fighter2.damagePerAttack) <= 0) return fighter2.name;
                if ((fighter2.health -= fighter1.damagePerAttack) <= 0) return fighter1.name;
            }
        }
        return null;
    }
}
