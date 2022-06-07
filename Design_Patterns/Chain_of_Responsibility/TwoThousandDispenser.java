public class TwoThousandDispenser extends PaperCurrencyDispenser{

    public TwoThousandDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 2000) {
                int count = amount / 2000;
                remainder = amount % 2000;
                System.out.printf("Dispensing '%d' 2000/= currency note.\n", count);
            }

            if (remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new PaperCurrency(remainder));
            }
        }
    }

}