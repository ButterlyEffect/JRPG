
public class StateMachine implements Runnable {

	RenderMap drawing = new RenderMap();
	@Override
	public void run() {
		while(true) {
			Instances.player.update();
		    drawing.render();
		    try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		}//while loop updating and rendering game
		
	}//run method

}//StateMachine
