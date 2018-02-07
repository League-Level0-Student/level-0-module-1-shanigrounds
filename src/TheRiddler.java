import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog(null,
				"Feed me and I live, yet give me a drink and I die. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("fire")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is fire.");
		}
		// 6. Add some more riddles

		String answer2 = JOptionPane.showInputDialog(null,
				"He has married many women, but has never been married. Who is he?");
		if (answer.equals("a priest")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is a priest");
		}

		JOptionPane.showMessageDialog(null, "+score+");

		// 2. Make a pop up to show the score.

	}
}