package src.piggybank;

public class Penny extends Currency
{
    //constructors
    public Penny()
    {
        super();
        this.valueOfCoinType = .01;
        this.currencyName = "Penny";
        this.pluralCurrencyName = "Pennies";
    }

    public Penny(int amountAdded)
    {
        super(amountAdded);
        this.valueOfCoinType = .01;
        this.currencyName = "Penny";
        this.pluralCurrencyName = "Pennies";
    }
}
