public class ChargingCalculator{
double units,rate,totalAmount;
public void calculateCharge(String t){
units=20; rate=t.equals("Fast Charging")?15:10; totalAmount=units*rate;
}
public void displayBill(){
System.out.println("\nBill");
System.out.println("Units: "+units);
System.out.println("Rate: "+rate);
System.out.println("Amount: "+totalAmount);
}}