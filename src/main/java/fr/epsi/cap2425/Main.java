package fr.epsi.cap2425;

public class Main {
    public static void main(String[] args) {
        Character mage = new Character("Gandalf", "Mage", 1);
        Character archer = new Character("Legolas", "Archer", 1);

        System.out.println(mage);
        System.out.println(archer);

        mage.levelUp();
        archer.levelUp();

        System.out.println("Après un level up :" + mage);
        System.out.println("Après un level up :" + archer);
    }
}