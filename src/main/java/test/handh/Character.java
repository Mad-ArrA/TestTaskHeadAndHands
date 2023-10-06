package test.handh;


public abstract class Character {
    private int attack;
    private int defense;
    private int TotalHealth;
    private int damage;
    private int LeftHealth;


    /**
     * Конструктор существ. Если ввести неверные параметры существа, уйдёт в исключение.
     * @param attack Параметр атаки от 1 до 30
     * @param defense Параметр защиты от 1 до 30
     * @param TotalHealth Максимальное здоровье от 1 до N
     * @param damage Параметр урона от 1 до 6
     */
    public Character(int attack, int defense, int TotalHealth, int damage) {
        this.LeftHealth = TotalHealth;
        try {
            setAttack(attack);
            setDefense(defense);
            setTotalHealth(TotalHealth);
            setDamage(damage);
        }
        catch (CharacterException e){
            System.out.println(e.NameMessage() + e.getMessage());
            System.exit(0);
        }
    }

    public int getAttack() {
        if (attack <= 0) {
            return 1;
        }
        else { return attack;}
    }

    public void setAttack(int attack) throws CharacterException {
        if (attack >= 1 && attack < 31) {
            this.attack = attack;
        }
        else throw new CharacterException("Атака должна быть в диапозоне от 1 до 30");
    }

    public int getDefense() {
        if (defense <= 0) {
            return 1;
        }
        else {
            return defense;
        }
    }

    public void setDefense(int defense) throws CharacterException {
        if (defense >= 1 && defense < 31) {
            this.defense = defense;
        }
        else throw new CharacterException("Защита должна быть в диапозоне от 1 до 30");
    }

    public int getTotalHealth() {
        return TotalHealth;
    }

    public void setTotalHealth(int totalHealth) {
            this.TotalHealth = totalHealth;

    }

    public int getDamage() {
        if (damage <= 0){
            return 1;
        }
        else {
            return damage;
        }

    }

    public void setDamage(int damage) throws CharacterException {
        if (damage > 0) {
            this.damage = damage;
        }
        else throw new CharacterException("Урон должен быть в диапозоне от 1 до 6");
    }

    public int getLeftHealth() {
        return LeftHealth;
    }

    public void setLeftHealth(int leftHealth) {
        LeftHealth = leftHealth;
    }

    public void status(){
        System.out.println("\uD83D\uDDE1\uFE0F Атака: " + attack);
        System.out.println("\uD83D\uDEE1\uFE0F Защита: " + defense);
        System.out.println("❤\uFE0F Максимальное здоровье игрока: " + TotalHealth);
        System.out.println("\uD83D\uDC94 Осталось здоровья:  " + LeftHealth);
        System.out.println();
    }

    public boolean survived(){
        return getLeftHealth() > 0 ;
    }
}

