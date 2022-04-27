package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturn100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;
        int expected = 800;

        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;

        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }
}