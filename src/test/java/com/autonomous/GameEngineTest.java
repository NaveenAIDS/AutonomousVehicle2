package com.autonomous;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameEngineTest {

    @Test
    public void testLogin() {
        GameEngine g = new GameEngine();
        assertEquals("Player naveen logged in", g.login("naveen"));
    }

    @Test
    public void testScore() {
        GameEngine g = new GameEngine();
        assertEquals(50, g.score(5));
    }
}