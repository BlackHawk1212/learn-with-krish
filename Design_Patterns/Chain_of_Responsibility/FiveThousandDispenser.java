public class FiveThousandDispenser extends PaperCurrencyDispenser{

    public FiveThousandDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 5000) {
                int count = amount / 5000;
                remainder = amount % 5000;
                System.out.printf("Dispensing '%d' 5000/= currency note.\n", count);
            }

            if (remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new PaperCurrency(remainder));
            }
        }
    }

}