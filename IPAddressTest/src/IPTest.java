import java.net.*; 
import java.io.*; 
import java.util.*;
import javax.swing.*;


public class IPTest {

	public static void main(String[] args) throws Exception{
		System.out.println("System IP Address: " + getLocalIP());
		System.out.print("Public IP Address: " + getPublicIP());
		input();
		
	}
	public static String getLocalIP() throws UnknownHostException {
		InetAddress localHost = InetAddress.getLocalHost();
		String host = localHost.getHostAddress().trim();
		return host;
		
	}
	public static String getPublicIP() {
		String systemIpAddress = "";
		try {
			URL urlName = new URL("http://bot.whatismyipaddress.com");
			BufferedReader sc = new BufferedReader(new InputStreamReader(urlName.openStream()));
			systemIpAddress = sc.readLine().trim();
		}
		catch(Exception e){
			systemIpAddress = "Cannot Execute properly";
		}
		return systemIpAddress;
		
	}
	public static JFrame input() {
		JFrame frame = new JFrame("IP Enter");
		JButton button = new JButton("Join");
		JTextField text = new JTextField(16);
		String var = text.getText();
		JPanel panel = new JPanel();
		JLabel thing = new JLabel("Enter IP Address Here: \n");
		panel.add(thing);
		panel.add(text);
		panel.add(button);
		frame.add(panel);
		frame.setSize(300, 100);
		frame.setVisible(true);
		System.out.print(var);
		return frame;
	}
}
