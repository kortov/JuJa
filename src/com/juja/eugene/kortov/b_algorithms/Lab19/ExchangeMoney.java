package com.juja.eugene.kortov.b_algorithms.Lab19;
//        Номинал мелких монет - 1,2,5,10,25,50.
//        1 копейку можно разменять 1 разным способом - {1}
//        2 - двумя разными способами {1 + 1; 2}
//        5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
//        ........
//        Сколькими разными способами можно разменять гривну (100 монет) ?
//
//        Реализовать алгоритм подсчета количества разных разменов для входящего параметра.

public class ExchangeMoney {
    static int[] coins = {1, 2, 5, 10, 25, 50};

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange <= 0) {
            return 0;
        }
        return exchangeAmountOfCoinsRecursion(amountForExchange, coins.length);
    }

    private static int exchangeAmountOfCoinsRecursion(int amountForExchange, int coinsLength) {
        int index = coinsLength - 1;

        if (index == 0) {
            return 1;
        }

        if (amountForExchange <= 0) {

            return 1;
        }


        if (amountForExchange >= coins[index]) {
            return exchangeAmountOfCoinsRecursion(amountForExchange - coins[index], index + 1) +
                    exchangeAmountOfCoinsRecursion(amountForExchange, index);

        } else {
            return exchangeAmountOfCoinsRecursion(amountForExchange, index);

        }

    }


    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(10));
    }


}
