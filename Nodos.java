/* UNIVERSIDAD DE PAMPLONA
    Ingeniería de Sistemas - Matemáticas discretas: Grafos
    M.Sc. Luis Armando Portilla Granados
    Abril 24 de 2018
*/

package pintar;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mariana
 */
public class Nodos {
    private int x;
    private int y; 
    private String nombre;
    static final int d = 20; //diámetro del círculo

    public Nodos(int x, int y, int i) {
        this.x = x;
        this.y = y;
        this.nombre = Character.toString((char)(65+i)); 
        
    }
    public void pintarNodo(Graphics g) {
    int x = this.getX();
    int y = this.getY();
    int d = getD();

    g.setColor(Color.pink);
    g.fillOval(x - d/2, y - d/2, d, d); // Relleno del círculo

    g.setColor(Color.BLACK);
    g.drawOval(x - d/2, y - d/2, d, d); // Contorno del círculo

    g.setColor(Color.blue);
    g.drawString(this.getNombre(), x - d/2, y - d/2); // Nombre del vértice
}


    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the d
     */
    public static int getD() {
        return d;
    }
    
}
