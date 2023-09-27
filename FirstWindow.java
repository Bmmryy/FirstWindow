
package jendela;

import javax.swing.JFrame;

public class FirstWindow extends JFrame {
    public static void main(String[] args) {
        
        JFrame myWindow = new JFrame();
        myWindow.setTitle("Coba Coba");
        
        // tentukan ukuran jendela
        myWindow.setSize(400, 400);
        
        // tampilkan jendela ke layar
        myWindow.setVisible(true);
    }
}
