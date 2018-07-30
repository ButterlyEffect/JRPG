
public class Main {
	public static void main(String [] args){
        System.out.println("Application, started!");
        
        StateMachine game = new StateMachine();
        new Thread(game).start(); //start game engine thread
      }//main method
}//Main
