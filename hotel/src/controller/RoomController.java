package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Room;

import service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
   @Autowired
	private RoomService roomservice;

public RoomService getRoomservice() {
	return roomservice;
}

public void setRoomservice(RoomService roomservice) {
	this.roomservice = roomservice;
}
 @RequestMapping("/enterroom")	
 public String enterroom(Room room,Model model){
	
	 List<Room> roomList=roomservice.selectRoomList(room);
	 model.addAttribute("roomList", roomList);
	 
	 return "room";
}
}
