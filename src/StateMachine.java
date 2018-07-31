import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StateMachine implements Runnable {

	RenderMap drawing = new RenderMap();
	@Override
	public void run() {
		while(true) {
			Instances.player.update();
			Path currentRelativePath = Paths.get("");
			String filename = currentRelativePath.toAbsolutePath().toString();
			filename += "/trialmap.png";
		    try {
				drawing.render(filename);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		}//while loop updating and rendering game
		
	}//run method

}//StateMachine
