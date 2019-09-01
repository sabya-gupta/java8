import java.util.function.Predicate;

public class MyPredicate {
	
	public static void main(String[] args) {
		Predicate<Person> predPerson = p->p.age>=18; 
		
		Person p3 = new Person();
		p3.setAge(18);
		p3.setName("Publu");

		if(predPerson.test(p3)) {
			System.out.println(p3.getName() + " is Adult.");
		}else {
			System.out.println(p3.getName() + " is Minor.");
		}

		Person p2 = new Person();
		p2.setAge(12);
		p2.setName("Tublu");
		
		if(predPerson.test(p2)) {
			System.out.println(p2.getName() + " is Adult.");
		}else {
			System.out.println(p2.getName() + " is Minor.");
		}

		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Gublu");
		
		if(predPerson.test(p1)) {
			System.out.println(p1.getName() + " is Adult.");
		}else {
			System.out.println(p1.getName() + " is Minor.");
		}
		
	}
	

}

class Person {
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
