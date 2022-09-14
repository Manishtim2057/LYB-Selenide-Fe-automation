package LYB.FileUpload;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {

    public FileUpload(String filepath) throws AWTException{

        Robot robot = new Robot();


        StringSelection select = new StringSelection(filepath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

        robot.setAutoDelay(400);
        // paste the string
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}