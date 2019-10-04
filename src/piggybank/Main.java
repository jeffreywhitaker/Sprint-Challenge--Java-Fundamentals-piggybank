package src.piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    public static ArrayList<Currency> jeffPiggyBank = new ArrayList<>();
    public static ArrayList<Currency> stretchPiggyBank = new Piggybank<Currency>();

    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        // add currency to piggyBank
        jeffPiggyBank.add(new Quarter());
        jeffPiggyBank.add(new Dime());
        jeffPiggyBank.add(new Dollar(5));
        jeffPiggyBank.add(new Nickel(3));
        jeffPiggyBank.add(new Dime(7));
        jeffPiggyBank.add(new Dollar());
        jeffPiggyBank.add(new Penny(10));

        // print contents of piggyBank
        System.out.println();
        double totalPiggyBankValue = 0;
        for (Currency c : jeffPiggyBank)
        {
            System.out.println(c.printNumberOfCoinType());
            totalPiggyBankValue += c.getTotalValue();
        }

        // print value of piggyBank
        System.out.println("The piggy bank holds " + fp.format(totalPiggyBankValue));

        // stretch
        stretchPiggyBank.add(new Quarter());
        stretchPiggyBank.add(new Dime());
        stretchPiggyBank.add(new Dollar(5));
        stretchPiggyBank.add(new Nickel(3));
        stretchPiggyBank.add(new Dime(7));
        stretchPiggyBank.add(new Dollar());
        stretchPiggyBank.add(new Penny(10));
    }
}
