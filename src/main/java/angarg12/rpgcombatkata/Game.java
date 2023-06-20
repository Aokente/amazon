package angarg12.rpgcombatkata;

import java.util.ArrayList;

public class Game {
    static ArrayList<Character> players = new ArrayList<>();
    static boolean finished = false;

    public static void main(String[] args) {
        Character chara1 = new Character();
        players.add(chara1);
        Character chara2 = new Character();
        players.add(chara2);
        while(!finished){
            chara1.attack(chara2, 10);
            chara2.attack(chara1, 20);
        }

    }
}
