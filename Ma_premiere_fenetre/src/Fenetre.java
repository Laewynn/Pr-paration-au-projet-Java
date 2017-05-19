import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame {
	public Fenetre(){	
			
			//Fenetre fen = new Fenetre();
		
			//Définit un titre pour la fenêtre
			this.setTitle("Ma première fenêtre Java"); 
			
			//Définit sa taille : 400px de large et 100px de haut
			this.setSize(100,150);
			
			//Définit que la fenêtre se positionne au centre
			this.setLocationRelativeTo(null);
			
			// Termine le processus lorqu'on clique sur la croix rouge
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setContentPane(new Panneau());
			
			this.setVisible(true);
			/* // Instaniation d'un objet Panel
			JPanel pan = new JPanel();
			
			// Définition de sa couleur de fond
			pan.setBackground(new Color(33,33,33));
			
			 //On prévient notre JFrame que notre JPanel sera son content pane
		    this.setContentPane(pan);               
		    this.setVisible(true); */
			
		 
			
		}

}


