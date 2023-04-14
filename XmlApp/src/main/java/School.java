import java.util.ArrayList;
import java.util.List;

public class School {

	public String name;
	public int id;
	List<String> names=new ArrayList<>();
	
	
	
	
	
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public School(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
	public School() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "School name=" + name + ", id=" + id + " names "+names  ;
	}
	
}
