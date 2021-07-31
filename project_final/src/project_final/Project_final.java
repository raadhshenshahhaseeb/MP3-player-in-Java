/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_final;

/**
 *
 * @author Haseeb Raja
 */
public class Project_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       lookAndFeel look = new lookAndFeel();
       
        
        

    }
    
    
    
    /*public void actionPerformed(ActionEvent event){
            String path = null;
			if ( event.getSource()== browse_Button)
                        {
                      /*  final JFileChooser fc = new JFileChooser();
                        FileFilter filter = new FileNameExtensionFilter("WAV","wav");
                        fc.setFileFilter(filter);
                        fc.setAcceptAllFileFilterUsed(false);
                        int returnVal = fc.showOpenDialog(browse_Button);
                        if (returnVal == JFileChooser.APPROVE_OPTION) {
                            File file = fc.getSelectedFile();
                            play_pause_Button.setEnabled(true);
                            loop_Button.setEnabled(true);       
                            stop_Button.setEnabled(true);
                             path = fc.getSelectedFile().getPath();
URL urlClick = handlerClass.class.getResource(path);
                            AudioClip click = Applet.newAudioClip(urlClick);
click.play();
                            
                        }
                            }
                              
                              
                              
                            
                            fileChooser = new JFileChooser();
                            
		FileFilter wavFilter = new FileFilter() {
			@Override
			public String getDescription() {
				return "Sound file (*.WAV)";
			}

			@Override
			public boolean accept(File file) {
				if (file.isDirectory()) {
					return true;
				} else {
					return file.getName().toLowerCase().endsWith(".wav");
				}
			}
		};

		
		fileChooser.setFileFilter(wavFilter);
		fileChooser.setDialogTitle("Open Audio File");
		fileChooser.setAcceptAllFileFilterUsed(false);

		int userChoice = fileChooser.showOpenDialog(browse_Button);
		if (userChoice == JFileChooser.APPROVE_OPTION) {
			audioFilePath = fileChooser.getSelectedFile().getAbsolutePath();
			lastOpenPath = fileChooser.getSelectedFile().getParent();
                         play_pause_Button.setEnabled(true);
                            loop_Button.setEnabled(true);       
                            stop_Button.setEnabled(true);   
                            
                            
                        if(event.getSource()==play_pause_Button)
                        {
                            
                                if (!isPlaying) {
					playBack();
				} else {
					stopPlaying();
				}
                           
                            }
                                                    }

        
        
    }
        }*/
}
