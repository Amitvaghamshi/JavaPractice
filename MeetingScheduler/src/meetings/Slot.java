package meetings;

import java.time.LocalDateTime;
import java.util.Objects;

public class Slot {

	private LocalDateTime stratTime;
	private LocalDateTime endTime;
	private boolean isBooked;
	
	
	
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public LocalDateTime getStratTime() {
		return stratTime;
	}
	public void setStratTime(LocalDateTime stratTime) {
		this.stratTime = stratTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(endTime, isBooked, stratTime);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Slot other = (Slot) obj;
		return Objects.equals(endTime, other.endTime) && isBooked == other.isBooked
				&& Objects.equals(stratTime, other.stratTime);
	}
	@Override
	public String toString() {
		return "Slot [stratTime=" + stratTime + ", endTime=" + endTime + ", isBooked=" + isBooked + "]";
	}
	
	
	
}
