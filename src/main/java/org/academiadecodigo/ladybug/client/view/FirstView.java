package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.utils.Messages;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstView extends AbstractView {

	private String[] firstMenuOptions;
	private int answerIndex;
	private PrintWriter printWriter;

	public FirstView(Prompt prompt) {
		super(prompt);

		firstMenuOptions = new String[]{"Login", "Register", "Exit"};

	}

	@Override
	public void show() {
		MenuInputScanner scanner = new MenuInputScanner(firstMenuOptions);
		// scanner.setMessage(Messages.INITIALMESSAGE + "");
		printWriter.write(Messages.INITIALMESSAGE + "");

		answerIndex = prompt.getUserInput(scanner);
	}

	public int getAnswerIndex() {
		return answerIndex;
	}

	public void setPrintWriter(PrintWriter printWriter) {
		this.printWriter = printWriter;
	}

}
