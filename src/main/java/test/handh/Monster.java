package test.handh;

public class Monster extends Character{

    /**
     * Параметры монстра
     * @param attack Параметр атаки от 1 до 30
     * @param defense Параметр защиты от 1 до 30
     * @param TotalHealth Максимальное здоровье от 1 до N
     * @param damage Параметр урона от 1 до 6
     */
    public Monster(int attack, int defense, int TotalHealth, int damage) {
        super(attack, defense, TotalHealth, damage);
    }
}
