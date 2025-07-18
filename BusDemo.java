package SimpleBusReservation;
import java.util.*;
public class BusDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));
        for(Bus b : buses){
            b.displayBusInfo();
        }

            int userOpt = 1;

        while(userOpt==1){
            System.out.println("Enter 1 to Book and 2 to exit");
            userOpt = in.nextInt();
            if(userOpt==1){
                Booking  booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("your booking is confirmed");
                }
                else{
                    System.out.println("Sorry Bus is Full.Try another bus or on date");
                }
            }
        }


    }
}
