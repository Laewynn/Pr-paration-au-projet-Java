import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Panneau extends JPanel {
	 public void paintComponent(Graphics g){
		 Font font = new Font("Courier", Font.BOLD, 20);
		    g.setFont(font);
		    g.setColor(Color.red);
		g.drawString("Tiens ! Une bite !", 10 , 20);

		  }               

		}


