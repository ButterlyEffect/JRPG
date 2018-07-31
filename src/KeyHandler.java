import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyHandler extends KeyAdapter{
	public KeyHandler() {}
	
	public void keyReleased(KeyEvent key) {
		switch (key.getKeyCode()) {
	        case KeyEvent.VK_UP:
	        		Instances.player.setDirection(Player.Direction.NONE);
	             break;
	        case KeyEvent.VK_DOWN:
	            Instances.player.setDirection(Player.Direction.NONE);
	            break;
	        case KeyEvent.VK_LEFT:
	        	 	Instances.player.setDirection(Player.Direction.NONE);
	            break;
	        case KeyEvent.VK_RIGHT:
	        		Instances.player.setDirection(Player.Direction.NONE);
	            break;
		}//switch block
    }//keyReleased

    public void keyPressed(KeyEvent key) {
    		switch (key.getKeyCode()) {
	        case KeyEvent.VK_UP:
	            Instances.player.setDirection(Player.Direction.UP);
	             break;
	        case KeyEvent.VK_DOWN:
	       		Instances.player.setDirection(Player.Direction.DOWN);
	            break;
	        case KeyEvent.VK_LEFT:
	        		Instances.player.setDirection(Player.Direction.LEFT);
	            break;
	        case KeyEvent.VK_RIGHT:
	        		Instances.player.setDirection(Player.Direction.RIGHT);
	            break;
    		}//switch block
    }//keyPressed
    
}//KeyHandler Class
