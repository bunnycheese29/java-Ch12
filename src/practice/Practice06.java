package practice;

import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice06 extends JFrame {

  MyPanel myPanel = new MyPanel();

  public Practice06() {
    this.setTitle("paintingComponent");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);

    this.setSize(300, 300);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  class MyPanel extends JPanel {

    MyPanel() {}

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      for (int i = 0; i < 50; i++) {
        g.drawLine(0, 20 * i, getWidth(), 20 * i);
      }
      for (int i = 0; i < 50; i++) {
        g.drawLine(20 * i, 0, 20 * i, getHeight());
      }
    }
  }

  public static void main(String[] args) {
    new Practice06();
  }
}
