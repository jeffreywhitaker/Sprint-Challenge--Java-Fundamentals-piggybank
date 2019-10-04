package src.piggybank;

public abstract class Currency
{
    // fields
    double valueOfCoinType;
    int numberOfCoins;
    String currencyName;
    String pluralCurrencyName;

    // constructors

    Currency()
    {
        this.numberOfCoins = 1;
    }

    Currency(int coinsAdded)
    {
        this.numberOfCoins = coinsAdded;
    }

    // methods

    double getTotalValue()
    {
        return this.numberOfCoins * this.valueOfCoinType;
    }

    public String printNumberOfCoinType()
    {
        if (this.numberOfCoins == 1)
        {
            return this.numberOfCoins + " " + this.currencyName;
        } else
        {
            return this.numberOfCoins + " " + this.pluralCurrencyName;
        }
    }

    public double subtract(int numberToRemove)
    {
        if (this.numberOfCoins > 0)
        {
            this.numberOfCoins -= numberToRemove;
        }
        return numberOfCoins;
    }
}
