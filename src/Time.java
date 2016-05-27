import java.net.URL;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Time extends JFrame{
	JLabel prolabel,timelabel;
	int counter;
	JTextField tf;
	JButton button;
	Timer timer;
	
	public Time()
	{
		setLayout(new GridLayout(2,2,5,5));
	
		
		prolabel =new JLabel("Enter",SwingConstants.CENTER);
		
		add(prolabel);
		tf =new JTextField(5);
		add(tf);
		button=new JButton("start");
		add(button);
		
		timelabel = new JLabel("wait..",SwingConstants.CENTER);
		add(timelabel);
		
		event e=new event();
		button.addActionListener(e);
	}

	public class event implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int count = (int)(Double.parseDouble(tf.getText()));
			timelabel.setText("time left:"+count);
		 	
			TimeClass tc = new TimeClass(count);
			timer = new Timer(1000, tc);
			timer.start();
		}
	}
	
	public class TimeClass implements ActionListener{
		int counter;
		public TimeClass(int counter)
		{
			this.counter = counter;
		}
		public void actionPerformed(ActionEvent tc)
		{
			counter--;
			if(counter >=1)
			{
				timelabel.setText("time left:"+counter);
			}
		   else{
			timer.stop();
			timelabel.setText("Done");
			Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
	public static void main(String args[])
	{
		Time gui = new Time();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.pack();
		gui.setTitle("timer");
		gui.setVisible(true);
	}
}
