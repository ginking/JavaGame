package com.redomar.game.lib;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.redomar.game.Game;
import com.redomar.game.menu.Menu;

public class Mouse implements MouseListener, MouseMotionListener{

	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		if (e.getX() > 35 && e.getX() < 440){
			//START is being selected
			if(e.getY() > 35 && e.getY() < 125){
				Menu.setSelectedStart(true);
			}else{
				Menu.setSelectedStart(false);
			}
			//EXIT is being selected
			if(e.getY() > 160 && e.getY() < 250){
				Menu.setSelectedExit(true);
			}else{
				Menu.setSelectedExit(false);
			}
		}else{
			Menu.setSelectedStart(false);
			Menu.setSelectedExit(false);
		}
		
	}

	public void mouseClicked(MouseEvent e) {
		if(Menu.isRunning()){
			if (e.getX() > 35 && e.getX() < 440){
				//START game
				if(e.getY() > 35 && e.getY() < 125){
					Menu.setRunning(false);
					Menu.getFrame().setVisible(false);
					Menu.getFrame().stopFrame();
					Game.play();
				}
				//EXIT game
				if(e.getY() > 160 && e.getY() < 250){
					Menu.setRunning(false);
					Menu.getFrame().setVisible(false);
					Menu.getFrame().stopFrame();
				}
			}			
		}
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

}
