package com.nhuszka.expense_tracker.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.springframework.stereotype.Component;

import com.nhuszka.expense_tracker.backend.service.ServiceFacade;

@Component
public class ExpenseTrackerGUI {

	private JFrame frame;
	private ServiceFacade serviceFacade;

	public ExpenseTrackerGUI() {
		frame = new JFrame();
	}

	public void start(ServiceFacade serviceFacade) {
		this.serviceFacade = serviceFacade;
		SwingUtilities.invokeLater(() -> {
			frame.setVisible(true);
		});
	}
}
