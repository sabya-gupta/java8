
public class MyImpls {

	public Runnable printChild = ()->{
		for(int i=0; i<10; i++) {
			System.out.println("Other child");
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	};
}
