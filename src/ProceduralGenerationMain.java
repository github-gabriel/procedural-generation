public class ProceduralGenerationMain {

	public static void main(String[] args) {

		Window window = new Window();
		
		while(window.frame.isActive()) { // Loop
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
