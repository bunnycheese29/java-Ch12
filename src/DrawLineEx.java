import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLineEx extends JFrame {

  MyPanel myPanel = new MyPanel();

  public DrawLineEx() {
    this.setTitle("paintingComponent");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);

    this.setSize(500, 500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  class MyPanel extends JPanel {

    private Vector<Point> vStart = new Vector<>();
    private Vector<Point> vEnd = new Vector<>();

    MyPanel() {
      // vStart.add(new Point(100, 100));
      // vStart.add(new Point(300, 150));
      // vStart.add(new Point(200, 450));
      // vEnd.add(new Point(200, 200));
      // vEnd.add(new Point(200, 200));
      // vEnd.add(new Point(200, 200));
      this.addMouseListener(
          new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {}

            public void mouseDragged(MouseEvent e) {}
          }
        );
      this.addMouseListener(
          new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              Point startPoint = e.getPoint();
              vStart.add(startPoint);
            }

            public void mouseReleased(MouseEvent e) {
              Point endPoint = e.getPoint();
              vEnd.add(endPoint);
              repaint();
            }
          }
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.magenta);
      for (int i = 0; i < vStart.size(); i++) {
        Point start = vStart.elementAt(i);
        Point end = vEnd.elementAt(i);
        g.drawLine(
          (int) start.getX(),
          (int) start.getY(),
          (int) end.getX(),
          (int) end.getY()
        );
      }
    }
  }

  public static void main(String[] args) {
    new DrawLineEx();
  }
}