package surabhsukla;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="myapplet" width="400" height="220"> </applet> */
public class myApplet extends Applet {
/*public void paint(Graphics g)
{
	g.drawString("MY NAME IS SANTOSH",100,100);
}

}*/
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	
	public void init() {
		l1=new Label("First name");
		l2=new Label("Second nmae");
		l3=new Label("");
		t1=new TextField();
		t2=new TextField();
		b1=new Button("ADD");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(100,150,80,20);
		l3.setBounds(30,180,100,20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		
	}
	}
	
