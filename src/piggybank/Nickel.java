package src.piggybank;

public class Nickel extends Currency
{
    //constructors
    public Nickel()
    {
        super();
        this.valueOfCoinType = .05;
        this.currencyName = "Nickel";
        this.pluralCurrencyName = "Nickels";
    }

    public Nickel(int amountAdded)
    {
        super(amountAdded);
        this.valueOfCoinType = .05;
        this.currencyName = "Nickel";
        this.pluralCurrencyName = "Nickels";
    }
}
