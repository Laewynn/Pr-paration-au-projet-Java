import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame {
	public Fenetre(){	
			
			//Fenetre fen = new Fenetre();
		
			//D�finit un titre pour la fen�tre
			this.setTitle("Ma premi�re fen�tre Java"); 
			
			//D�finit sa taille : 400px de large et 100px de haut
			this.setSize(100,150);
			
			//D�finit que la fen�tre se positionne au centre
			this.setLocationRelativeTo(null);
			
			// Termine le processus lorqu'on clique sur la croix rouge
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setContentPane(new Panneau());
			
			this.setVisible(true);
			/* // Instaniation d'un objet Panel
			JPanel pan = new JPanel();
			
			// D�finition de sa couleur de fond
			pan.setBackground(new Color(33,33,33));
			
			 //On pr�vient notre JFrame que notre JPanel sera son content pane
		    this.setContentPane(pan);               
		    this.setVisible(true); */
			
		 
			
		}

}


