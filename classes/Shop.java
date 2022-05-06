package classes;
import java.lang.*;

public class Shop
{
	private String sid;
    private String name;
	
	public void setName(String name) {
		this.name=name;
	}
    public void setSid(String sid) {
    	this.sid=sid;
    }
	
    public String getName( ) {
    	return name;
    }
    public String getSid( ){
    	return sid;
    }
	
}