import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RenderMap {
	
	JFrame frame;
    Canvas canvas;

    BufferStrategy bufferStrategy;

    private int WIDTH = 1040;
    private int HEIGHT = 1040;
	   
	public RenderMap() {
	  frame = new JFrame("Basic Game");
      JPanel panel = (JPanel) frame.getContentPane();
      panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
      panel.setLayout(null);
      
      canvas = new Canvas();
      canvas.setBounds(0, 0, WIDTH, HEIGHT);
      canvas.setIgnoreRepaint(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
                             //this will make the frame not re-sizable
      frame.setResizable(false);
      frame.setVisible(true);
                             //this will add the canvas to our frame
      panel.add(canvas);
      canvas.createBufferStrategy(2);
      bufferStrategy = canvas.getBufferStrategy();
                            //This will make sure the canvas has focus, so that it can take input from mouse/keyboard
      canvas.requestFocus();
                             //this will set the background to black
      canvas.setBackground(Color.black);
      // This will add our keyhandler to our program
      canvas.addKeyListener(new KeyHandler());
   }
   void render(String filename) throws IOException {
      File file = new File(filename); 
      FileInputStream fis = new FileInputStream(file);
      BufferedImage image = ImageIO.read(fis);
      Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
      render(g, image);
      g.dispose();
      bufferStrategy.show();
   }
   protected void render(Graphics2D g, BufferedImage img){
      //Here we will render everything
	   g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
   }

   
 }
