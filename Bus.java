package SimpleBusReservation;

public class Bus {
   private  int busNo;
    private boolean AC;
    private int capacity;

    Bus(int busNo,boolean AC,int capacity){
        this.busNo = busNo;
        this.AC = AC;
        this.capacity = capacity;
    }
    public int getbusNo(){
        return busNo;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setAC(boolean AC){
        this.AC = AC;
    }
    public boolean isAC(){
        return AC;
    }
    public void displayBusInfo(){
        System.out.println("Bus  No:" + busNo + " AC:"+ AC + " Total Capacity:" + capacity);
    }
}
