public enum AddressType {
    Mailing(1, "Mailing"),
    Shipping(2, "Shipping"),
    Billing(2, "Billing");

    private final int id;
    private final String description;

    private AddressType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
