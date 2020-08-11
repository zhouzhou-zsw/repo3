package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.Room;

import dao.RoomMapper;

@Service("/roomservice")
public class RoomServiceImp implements RoomService{
    @Autowired
	private RoomMapper roommapper;

	public RoomMapper getRoommapper() {
		return roommapper;
	}

	public void setRoommapper(RoomMapper roommapper) {
		this.roommapper = roommapper;
	}

	@Override
	public List<Room> selectRoomList(Room m) {
		// TODO Auto-generated method stub
		return roommapper.selectRoomList(m);
	}
	
}
