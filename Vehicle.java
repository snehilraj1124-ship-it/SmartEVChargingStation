import java.util.Scanner;
public class Vehicle{
String ownerName,vehicleNumber,vehicleType; int batteryPercentage;
Scanner sc=new Scanner(System.in);
public void getVehicleDetails(){
System.out.print("Owner Name: "); ownerName=sc.nextLine();
System.out.print("Vehicle Number: "); vehicleNumber=sc.nextLine();
System.out.print("Vehicle Type: "); vehicleType=sc.nextLine();
System.out.print("Battery %: "); batteryPercentage=sc.nextInt();
}
public void displayVehicleDetails(){
System.out.println("\nVehicle: "+vehicleType);
System.out.println("Owner: "+ownerName);
System.out.println("Number: "+vehicleNumber);
System.out.println("Battery: "+batteryPercentage+"%");
}}