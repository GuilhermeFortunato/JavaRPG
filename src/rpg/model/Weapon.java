package rpg.model;

public class Weapon {

    private String name;
    private String weaponClass;

    public Weapon (String name, String weaponClass) {

        this.name = name;
        this.weaponClass = weaponClass;

    }

    public String getWeaponName() {
        return name;
    }

    public String getWeaponClass() {
           return weaponClass;

    }

}
