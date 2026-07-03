public class Receipt{
public void printReceipt(Vehicle v,ChargingStation s,ChargingCalculator c){
System.out.println("\n===== RECEIPT =====");
System.out.println("Owner: "+v.ownerName);
System.out.println("Vehicle: "+v.vehicleNumber);
System.out.println("Type: "+v.vehicleType);
System.out.println("Battery: "+v.batteryPercentage+"%");
System.out.println("Station: "+s.stationName);
System.out.println("Charging: "+s.chargingType);
System.out.println("Units: "+c.units);
System.out.println("Rate: "+c.rate);
System.out.println("Total: "+c.totalAmount);
}}