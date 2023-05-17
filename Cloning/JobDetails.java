package cloning;

public class JobDetails implements Cloneable{
	
	public String streetName;
	public String cityName;
	
	
	public JobDetails(String streetName, String cityName) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
	}
	
	@Override
	protected JobDetails clone() throws CloneNotSupportedException {
		Object clonedObject = super.clone();
		JobDetails jd = (JobDetails)clonedObject;
		return jd;
	}
}