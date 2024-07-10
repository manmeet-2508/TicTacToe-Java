import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.*;

public class TicTacToe {

    JButton b1 = new JButton(), b2 = new JButton(), b3 = new JButton(), b4 = new JButton(), b5 = new JButton(),
            b6 = new JButton(), b7 = new JButton(), b8 = new JButton(), b9 = new JButton();
    JTextField textfield = new JTextField("");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    Font font = new Font(null, Font.BOLD, 50);
    boolean player1;
    String x = "X";
    String y = "O";
    JButton reset = new JButton("RESET");

}

class manmeettictactoe extends TicTacToe implements ActionListener {

    manmeettictactoe() {
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 430);
        frame.setLayout(null);
        
        textfield.setBounds(0, 0, 380, 51);
        textfield.setBackground(Color.GRAY);
        textfield.setForeground(Color.RED);
        textfield.setFont(font);
        textfield.setText("TIC TAC TOE");
        frame.add(textfield);

        p1.setLayout(new GridLayout(3, 3));
        p1.setBounds(2, 50, 375, 310);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        frame.add(p1);

        p2.setLayout(new FlowLayout());
        p2.setBounds(90, 360, 200, 150);
        reset.setBackground(Color.DARK_GRAY);
        reset.setForeground(Color.RED);
        p2.add(reset);
        frame.add(p2);
        frame.setVisible(true);


        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        b9.setFocusable(false);

        reset.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        turn();

    }

    void checkwinner() {
        // first row
        String checker = b1.getText() + b2.getText() + b3.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b1.setBackground(Color.BLUE);
            b2.setBackground(Color.BLUE);
            b3.setBackground(Color.BLUE);

        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b1.setBackground(Color.RED);
            b2.setBackground(Color.RED);
            b3.setBackground(Color.RED);
        }
        // second row
        checker = b4.getText() + b5.getText() + b6.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b4.setBackground(Color.BLUE);
            b5.setBackground(Color.BLUE);
            b6.setBackground(Color.BLUE);
        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b4.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b6.setBackground(Color.RED);
        }
        // third row
        checker = b7.getText() + b8.getText() + b9.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b7.setBackground(Color.BLUE);
            b8.setBackground(Color.BLUE);
            b9.setBackground(Color.BLUE);
        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b7.setBackground(Color.RED);
            b8.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        // left to right
        checker = b1.getText() + b5.getText() + b9.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b1.setBackground(Color.BLUE);
            b5.setBackground(Color.BLUE);
            b9.setBackground(Color.BLUE);
        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b1.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        // right to left
        checker = b3.getText() + b5.getText() + b7.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b3.setBackground(Color.BLUE);
            b5.setBackground(Color.BLUE);
            b7.setBackground(Color.BLUE);
        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b3.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        }
        // middle column
        checker = b2.getText() + b5.getText() + b8.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b2.setBackground(Color.BLUE);
            b5.setBackground(Color.BLUE);
            b8.setBackground(Color.BLUE);
        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b2.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b8.setBackground(Color.RED);
        }
        // last column
        checker = b3.getText() + b6.getText() + b9.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b3.setBackground(Color.BLUE);
            b6.setBackground(Color.BLUE);
            b9.setBackground(Color.BLUE);
        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b3.setBackground(Color.RED);
            b6.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        // first column
        checker = b1.getText() + b4.getText() + b7.getText();
        if (checker.contains("XXX")) {
            textfield.setText("X is the Winner");
            b1.setBackground(Color.BLUE);
            b4.setBackground(Color.BLUE);
            b7.setBackground(Color.BLUE);
        } else if (checker.contains("OOO")) {
            textfield.setText("O is the Winner");
            b1.setBackground(Color.RED);
            b4.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        }

    }

    void turn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            player1 = true;
            textfield.setText("X's Turn");

        } else {
            player1 = false;
            textfield.setText("O's Turn");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            b1.setFont(font);
            if (player1) {
                b1.setForeground(Color.RED);
                b1.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b1.setForeground(Color.BLUE);
                b1.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b2) {
            b2.setFont(font);
            if (player1) {
                b2.setForeground(Color.RED);
                b2.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b2.setForeground(Color.BLUE);
                b2.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b3) {
            b3.setFont(font);
            if (player1) {
                b3.setForeground(Color.RED);
                b3.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b3.setForeground(Color.BLUE);
                b3.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b4) {
            b4.setFont(font);
            if (player1) {
                b4.setForeground(Color.RED);
                b4.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b4.setForeground(Color.BLUE);
                b4.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b5) {
            b5.setFont(font);
            if (player1 == true) {
                b5.setForeground(Color.RED);
                b5.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b5.setForeground(Color.BLUE);
                b5.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b6) {
            b6.setFont(font);
            if (player1 == true) {
                b6.setForeground(Color.RED);
                b6.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b6.setForeground(Color.BLUE);
                b6.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b7) {
            b7.setFont(font);
            if (player1 == true) {
                b7.setForeground(Color.RED);
                b7.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b7.setForeground(Color.blue);
                b7.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b8) {
            b8.setFont(font);
            if (player1 == true) {
                b8.setForeground(Color.RED);
                b8.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b8.setForeground(Color.blue);
                b8.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == b9) {
            b9.setFont(font);
            if (player1 == true) {
                b9.setForeground(Color.RED);
                b9.setText(x);
                player1 = false;
                textfield.setText("O's Turn");
            } else {
                b9.setForeground(Color.blue);
                b9.setText(y);
                player1 = true;
                textfield.setText("X's Turn");
            }
            checkwinner();
        }
        if (e.getSource() == reset) {
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setBackground(null);
            b2.setBackground(null);
            b3.setBackground(null);
            b4.setBackground(null);
            b5.setBackground(null);
            b6.setBackground(null);
            b7.setBackground(null);
            b8.setBackground(null);
            b9.setBackground(null);

            turn();
        }
    }

    public static void main(String[] args) {
        manmeettictactoe mm = new manmeettictactoe();
    }

}
