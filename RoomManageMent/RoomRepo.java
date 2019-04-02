package Repo;

import Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RoomRepo extends JpaRepository<Room,String> {

  public Collection<Room> findAllRoom();
}
