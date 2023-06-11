package app;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import app.Changes;


public aspect ColorCAspect {
    pointcut colorChangePointcut(JPanel panel, Color newColor, JLabel lb):
        call(void app.Changes.changeBg(JPanel, Color, JLabel)) && args(panel, newColor, lb);

    before(JPanel panel, Color newColor, JLabel lb): colorChangePointcut(panel, newColor, lb) {
        Changes.setPreviousColor(panel.getBackground());
    }
    
    after(JPanel panel, Color newColor, JLabel lb): colorChangePointcut(panel, newColor, lb) {
        lb.setText("El color anterior era: "+ Changes.getColorV(Changes.getPreviousColor()));
    	String sColor =Changes.getColorV(newColor);
        System.out.println("El color ha sido cambiado a: " + sColor);
        String msg = "El color ha sido cambiado a: " + sColor + " a las ";
        escribirLog("colorLogger.txt",msg);
    }
    
    
    
    private static void escribirLog(String fileName, String text) {
        File file = new File(fileName);
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        String time = sdf.format(Calendar.getInstance().getTime());

        try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) {
            text = text + String.format("\tFecha: [%s]",sdf.format(Calendar.getInstance().getTime()));
            out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
