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
public class Aristas {
    private Nodos n1, n2;
    private String nombreA;
    private int peso;

    public Aristas(Nodos n1, Nodos n2, int p) {
        this.n1 = n1;
        this.n2 = n2;
        this.nombreA = n1.getNombre() + n2.getNombre();
        this.peso = p;
    }

    public void pintarArista(Graphics g) {
    String cadena = "[" + peso + "]";
    int x1 = this.getN1().getX();
    int y1 = this.getN1().getY();
    int x2 = this.getN2().getX();
    int y2 = this.getN2().getY();
    int centerX = (x1 + x2) / 2;
    int centerY = (y1 + y2) / 2;

    g.setColor(Color.BLACK);
    g.drawLine(x1, y1, x2, y2);
    g.drawString(cadena, centerX, centerY);
}

    /**
     * @return the n1
     */
    public Nodos getN1() {
        return n1;
    }
    /**
     * @return the n2
     */
    public Nodos getN2() {
        return n2;
    }
    /**
     * @return the nombreA
     */
    public String getNombreA() {
        return nombreA;
    }
    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }
    
}
