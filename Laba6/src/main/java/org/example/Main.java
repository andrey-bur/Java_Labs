package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Game[] games = {new Game("rom", "hihi", 5),
                new Game("Assasin", "rpg", 10),
                new Game("Cs2", "rpg", 1)};
        for (Game game : games) {
            if (game.isTop())
                System.out.println(game);
        }
    }
}
