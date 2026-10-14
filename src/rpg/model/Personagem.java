package rpg.model;

public class Personagem {

   private String name;
   private  float life;
   private float mana;
   private float atk;
   private float defense;
   private Weapon weapon;
   private float bonus;
   private float bonusTurnos;
   private float danoSofrido;


    void Attack() {

        System.out.println( this.name + " realizou um ataque ");

    }
    void defense() {

        System.out.println(this.name + " this charactere ");
    }

    public String getName(String name) {
           return name;

    }

    public float sofrerDano() {

        return danoSofrido;


    }






    
}
