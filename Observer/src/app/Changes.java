package app;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Changes {
    private static Color previousColor = Color.WHITE;

	public static void changeBg(JPanel pane, Color c, JLabel lb) {
		pane.setBackground(c);
    }
	public static Color getPreviousColor() {
        return previousColor;
    }
	public static String getColorV(Color c) {
		if (c.equals(Color.BLUE)){
			return "AZUL";
		}else if (c.equals(Color.GREEN)){
			return "VERDE";
		}else {
			return "ROJO";
		}
	}
	public static void setPreviousColor(Color c) {
		previousColor = c;
	}

}
