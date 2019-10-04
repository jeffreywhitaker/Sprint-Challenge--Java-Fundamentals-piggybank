package src.piggybank;

public class Dime extends Currency
{
    //constructors
    public Dime()
    {
        super();
        this.valueOfCoinType = .1;
        this.currencyName = "Dime";
        this.pluralCurrencyName = "Dimes";
    }

    public Dime(int amountAdded)
    {
        super(amountAdded);
        this.valueOfCoinType = .1;
        this.currencyName = "Dime";
        this.pluralCurrencyName = "Dimes";
    }
}
