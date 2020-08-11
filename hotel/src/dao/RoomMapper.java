package dao;

import java.util.List;

import pojo.Room;

public interface RoomMapper {

	List<Room> selectRoomList(Room m);
}
