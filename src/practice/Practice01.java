package practice;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice01 extends JFrame {

  MyPanel myPanel = new MyPanel();

  public Practice01() {
    this.setTitle("이미지 그리기 연습");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);

    this.setSize(500, 500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  class MyPanel extends JPanel {

    private ImageIcon icon = new ImageIcon("images/다람.jpg");
    private Image img = icon.getImage();
    private boolean isDraw = true;
    JButton btn = new JButton("Hide/Show");

    MyPanel() {
      setLayout(new FlowLayout());
      add(btn);
      btn.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            isDraw = !isDraw;
            repaint();
          }
        }
      );
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      if (isDraw) {
        g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
      }
    }
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
