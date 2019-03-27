import java.util.ArrayList;

public class Bedroom {
    private Integer roomNumber;
    private Integer capacity;
    private ArrayList<Guest> guests;
    private String bedroomType;

    public Bedroom(Integer roomNumber, Integer capacity, String bedroomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.bedroomType = bedroomType;
    }
    public int getRoomNumber() {
        return this.roomNumber;
    }
}
