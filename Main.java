public class Main {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" SMART EV CHARGING STATION SYSTEM");
        System.out.println("====================================");

        Vehicle vehicle = new Vehicle();
        ChargingStation station = new ChargingStation();
        ChargingCalculator calculator = new ChargingCalculator();
        Receipt receipt = new Receipt();

        vehicle.getVehicleDetails();
        vehicle.displayVehicleDetails();

        station.selectStation();
        station.displayStation();

        calculator.calculateCharge(station.getChargingType());
        calculator.displayBill();

        receipt.printReceipt(vehicle, station, calculator);
    }
}