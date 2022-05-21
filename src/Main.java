import view.ChessGameFrame;

import javax.swing.*;

public class Main {
    static JFrame fatherFrame;
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            ChessGameFrame mainFrame = new ChessGameFrame(800, 608);
            mainFrame.setVisible(true);
        });
    }
    public void fuck(){
        for(int i=0;i<8;i++){
            System.out.println("hqj是大笨蛋");
        }
    }
    public void love(){
        boolean loveYou = false;
        while (loveYou==false){
            System.out.println("java java I love you!");
        }
    }
}

