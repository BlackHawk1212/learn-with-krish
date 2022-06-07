public class ATMWithdrawal {

    protected static PaperCurrencyDispenser fiveThousandDispenser = new FiveThousandDispenser();
    protected static PaperCurrencyDispenser twoThousandDispenser = new TwoThousandDispenser();
    protected static PaperCurrencyDispenser thousandDispenser = new ThousandDispenser();
    protected static PaperCurrencyDispenser fiveHundredDispenser = new FiveHundredDispenser();
    protected static PaperCurrencyDispenser dispenserChain;
    static {
        // construct the chain of the currency dispensers in higher to lower
        // denomination
        fiveThousandDispenser.setNextDispenser(twoThousandDispenser);
        twoThousandDispenser.setNextDispenser(thousandDispenser);
        thousandDispenser.setNextDispenser(fiveHundredDispenser);
        dispenserChain = fiveThousandDispenser;
    }

    public static void withdraw(PaperCurrency currency) {
        if (currency != null) {
            dispenserChain.dispense(currency);
        }
    }

}