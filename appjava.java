import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class appjava extends Applet implements ActionListener
{
public TextField t1=new TextField(20);
public TextField t2=new TextField(20);

public void init()
{
add(new Label("User Name"));
add(t1);
add(new Label("Message"));
add(t2);
Button b1=new Button("Call Servlet");
add(b1);
b1.addActionListener(this);
}//init

public void actionPerformed(ActionEvent ae)
{
try
{
getAppletContext().showDocument(new
URL("http://localhost:8080/vij/appdemo?usr="+t1.getText()+"&msg="+t2.getText()));
}

catch(Exception e)
{
e.printStackTrace();
}

}//actionPerformed
}//appjava
