package test.handh;

import java.util.Random;

public class Fight{
    static Random rand = new Random();

    public void fight(Fight defender, Fight aggressor){
        int modification = aggressor.getAttack() - defender.getDefense() + 1;
        int cube;
        boolean flag = false;
        if (modification > 0) {
            System.out.print("Бросаем кубики: ");
            for (int i = 0; i < modification; i++) {
                cube = rand.nextInt(1, 6);
                if (cube == 5 || cube == 6){
                    flag = true;
                }
                System.out.print(" " + cube);
            }
            if (flag){
                System.out.println();
                defender.setLeftHealth(defender.getTotalHealth() - aggressor.getDamage());

            }
            System.out.println();
            System.out.println("Урон: " + getDamage());
            System.out.println("Оставшееся здоровье монстра: " + defender.getLeftHealth());
            System.out.println("Оставшееся здоровье игрока: " + getLeftHealth());
        }
    }

}
