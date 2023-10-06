package test.handh;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    /**
     * Условия битвы
     * @param player игрок
     * @param monster монстр
     */
    public static void battle(Player player, Monster monster){
        if (player.survived()){
            System.out.println("Атакует игрок");
            System.out.println("\uD83D\uDC09 ⚔ \uD83D\uDC68");
            Battle.fight(player,monster);
        }
        if (monster.survived()){
            System.out.println();
            System.out.println("Атакует монстр");
            System.out.println("\uD83D\uDC09 ⚔ \uD83D\uDC68");
            Battle.fight(monster, player);
        }
        if (player.survived() && monster.survived()) {
            menu(player, monster);
        }
        else if(player.survived()){
            System.out.println("Игрок победил" );
        }
        else System.out.println("Монстр победил ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("\uD83C\uDF1F Добро пожаловать! Это консольная DnD игра, в который вы должны победить \uD83D\uDC09 Монстра");
        System.out.println("Выйграет тот кто удачно бросит кубики! Удачи) \uD83C\uDF40 ");
        int CountDamagePlayer = random.nextInt(1,7);
        int CountDamageMonster = random.nextInt(1,7);
        Player player = new Player(15, 10, 10 , CountDamagePlayer);
        Monster monster = new Monster(15, 10, 10, CountDamageMonster);
        menu(player, monster);

    }

    /**
     * Меню выбора действия
     * @param player игрок
     * @param monster монстр
     */
    public static void menu(Player player, Monster monster){
        System.out.println();
        System.out.print("[1. Бой ⚔ ] [2. Статус игрока \uD83D\uDC68 ] [3.Статус Монстра \uD83D\uDC09 ] [4.Исцелиться ⚕\uFE0F ]  [0. Выйти из игры \uD83D\uDD1A ]\n");
        int sna = scanner.nextInt();
        switch (sna){
            case 0:
                break;
            case 1:
                battle(player, monster);
                break;
            case 2:
                player.status();
                menu(player, monster);
                break;
            case 3:
                monster.status();
                menu(player, monster);
                break;
            case 4:
                player.heal();
                menu(player, monster);
                break;
            default:
                menu(player, monster);
        }
        scanner.close();
    }

}