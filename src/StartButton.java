import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton implements ActionListener{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource());
	}
}
