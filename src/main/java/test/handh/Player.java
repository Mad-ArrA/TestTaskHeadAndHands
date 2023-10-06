package test.handh;

public class Player extends Character{
    private int healCount = 0;

    /**
     * Параметры игрока
     * @param attack Параметр атаки от 1 до 30
     * @param defense Параметр защиты от 1 до 30
     * @param TotalHealth Максимальное здоровье от 1 до N
     * @param damage Параметр урона от 1 до 6
     */
    public Player(int attack, int defense, int TotalHealth, int damage) {
        super(attack, defense, TotalHealth, damage);
    }

    /**
     * Метод исцеления. Игрок может 4 раза за всю игру исцелить своё здоровье на 30% от максимального.
     */
    public void heal() {
        if (healCount < 4) { // Проверяем, что heal вызывается не более 4 раз
            if (getLeftHealth() > 0) {
                int maxHeal = (int) (getTotalHealth() * 0.3); // 30% от максимального здоровья
                if (maxHeal > 0) {
                    if (getLeftHealth() + maxHeal <= getTotalHealth()) {
                        setLeftHealth(getLeftHealth() + maxHeal);
                    } else {
                        setLeftHealth(getTotalHealth());
                    }
                    System.out.println("\uD83D\uDC89 Игрок исцелил себя на " + maxHeal + " единиц здоровья.");
                    System.out.println("Текущее здоровье игрока: " + getLeftHealth());
                    healCount++; // Увеличиваем счетчик вызовов
                    System.out.printf("Возможность воспользоваться исцелением: %d \n",4 - healCount);
                } else {
                    System.out.println("\uD83D\uDC80 У игрока недостаточно здоровья для исцеления.");
                }
            } else {
                System.out.println("\uD83D\uDC80 Игрок мертв и не может исцелиться.");
            }
        } else {
            System.out.println("\uD83D\uDE14 Игрок уже исцелился максимальное количество раз.");
        }
    }
}
