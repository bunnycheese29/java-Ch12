import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintImgEx extends JFrame {

  MyPanel myPanel = new MyPanel();

  public PaintImgEx() {
    this.setTitle("paintingComponent");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);

    this.setSize(500, 500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  class MyPanel extends JPanel {

    private ImageIcon icon = new ImageIcon("images/다람.jpg");
    private Image img = icon.getImage();

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setClip(100, 100, 250, 250);
      g.drawImage(img, 50, 50, this);
      //   g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
  }

  public static void main(String[] args) {
    new PaintImgEx();
  }
}
