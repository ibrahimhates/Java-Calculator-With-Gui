package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.*;

public class Calculator extends JFrame {

    ArrayList<JButton> oprbtns;
    ArrayList<JButton> btns;
    JButton equalsBtn, delBtn, clearBtn, pointBtn;
    JTextField input;

    public Calculator() {
        super("Calculator");
        setLayout(null);

        btns = new ArrayList<>();
        oprbtns = new ArrayList<>();
        equalsBtn = new JButton();
        delBtn = new JButton();
        clearBtn = new JButton();
        pointBtn = new JButton();
        input = new JTextField();

        NumButtons();
        OpButtons();
        EqualsButton();
        DelButton();
        ClearAllButton();
        PointButton();
        InputArea();

        for (int i = 0; i < 10; i++) {
            add(btns.get(i));
        }
        for (int i = 0; i < 4; i++) {
            add(oprbtns.get(i));
        }
        add(equalsBtn);
        add(delBtn);
        add(clearBtn);
        add(pointBtn);
        add(input);
        setSize(415, 635);
        setVisible(true);
    }

    public void NumButtons() {
        for (int i = 0; i < 10; i++) {
            JButton b = new JButton(i + "");
            b.setSize(100, 100);
            b.setFont(new Font("Arial", Font.TYPE1_FONT, 36));
            b.setBackground(Color.GRAY);
            btns.add(b);
        }
        btns.get(0).setLocation(new Point(100, 500));
        btns.get(1).setLocation(new Point(0, 400));
        btns.get(2).setLocation(new Point(100, 400));
        btns.get(3).setLocation(new Point(200, 400));
        btns.get(4).setLocation(new Point(0, 300));
        btns.get(5).setLocation(new Point(100, 300));
        btns.get(6).setLocation(new Point(200, 300));
        btns.get(7).setLocation(new Point(0, 200));
        btns.get(8).setLocation(new Point(100, 200));
        btns.get(9).setLocation(new Point(200, 200));
    }

    public void OpButtons() {
        for (int i = 0; i < 4; i++) {
            JButton op = new JButton();
            oprbtns.add(op);
        }
        ForOpButtons("/", 0, 300, 200);
        ForOpButtons("*", 1, 300, 300);
        ForOpButtons("-", 2, 300, 400);
        ForOpButtons("+", 3, 300, 500);

    }

    public void ForOpButtons(String text, int index, int x, int y) {
        oprbtns.get(index).setText(text);
        oprbtns.get(index).setSize(100, 100);
        oprbtns.get(index).setFont(new Font("Arial", Font.TYPE1_FONT, 36));
        oprbtns.get(index).setBackground(Color.LIGHT_GRAY);
        oprbtns.get(index).setLocation(new Point(x, y));
    }

    public void EqualsButton() {
        equalsBtn.setText("=");
        equalsBtn.setSize(100, 100);
        equalsBtn.setFont(new Font("Arial", Font.TYPE1_FONT, 36));
        equalsBtn.setBackground(Color.ORANGE);
        equalsBtn.setLocation(new Point(200, 500));
    }

    public void DelButton() {
        delBtn.setText("DEL");
        delBtn.setSize(200, 80);
        delBtn.setFont(new Font("Arial", Font.TYPE1_FONT, 36));
        delBtn.setBackground(Color.magenta);
        delBtn.setLocation(new Point(200, 120));
    }

    public void ClearAllButton() {
        clearBtn.setText("C");
        clearBtn.setSize(200, 80);
        clearBtn.setFont(new Font("Arial", Font.TYPE1_FONT, 36));
        clearBtn.setBackground(Color.CYAN);
        clearBtn.setLocation(new Point(0, 120));
    }

    public void PointButton() {
        pointBtn.setText(".");
        pointBtn.setSize(100, 100);
        pointBtn.setFont(new Font("Arial", Font.TYPE1_FONT, 36));
        pointBtn.setBackground(Color.GRAY);
        pointBtn.setLocation(new Point(0, 500));
    }

    public void InputArea() {
        input.setSize(400, 120);
        input.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
        input.setBackground(Color.RED);
        input.setHorizontalAlignment(4);
        input.setLocation(new Point(0, 0));
        input.setEnabled(false);
    }

}
