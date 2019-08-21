import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("What is your star sign?");
	if(question.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "You are a curious, impatient, and energetic person who loves challenges" );
	}
	
	if(question.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "You are a person who is adaptable, stubborn, and loves to eat");
	}
	
	if(question.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "You are adventurous, a great conversationalist, and love to be the center of attention");
	}
	
	if(question.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "You are brave, courageous, and moody");
	}
	
	if(question.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null,"You are a person who is honest,loves to relax, and can be arrogant");
	}
	
	if(question.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "You are calm, always thinking about something, and judgemental");
	}
	
	if(question.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "You are self-sacrificing, you like to have balance in your life, and you can be  argumentative");
	}
	
	if(question.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "You are contemplative, like to be alone, and exhibit extreme self-control in many areas");
	}
	
	if(question.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "You are a person who loves to discover new things, meet new people, and do not like to be confined");
	}
	
	if(question.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "You are a person who works very hard,is a natural born leader, and can be selfish at times.");
	}
	
	if(question.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "You are very patient, very friendly, and can become emotionless due to not having enough alone time");
	}
	
	if(question.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "You are very empathetic, religious, and you worry a lot");
	}
}
}
