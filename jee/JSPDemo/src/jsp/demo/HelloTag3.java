package jsp.demo;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class HelloTag3 extends SimpleTagSupport {
	private String message;
	public void setMessage(String message) {
		this.message = message;
	}
	StringWriter sw = new StringWriter();
	public void doTag() throws JspException, IOException {
		if (message != null) {
			// Get message from property
			JspWriter out = getJspContext().getOut();
			out.println(message);
		} else {
			// Get message from body
		    getJspBody().invoke(sw);
		    getJspContext().getOut().println(sw.toString());
		}
	}
}