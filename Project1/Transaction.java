package Project1;

class Transaction {
    private String type;
    private double amount;
    private String id;

    public Transaction(String type, double amount, String id) {
        this.type = type;
        this.amount = amount;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("[%s] ID: %s | Amount: $%.2f", type, id, amount);
    }
}
