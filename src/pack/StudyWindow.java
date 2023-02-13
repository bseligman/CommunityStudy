package pack;
import java.awt.*;

public class StudyWindow extends Frame{
	// Private Ints
	private int anint = 3;
	
	// Getter - Return this int
	public int getValue() {
		return anint;
	}
	
	// Setter - Change to visible
	public void beVis() {
		setVisible(true);
	}
	
	// Self declare
	public StudyWindow() {
		setSize(500,300);
		setTitle("Community Study V.1.0");
		setLayout(null);
		setVisible(false);
	}
	
}
