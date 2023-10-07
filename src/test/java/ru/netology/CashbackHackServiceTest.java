package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;


        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMissingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void amountRemainEqualToBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;


        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }
}
