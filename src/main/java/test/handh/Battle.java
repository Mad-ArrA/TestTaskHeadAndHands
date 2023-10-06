package test.handh;

import java.util.Random;

public class Battle{
    static Random rand = new Random();

    /**
     * Битва между нападающим и защищающим
     * @param aggressor нападающий
     * @param defender защищающий
     */
    public static void fight(Character aggressor, Character defender){
        int modification = aggressor.getAttack() - defender.getDefense() + 1;
        int cube;
        boolean flag = false;
        if (modification > 0) {
            System.out.print("Бросаем кубики: ");
            for (int i = 0; i < modification; i++) {
                cube = rand.nextInt(1, 7);
                if (cube == 5 || cube == 6){
                    flag = true;
                }
                System.out.print(" " + cube);
            }
            if (flag){
                System.out.println();
                defender.setLeftHealth(defender.getLeftHealth() - aggressor.getDamage());

            }
            System.out.println();
            System.out.println("Урон: " + aggressor.getDamage());
            System.out.println("Оставшееся здоровье защищающего: " + defender.getLeftHealth());
            System.out.println("Оставшееся здоровье атакующего: " + aggressor.getLeftHealth());
        }
    }

}
