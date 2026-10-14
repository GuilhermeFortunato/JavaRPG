import rpg.model.Mage;
import rpg.model.Paladin;
import rpg.model.Samurai;
import rpg.model.Thief;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int turn;
        String classe;

        System.out.println("Welcome to DARK FANTASY RPG!!!/n");
        System.out.print("What's your class brave one? /n");
        System.out.print("Choose your class: rpg.model.Mage, rpg.model.Thief, rpg.model.Paladin, Archer or rpg.model.Samurai");
        classe = entry.next();

        switch(classe) {
            case "mage", "rpg.model.Mage", "MAGE":
                System.out.println("You choose the rpg.model.Mage ");
                break;
            case "paladin", "rpg.model.Paladin", "PALADIN":
                System.out.println("You choose the rpg.model.Paladin ");
                break;
            case "archer","Archer","ARCHER":
                System.out.println("You choose the Archer");
                break;
            case "thief","rpg.model.Thief","THIEF":
                System.out.println("You choose the rpg.model.Thief");
                break;
            case "samurai","rpg.model.Samurai","SAMURAI":
                System.out.println("You choose the rpg.model.Samurai");

            default;



        }
    }

}