import java.util.Scanner;

class Player {
    String name;
    int health = 100;

    Player(String name) {
        this.name = name;
    }
}

class Game {
    Player player;
    Scanner sc = new Scanner(System.in);

    Game(Player player) {
        this.player = player;
    }

    void start() {
        System.out.println("Welcome " + player.name);
        System.out.println("You are in a forest. Choose a path: left or right");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("left")) {
            System.out.println("You meet a monster!");
            fight();
        } else if (choice.equalsIgnoreCase("right")) {
            System.out.println("You found a treasure!");
            System.out.println("You win!");
        } else {
            System.out.println("Invalid choice. Game over.");
        }
    }

    void fight() {
        player.health -= 30;
        System.out.println("You fought the monster. Health: " + player.health);
        if (player.health > 0) {
            System.out.println("You survived and won the game!");
        } else {
            System.out.println("You lost the game.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String name = sc.nextLine();

        Player player = new Player(name);
        Game game = new Game(player);
        game.start();
    }
}
