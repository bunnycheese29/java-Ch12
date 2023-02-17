import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintFontEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public PaintFontEx() {
    this.setTitle("paintingComponent");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);

    this.setSize(700, 700);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      g.drawString("I LOVE JAVA", 30, 30);
      g.setColor(Color.PINK);
      g.setFont(new Font("Arial", Font.ITALIC, 20));
      g.drawString("I LOVE JAVA", 30, 70);
      g.setColor(new Color(0x3399cc));
      g.setFont(new Font("Jokerman", Font.BOLD, 30));
      g.drawString("I LOVE JAVA", 30, 110);
      g.setColor(new Color(0x000000));
      g.drawLine(100, 100, 200, 100);
      g.drawLine(200, 100, 200, 200);
      g.drawLine(200, 200, 100, 200);
      g.drawLine(100, 200, 100, 100);
      g.setColor(new Color(0x99ccff));
      g.fillRect(250, 250, 350, 350);
      g.setColor(new Color(0x66ccff));
      g.fillOval(250, 50, 100, 100);
      g.setColor(new Color(0x66ccff));
      g.fillArc(50, 300, 100, 100, 0, 180);
      int x[] = { 30, 10, 30, 60 };
      int y[] = { 250, 275, 300, 275 };
      g.fillPolygon(x, y, 4);
    }
  }

  public static void main(String[] args) {
    new PaintFontEx();
  }
}
