package meetings;

import java.time.LocalDateTime;

public class Demo {

	public static void main(String[] args) {
		
		RagisterdMeeting ragister=new RagisterdMeeting();
		
		MeetingRoom mr=new MeetingRoom();
		mr.setName("Interview");
		mr.setRoomId(1);
		
		
		Slot s1=new Slot();
		s1.setStratTime(LocalDateTime.of(2023, 4, 12, 2, 4));
		s1.setEndTime(LocalDateTime.of(2023, 4, 12, 4, 4));
		
		Slot s2=new Slot();
		s2.setStratTime(LocalDateTime.of(2023, 4, 12, 16, 4));
		s2.setEndTime(LocalDateTime.of(2023, 4, 12, 8, 4));
		
		
		Slot s3=new Slot();
		s3.setStratTime(LocalDateTime.of(2023, 4, 12, 10, 4));
		s3.setEndTime(LocalDateTime.of(2023, 4, 12, 12, 4));
		
		mr.getSlots().add(s1);
		mr.getSlots().add(s2);
		mr.getSlots().add(s3);
		
		//  meetingroom is done
		
		
		
		Slot s=mr.findSlot(LocalDateTime.of(2023, 4, 12, 11, 4), LocalDateTime.of(2023, 4, 12, 11, 50));
		
		if(s!=null) {
			
			User admin=new User("amir", "dharu", 1);
			User u2=new User("amir", "dharu", 1);
			User u3=new User("amir", "dharu", 1);
			User u4=new User("amir", "dharu", 1);
			
			
			Meeting m=new Meeting();
			m.setAdmin(admin);
			m.setId(1);
			m.setName("Interview");
			m.setSlot(s);
			m.getUsers().add(u2);
			m.getUsers().add(u3);
			m.getUsers().add(u4);
			
			boolean str= mr.bookslot(s);
			Notification.sendNotification(m);
			System.out.println(str);
			
			ragister.getMeetings().add(m);
			
			
			
		}else {
			System.out.println("Slot is not avalable");
		}
		
//		Slot sx=mr.findSlot(LocalDateTime.of(2023, 4, 12, 3, 4), LocalDateTime.of(2023, 4, 12, 3, 50));
//		
//		System.out.println(sx);
			
		

		
	//	System.out.println(mr.getSlots());
		
		
		
		
		
		
	}
}
