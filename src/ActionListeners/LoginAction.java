package ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Frames.FrameCadastroProfessor;

public class LoginAction {

	public static ActionListener getAction(){
		return new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				FrameCadastroProfessor frame = new FrameCadastroProfessor();
				
			}
		};
	

	
}
}
