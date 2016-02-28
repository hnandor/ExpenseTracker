package com.nhuszka.expense_tracker.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.springframework.stereotype.Component;

import com.nhuszka.expense_tracker.backend.service.ServiceFacade;

@Component
public class ExpenseTrackerGUI {

	private JFrame frame;
	private ServiceFacade serviceFacade;

	public ExpenseTrackerGUI() {
		frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Types");
		button.addActionListener(e -> {
			System.out.println(serviceFacade.listExpenseType());
		});
		panel.add(button);

		JButton button2 = new JButton("Expenses");
		button2.addActionListener(e -> {
			System.out.println(serviceFacade.listExpense());
		});
		panel.add(button2);
		frame.add(panel);
		frame.pack();
	}

	public void start(ServiceFacade serviceFacade) {
		this.serviceFacade = serviceFacade;
		SwingUtilities.invokeLater(() -> {
			frame.setVisible(true);
		});
	}
}
