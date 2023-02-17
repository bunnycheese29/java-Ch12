package practice;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice02 extends JFrame {

  MyPanel myPanel = new MyPanel();

  public Practice02() {
    this.setTitle("이미지 위에 원 드래깅 연습");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);

    this.setSize(500, 500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  class MyPanel extends JPanel {

    private ImageIcon icon = new ImageIcon("images/다람.jpg");
    private Image img = icon.getImage();
    private int ovalX = 100;
    private int ovalY = 100;

    MyPanel() {
      this.addMouseMotionListener(
          new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
              ovalX = e.getX() - 15;
              ovalY = e.getY() - 15;
              repaint();
            }
          }
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
      g.setColor(Color.GREEN);
      g.fillOval(ovalX, ovalY, 30, 30);
    }
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
