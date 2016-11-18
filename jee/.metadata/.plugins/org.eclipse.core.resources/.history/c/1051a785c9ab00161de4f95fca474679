import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet {
	private static final long serialVersionUID = 1L;
	int width = 480; // Init default width
	int height = 320; // Init default height
	int squareSize = 50; // Init default size
	
	public void init () {
		String widthParam = getParameter ("width");
		String heightParam = getParameter ("height");
		String squareSizeParam = getParameter ("squareSize");
		String colorParam = getParameter ("color");
		width = parseSize (widthParam, width);
		height = parseSize (heightParam, height);
		squareSize = parseSize (squareSizeParam, squareSize);
		Color fg = parseColor (colorParam);
		setBackground (Color.black);
		setForeground (fg);
	}
	
	private int parseSize (String param, int def) {
		int parsed = def;
		try {
			parsed = Integer.parseInt (param);
		} catch (Exception e) {
			// Do nothing
		}
		return parsed;
	}
	
	private Color parseColor (String param) {
		if (param == null) return Color.white;
		switch (param.toLowerCase()) {
			case "black":      return Color.black;
			case "blue":       return Color.blue;
			case "cyan":       return Color.cyan;
			case "dark_gray":  return Color.DARK_GRAY;
			case "darkgray":   return Color.darkGray;
			case "gray":       return Color.gray;
			case "green":      return Color.green;
			case "light_gray": return Color.LIGHT_GRAY;
			case "lightgray":  return Color.lightGray;
			case "magenta":    return Color.magenta;
			case "orange":     return Color.orange;
			case "pink":       return Color.pink;
			case "red":        return Color.red;
			case "yellow":     return Color.yellow;
			default:           return Color.white;
		}
	}
	
	public void paint (Graphics g) {
		for(int x = 0; x < width; x += squareSize)
			for (int y = 0; y < height; y += squareSize)
				g.drawRect(x, y, squareSize, squareSize);
	}
}