import java.util.ArrayList;
public class Hotel {
    public ArrayList<Room> roomArray = new ArrayList<>();
    Guest guest = new Guest();
    //adds a room to the arraylist
    public void addRoom(int roomNumber, String size, double price){
        Room room = new Room(roomNumber);
        roomArray.add(room);
        room.setRoomSize(size);
        room.roomPrice = price;
    }


//TODO: make search method to pick rooms

    public Room searchRooms(int roomNumber) {
        boolean isInArray;
        for (Room search : roomArray) {
            if (search.roomNumber == roomNumber)
                return search;
        }
        return null;
    }



    public Room removeRoom(int roomNumber){

        roomArray.remove(searchRooms(roomNumber));

        return null;
    }

    public ArrayList availableRooms(){

        ArrayList<Room> availableRoomList = new ArrayList<>();
        for (Room tempRoom: roomArray){
            tempRoom.availablity();
            if(tempRoom.available == true){
                availableRoomList.add(tempRoom);
            }

        }
        return availableRoomList;
    }

    public ArrayList unavailableRooms(){

        ArrayList<Room> availableRoomList = new ArrayList<>();
        for (Room tempRoom: roomArray){
            tempRoom.availablity();
            if(tempRoom.available == false){
                availableRoomList.add(tempRoom);
            }

        }
        return availableRoomList;

    }
    public int totalRooms(){
        int roomTotal = 0;
        for(Room tempRoom: roomArray){
            roomTotal++;
        }

        return roomTotal;
    }







}
