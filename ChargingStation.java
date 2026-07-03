import java.util.Scanner;
public class ChargingStation{
String stationName,chargingType;
Scanner sc=new Scanner(System.in);
public void selectStation(){
System.out.println("1.Delhi 2.Noida 3.Gurugram");
int c=sc.nextInt();
stationName=(c==2)?"Noida":(c==3)?"Gurugram":"Delhi";
System.out.println("1.Fast 2.Normal");
chargingType=sc.nextInt()==1?"Fast Charging":"Normal Charging";
}
public String getChargingType(){return chargingType;}
public void displayStation(){
System.out.println("Station: "+stationName);
System.out.println("Charging: "+chargingType);
}}