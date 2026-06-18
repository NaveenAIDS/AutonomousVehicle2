package com.autonomous;

public class GameEngine {

    public String login(String user) {
        return "Player " + user + " logged in";
    }

    public String startGame() {
        return "Game Started";
    }

    public int score(int kills) {
        return kills * 10;
    }
}