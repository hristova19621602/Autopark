package bg.tu_varna.sit.car;

public class Coupe extends Car {

    protected boolean additionalRow;

    public Coupe(String newName, String newCompany, int newSpeed, double newFuel, int newPrice,
                 boolean row) {
        super(newName, newCompany, newSpeed, newFuel, newPrice, 3);
        additionalRow = row;
    }

    @Override
    public String toString() {
        if (additionalRow) {
            return super.toString() + ", there is additional row";
        } else {
            return super.toString() + ", no additional row";
        }
    }

    public boolean isAdditionalRow() {
        return additionalRow;
    }

    public void setAdditionalRow(boolean additionalRow) {
        this.additionalRow = additionalRow;
    }
}
