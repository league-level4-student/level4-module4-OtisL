package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    /*
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movingMorph;*/
    ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   	
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 morphs.add(new BluePolymorph(800,-400));
   	 morphs.add(new RedMorph(-400,800));
   	 morphs.add(new MovingMorph(-1000,-1000));
   	 /*
   	 bluePoly = new BluePolymorph(50, 50);
   	 redPoly = new RedMorph(50, 50);
   	 movingMorph = new MovingMorph(50, 50);*/
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	for(Polymorph p : morphs) {
   		p.draw(g);
   	}
   	 //draw polymorph
   	/* bluePoly.draw(g);
   	 redPoly.draw(g);
   	 movingMorph.draw(g);*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for(Polymorph p : morphs) {
   		p.update();
   	}
   	/* bluePoly.update();
   	 redPoly.update();
   	 movingMorph.update();*/
    }
}
