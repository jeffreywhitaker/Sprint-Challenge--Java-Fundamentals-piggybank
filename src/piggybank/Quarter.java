package src.piggybank;

public class Quarter extends Currency
{
    //constructors
    public Quarter()
    {
        super();
        this.valueOfCoinType = .25;
        this.currencyName = "Quarter";
        this.pluralCurrencyName = "Quarters";
    }

    public Quarter(int amountAdded)
    {
        super(amountAdded);
        this.valueOfCoinType = .25;
        this.currencyName = "Quarter";
        this.pluralCurrencyName = "Quarters";
    }
}
