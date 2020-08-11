package pojo;

import java.sql.Date;

public class Room {

	private   int id;  //编号
	private   int roomNo;//房间编号
	private   String roomType;//房间类型
	private   int peopleCount;//容纳人数
	private   double rent;//租金
	private   int isRental;//房间状态

	private   Date createdTime;//添加时间
	private   Date updatedTime;//修改时间
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public int getIsRental() {
		return isRental;
	}
	public void setIsRental(int isRental) {
		this.isRental = isRental;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	
}
