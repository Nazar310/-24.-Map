public class CustomerWithId extends Customer {
    private int id;

    public CustomerWithId(int id, String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CustomerWithId{" +
                "id=" + id + ", " +
                super.toString() +
                '}';
    }
}
