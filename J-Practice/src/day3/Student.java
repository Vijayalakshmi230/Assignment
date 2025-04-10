package day3;

import java.util.Objects;

public class Student {
	int roll;
	String name;
	Student()
	{
		
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		
		if (obj == null)
			return false;
		
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		
		return Objects.equals(name, other.name) && roll == other.roll;
	}
  
	
	
	
 
 
	
	
	
	
	
	
	
	
	
	
}