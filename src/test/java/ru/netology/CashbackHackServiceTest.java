package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;


        int actual = service.remain(amount);


        assertEquals(actual, expected);
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


        assertEquals(actual, expected);
    }
}
