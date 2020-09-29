package clases;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class paneimage extends JPanel {

    private Image img;

    public paneimage(Image img) {
        
        this.img = img;
        Dimension dimension = new Dimension(img.getWidth(null), img.getHeight(null));
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.setSize(dimension);//tamaño
        this.setLayout(null);
        //Esta clase es la que decide en qué posición van los botones y demás componentes
        //pero cuando se pone con un null  // Eliminamos el layout
   

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
 
    }

}
