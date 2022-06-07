public class ThousandDispenser extends PaperCurrencyDispenser{

    public ThousandDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 1000) {
                int count = amount / 1000;
                remainder = amount % 1000;
                System.out.printf("Dispensing '%d' 1000/= currency note.\n", count);
            }

            if (remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new PaperCurrency(remainder));
            }
        }
    }

}