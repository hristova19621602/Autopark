package bg.tu_varna.sit.car;

public class Cabriolet extends Car{

    protected String retractableRoofType;

    public Cabriolet(String newName, String newCompany, int newSpeed, double newFuel, int newPrice,
                     String retractableRoof) {
        super(newName, newCompany, newSpeed, newFuel, newPrice, 5);
        retractableRoofType = retractableRoof;
    }

    @Override
    public String toString() {
        return super.toString() + ", retractableRoofType: " + retractableRoofType;
    }

    public String getRetractableRoofType() {
        return retractableRoofType;
    }

    public void setRetractableRoofType(String retractableRoofType) {
        this.retractableRoofType = retractableRoofType;
    }

}
