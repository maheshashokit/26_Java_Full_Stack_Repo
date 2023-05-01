
public class PersonDetails {
	
	private String name;
	private int age;	
	
	public PersonDetails() {
		System.out.println("Non-Parameterized constructor.....");
	}
	
	public PersonDetails(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void personInfo() {
		System.out.println("Person Name:::::" + name);
		System.out.println("Person Age :::::" + age);
	}
	
	public PersonDetails getPersonObject() {
		return this;
	}
	
	public static void main(String[] args) {
		
		PersonDetails p = new PersonDetails("Mahesh",35);
		p.personInfo();
		
		System.out.println("***************************************");
        PersonDetails p1 = new PersonDetails("Ashok",35);
        p1.personInfo();
        
		p.getPersonObject().personInfo();
		
	}
}
