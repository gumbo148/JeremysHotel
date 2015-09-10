import java.lang.System;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
public class Hotel {
    public ArrayList<Room> roomArray = new ArrayList<>();

    //adds a room to the arraylist
    public void addRoom(int roomNumber, String size, double price){
        Room room = new Room(roomNumber);
        roomArray.add(room);
        room.setRoomSize(size);
        room.roomPrice = price;
    }


//TODO: make search method to pick rooms

    public Room searchRooms(int roomNumber) {

        for (Room search : roomArray) {
            if (search.roomNumber == roomNumber) {

                return search;

            }

        }

        return null;
    }



    public void removeRoom(int roomNumber){


    }

    public void availableRooms(){
        //TODO: look through list and find open rooms
        ArrayList<Room> availableRoomList = new ArrayList<>();
        for (Room tempRoom: roomArray){
            tempRoom.availablity();
            if(tempRoom.available == true){
                availableRoomList.add(tempRoom);
            }

        }
        for (Room tempRooms : availableRoomList){
            System.out.println(tempRooms.roomNumber +" "+ tempRooms.roomSize);
        }
    }

    public void unavailableRooms(){
        //TODO: find and list all occupied rooms

    }
    public int totalRooms(){
        int roomTotal = 0;
        for(Room tempRoom: roomArray){
            roomTotal++;
        }

        return roomTotal;
    }







}
