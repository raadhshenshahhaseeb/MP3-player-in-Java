/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_final;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import javazoom.jl.player.Player;

/**
 *
 * @author Haseeb Raja
 */
public class lookAndFeel extends JFrame {
    private JLabel label1;
    private JPanel panel_slider;
    private JPanel panel_buttons;
    private JPanel panel_header;
    private JButton play_Button;
    private JButton pause_Button;
    private JButton stop_Button;
    private JButton loop_Button;
    private JButton like_Button;
    private JButton browse_Button;
    private JFrame frame1;
    private JSlider slider;
    private ButtonGroup buttongroup;
    JFileChooser fileChooser ;
    Player player; 				// object that can actually play, pause, etc a song
    File file; 					// object that manipulates files
    FileInputStream fis;
    BufferedInputStream bis;
    Thread Thread=new Thread();
    
		
    lookAndFeel() {
        super("Hafazaeeb Music Player");
        frame1=new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 150);
        setAlwaysOnTop(true);
        setResizable(false);
        
        setLayout(new FlowLayout());
        
        
        panel_slider = new JPanel();
        panel_buttons = new JPanel();
        panel_slider.setSize(50,50);
        panel_buttons.setSize(50,50);
        
        Icon pause = new ImageIcon(getClass().getResource("Pause.png"));
        pause_Button= new JButton("pause",pause);
        pause_Button.setEnabled(false);
        panel_buttons.add(pause_Button);
        
        Icon play = new ImageIcon(getClass().getResource("Play.gif"));
        play_Button= new JButton("Play",play);
        play_Button.setEnabled(false);
        panel_buttons.add(play_Button);
        
        Icon stop = new ImageIcon(getClass().getResource("Stop.gif"));
        stop_Button = new JButton("Stop",stop);
        stop_Button.setEnabled(false);
        panel_buttons.add(stop_Button);
        
        Icon like = new ImageIcon(getClass().getResource("like.png"));
        like_Button = new JButton("",like);
        panel_buttons.add(like_Button);
        
        Icon loop = new ImageIcon(getClass().getResource("loop.gif"));
        loop_Button = new JButton("Repeat",loop);
        loop_Button.setEnabled(false);
        panel_buttons.add(loop_Button);
        
        Icon open = new ImageIcon(getClass().getResource("Open.png"));
        browse_Button= new JButton("Open",open);
        panel_slider.add(browse_Button);
        
        slider = new JSlider();
        panel_slider.add(slider);
        
        panel_slider.setVisible(true);
        panel_buttons.setVisible(true);
        
        add(panel_slider);
        add(panel_buttons);
        
        
        handlerClass handler = new handlerClass();
        stop_Button.addActionListener(handler);
        loop_Button.addActionListener(handler);
        browse_Button.addActionListener(handler);
        play_Button.addActionListener(handler);        
        pause_Button.addActionListener(handler);
    
        frame1.pack();
        setVisible(true);
    }
      
    private class handlerClass implements ActionListener{
       
        
 public void actionPerformed( ActionEvent actionEvent )
            {
                if(actionEvent.getSource()== browse_Button) {
                chooser();   
              }
              else if( actionEvent.getSource() == play_Button ){
                  run();
                  play_Button.setSelected(false);
                  
                
              }
              
             else if ( actionEvent.getSource() == loop_Button )
             {
             try {  // try the following instructions, if any of them throws an exception (an error occurred)
				// then catch the exception and show an appropriate error message to the user
			fis = new FileInputStream(file.toString());
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
			player.play();
                        

		} catch (Exception e) { 
			JOptionPane.showMessageDialog(null,"Invalid file or location", 
					"Error loading file", JOptionPane.ERROR_MESSAGE); 
		} 
             
             }
              else if ( actionEvent.getSource() == stop_Button )
                  stop();
              else if(actionEvent.getSource()==pause_Button)
              {
                  
                  
                  
              }
               // stop AudioClip
              } // end method actionPerformed
            } // end class ButtonHandler
    
    
    void run()
    {
     try {  // try the following instructions, if any of them throws an exception (an error occurred)
				// then catch the exception and show an appropriate error message to the user
			fis = new FileInputStream(file.toString());
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
			new Thread() {
            public void run() {
                try { player.play(); }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
                        
		} catch (Exception e) { 
			JOptionPane.showMessageDialog(null,"Invalid file or location", 
					"Error loading file", JOptionPane.ERROR_MESSAGE); 
		} 
     
     
    }
    void stop()
     {
     player.close(); 
     }
    void chooser()
    {
    fileChooser = new JFileChooser();   
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                  int result = fileChooser.showOpenDialog(null);
                  if (result == JFileChooser.APPROVE_OPTION ) {
			file = fileChooser.getSelectedFile();  // user selected a song so get the selected file
		}
		else {
			file = null; // user clicked Cancel button on dialog or an error occurred
		}
                  play_Button.setEnabled(true);
                            loop_Button.setEnabled(true);       
                            stop_Button.setEnabled(true);
                  pause_Button.setEnabled(true);
		              }
    
    }
          // end class LoadA

    
    
 