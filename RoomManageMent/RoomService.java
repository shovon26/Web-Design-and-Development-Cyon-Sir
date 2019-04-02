package Service;

import Model.Room;

import java.util.List;

public interface RoomService {

    public List<Room> getAllRooms();
    public Room getRoombyId(String roomNo);
    public void saveorUpdate(Room room);
    public void removeRoom(String roomNo);

}
