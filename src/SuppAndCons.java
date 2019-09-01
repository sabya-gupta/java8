import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SuppAndCons {

	static Supplier<Date> supplyDate=()->{
		return new Date();
	};
	
	static Consumer<Person2> setDate = (p)->{
		p.setRegDate(supplyDate.get());
	};
	
	public static void main(String[] args) {
		Person2 p2 = new Person2();
		setDate.accept(p2);
		System.out.println(p2.getRegDate().toLocaleString());
	}
	
}

class Person2 {
	Date regDate;

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}

