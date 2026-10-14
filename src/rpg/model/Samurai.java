package rpg.model;

public class Samurai extends Personagem {


      public Samurai(String name,
                     float life,
                     float mana,
                     float atk,
                     float defense,
                     float bonus,
                     float bonusTurnos,
                     float danoSofrido,
                     Weapon weapon) {

          this.life = life;



      }







    void cursedSword() {
        System.out.print( this.name + " aplicou mana em sua " + this.Weapon + );

    }




}
