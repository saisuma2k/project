package com.revature.hotelmanagementsystem.service;

import java.util.List;

import com.revature.hotelmanagementsystem.bean.AdminEmployeeUserBean;
import com.revature.hotelmanagementsystem.bean.BookingInformationBean;
import com.revature.hotelmanagementsystem.bean.EmployeeInformationBean;
import com.revature.hotelmanagementsystem.bean.HotelInformationBean;
import com.revature.hotelmanagementsystem.bean.RoomInformationBean;

public interface AdminOperationService {
	// hotel crud operations
	public HotelInformationBean addHotel(HotelInformationBean hotelBean);

	public List<HotelInformationBean> getHotelList();

	public boolean updateHotelInformation(HotelInformationBean hotelBean);

	public boolean deleteHotelInformation(int hotelId);
	
	public boolean licenseNumberPresent(String licenseNumber);

	// room crud operations
	public RoomInformationBean addRoom(RoomInformationBean roomBean);

	public boolean deleteRoomInformation(int roomId);

	public List<RoomInformationBean> getRoomList();

	public boolean updateRoomInformation(RoomInformationBean roomBean);

	// employee crud operations
	public EmployeeInformationBean addEmployee(EmployeeInformationBean employeeBean);

	public List<EmployeeInformationBean> getEmployeeList();

	public boolean deleteEmployeeInformation(int employeeId);

	public boolean updateEmployeeInformation(EmployeeInformationBean employeeBean);

	public List<BookingInformationBean> getBookingHistory();
}// end of interface
