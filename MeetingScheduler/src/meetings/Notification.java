package meetings;

import java.util.List;

public class Notification {

	public static void sendNotification(Meeting meet){
		   
		List<User> users=meet.getUsers();
		
		users.forEach(e->{
			 
			System.out.println("hello "+e.getName()+" "+"You have meeting from "+meet.getSlot().getStratTime()+" to "+meet.getSlot().getEndTime());
			
		});
		
		
	}
}
