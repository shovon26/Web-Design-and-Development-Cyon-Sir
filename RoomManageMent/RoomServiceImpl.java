package Service;

import Model.Room;
import Repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepo roomRepo;

    @Override
    public List<Room> getAllRooms() {
        return roomRepo.findAll();
    }

    @Override
    public Room getRoombyId(String roomNo) {
        return roomRepo.getOne(roomNo);
    }

    @Override
    public void saveorUpdate(Room room) {
      roomRepo.save(room);
    }

    @Override
    public void removeRoom(String roomNo) {
     roomRepo.deleteById(roomNo);
    }
}
