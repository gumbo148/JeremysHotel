import java.util.Scanner;

/**
 * Created by Jeremy on 9/9/2015.
 */
public class Room extends Exception {

    public String roomSize;
    public int roomNumber;
    //room open or not
    public boolean occupied;
    //needs cleaning or not
    public boolean cleaningNeeded;
    //room ready for guest or not
    public boolean available;
    //cost of room

    public double roomPrice;



    public Room(int roomNumber){
        occupied = false;
        cleaningNeeded = false;
        roomPrice = 0;
        roomSize = null;
        this.roomNumber = roomNumber +100;


    }

    public void markOccupied(){
        occupied = true;

    }
    public void clearRoom(){
        occupied = false;
        cleaningNeeded = true;
    }

    public void roomCleaned(){
        cleaningNeeded = false;

    }

    public void availablity(){

        if(occupied == false && cleaningNeeded == false){
             available = true;
        }
        else  available = false;
    }

    public void setRoomSize(String size){

        switch (size){
            case "suit": roomSize = size;
                break;
            case "penthouse": roomSize = size;
                break;
            default: System.out.println("Wrong size");
                break;

        }


    }


    public Room moveRooms(Room room){

        return room;
    }

    public double priceRoom(double price){

        roomPrice = price;

        return roomPrice;

    }


}
