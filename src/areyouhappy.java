import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Are you happy?");
		if (question.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}

		if (question.equalsIgnoreCase("No")) {
			String secondquestion = JOptionPane.showInputDialog("Do you want to be happy?");

			if (secondquestion.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
			
		if (secondquestion.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		}
			
			
			
			
			
		}

	}
}
