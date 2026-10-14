package rpg.model;

public class Paladin extends Personagem {

    @Override
    public void Attack() {


        if (getWeaponName().equals("espada") ){

            System.out.println(this.name + " utilizou sua espada para realizar um ataque!!");


        } else if (this.Weapon.equals("greatsword")) {

            System.out.println(this.name + " empunhou sua greatsword e lançou um corte devastador!!");

        }

        else if(this.weapon.equals("Machado de batalha")) {

            System.out.println(this.name + " empunhou seu machado de batalha ");

        }
    }

    @Override
    public void defense () {

        System.out.println(this.name + " ergueu seu  ");
    }


        void LaminaSagrada() {
        System.out.println(this.name + " usou o encantamento da Lâmina Sagrada!. Sua arma agora brilha com a luz dos céus!/n.");



    }







}
