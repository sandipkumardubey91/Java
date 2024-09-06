package mapss;
import java.util.*;
import java.util.Map.*;


class Persons
{
	private String name;
	private int age;
	private String city;
	
	public Persons(String name, int age, String city)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
	
	public String  toString()
	{
		return "Name: " + name + " " +  "Age: " + age + " " + "Location: " + city;
	}
	
}

public class hashmapLinkedhashmap 
{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Persons person1 = new Persons("Virat", 35, "Delhi");
		Persons person2 = new Persons("Rohit", 36, "Mumbai");
		Persons person3 = new Persons("Hardik", 29, "Gujrat");
		
		
		Map map = new LinkedHashMap();
		
		map.put(18,person1);
		map.put(45, person2);
		map.put(33, person3);
		
//		System.out.println(map);
		
		Set entries = map.entrySet();
		
		Iterator itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry =(Entry) itr.next();
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		
		

	}

}
