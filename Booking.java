package SimpleBusReservation;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String PassengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of the customer: ");
        this.PassengerName = in.nextLine();
        System.out.println("Enter bus no: ");
        this.busNo = in.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getbusNo() == this.busNo){
                capacity = bus.getCapacity();
            }
        }
        int booked=0;
        for(Booking b: bookings){
            if(b.busNo == busNo && b.date.equals(this.date)){
                booked++;
            }
        }
        return booked != capacity;
    }

}
