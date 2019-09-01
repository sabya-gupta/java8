
public class LambdaAndFunc {

	public void print(int n1, int n2, FuncInterface1 f) {
		// FuncInterface1 f1 = (a,b)->a+b;
		System.out.println(f.add(n1, n2));
	}

	
	
	public static void main(String[] args) {
		FuncInterface1 f1 = (a, b) -> a + b;
		FuncInterface1 f2 = (a, b) -> a + b + 3;

		new LambdaAndFunc().print(5, 6, f1);
		new LambdaAndFunc().print(5, 6, f2);
		new LambdaAndFunc().print(5, 6, (a,b)->a*a+b*b);
		

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child");
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};

		Thread t = new Thread(r);
		Thread t2 = new Thread(new MyImpls().printChild);
		t.run();
		t2.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
