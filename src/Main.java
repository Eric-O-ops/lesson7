public class Main {
    public static void main(String[] args) {

        Magic magic = new Magic();
        magic.setHealth(100);
        magic.setDamage(200);
        magic.setSuperAbilityType("Large damage ");


        Medic medic = new Medic();
        medic.setHealth(100);
        medic.setDamage(200);
        medic.setSuperAbilityType("Health team ");


        Warrior warrior = new Warrior();
        warrior.setHealth(100);
        warrior.setDamage(200);




        Hero [] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof HavingSuperAbility) {
                System.out.println(heroes [i].applySuperAbility());

            }

        }




    }
}