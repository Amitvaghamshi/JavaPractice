package meetings;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class MeetingRoom{

	private int roomId;
	private String name;
	private List<Slot> slots=new ArrayList<>();
	private Meeting meeting;
	
	
	
	
	
	public int getRoomId() {
		return roomId;
	}



	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Slot> getSlots() {
		return slots;
	}



	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}



	public Meeting getMeeting() {
		return meeting;
	}



	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}



	public MeetingRoom() {
		super();
	}



	public MeetingRoom(int roomId, String name, List<Slot> slots, Meeting meeting) {
		super();
		this.roomId = roomId;
		this.name = name;
		this.slots = slots;
		this.meeting = meeting;
	}

	
	
	public Slot findSlot(LocalDateTime to,LocalDateTime end) {
		Slot s=null;
		
	//	System.out.println(slots);
		
		
		for(int i=0;i<slots.size();i++) {
			    if(slots.get(i).isBooked()==false && slots.get(i).getStratTime().isBefore(to) &&  slots.get(i).getEndTime().isAfter(end)) {
			    	   s=slots.get(i);
			    }
		}
		return s;
	}
	
	public boolean  bookslot(Slot s){
		for(int i=0;i<slots.size();i++) {
		   if(s.equals(slots.get(i))) {
			   slots.get(i).setBooked(true);
			   return true;
		   }
	     }
		 return false;
	}
	
}
