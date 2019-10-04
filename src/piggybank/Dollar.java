package src.piggybank;

public class Dollar extends Currency
{
    //constructors
    public Dollar()
    {
        super();
        this.valueOfCoinType = 1.00;
        this.currencyName = "$";
    }

    public Dollar(int amountAdded)
    {
        super(amountAdded);
        this.valueOfCoinType = 1.00;
        this.currencyName = "$";
    }

    // overrides
    @Override
    public String printNumberOfCoinType()
    {
        return this.currencyName + this.numberOfCoins;
    }
}
