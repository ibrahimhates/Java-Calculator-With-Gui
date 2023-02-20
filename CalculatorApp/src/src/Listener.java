package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener {

    private Calculator hsp;
    private String inputString;
    private double firstNum;
    private int opr;//+ - / * 

    public Listener(Calculator hsp) {
        this.hsp = hsp;
        inputString = "";
    }

    public void start() {
        AllListener();
    }

    private void AllListener() {
        hsp.btns.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    hsp.input.setText(inputString);
                } else {
                    inputString += "0";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "1";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "1";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "2";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "2";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "3";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "3";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(4).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "4";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "4";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "5";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "5";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(6).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "6";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "6";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(7).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "7";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "7";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(8).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "8";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "8";
                    hsp.input.setText(inputString);
                }
            }
        });
        hsp.btns.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hsp.input.getText().equals("Infinity")){
                    inputString = "";
                    hsp.input.setText("");
                }
                if (inputString.equals("0")) {
                    inputString = "9";
                    hsp.input.setText(inputString);
                } else {
                    inputString += "9";
                    hsp.input.setText(inputString);
                }
            }
        });
        // point button "."
        hsp.pointBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //not working yet
            }
        });
        // => "/"
        hsp.oprbtns.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputString != "") {
                    firstNum = Double.parseDouble(inputString);
                    opr = 1;
                    inputString = "";
                    hsp.input.setText(inputString);
                }
            }
        });
        // => "*"
        hsp.oprbtns.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputString != "") {
                    firstNum = Double.parseDouble(inputString);
                    opr = 2;
                    inputString = "";
                    hsp.input.setText(inputString);
                }
            }
        });
        // => "-"
        hsp.oprbtns.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputString != "") {
                    firstNum = Double.parseDouble(inputString);
                    opr = 3;
                    inputString = "";
                    hsp.input.setText(inputString);
                }
            }
        });
        // => "+"
        hsp.oprbtns.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputString != "") {
                    firstNum = Double.parseDouble(inputString);
                    opr = 4;
                    inputString = "";
                    hsp.input.setText(inputString);
                }
            }
        });
        // => "="
        hsp.equalsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputString != "") {
                    inputString = calculate() + "";
                    hsp.input.setText(inputString);
                }
            }
        });
        // clear all
        hsp.clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputString = "";
                hsp.input.setText(inputString);
                firstNum = 0;
                opr = 0;
            }
        });
        // delete
        hsp.delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inputString.equals("")) {
                    double d = Double.parseDouble(inputString);
                    long temp = (long)d;
                    temp = temp / 10;
                    inputString = temp + "";
                    hsp.input.setText(inputString);
                }
            }
        });
    }

    private double calculate() {
        double sonuc = 0;
        switch (opr) {
            case 1:
                if (firstNum != 0 && hsp.input.getText() != "") {
                    sonuc = firstNum / Double.parseDouble(hsp.input.getText());
                }
                break;
            case 2:
                if (firstNum != 0 && hsp.input.getText() != "") {
                    sonuc = firstNum * Double.parseDouble(hsp.input.getText());
                }
                break;
            case 3:
                if (firstNum != 0 && hsp.input.getText() != "") {
                    sonuc = firstNum - Double.parseDouble(hsp.input.getText());
                }
                break;
            case 4:
                if (firstNum != 0 && hsp.input.getText() != "") {
                    sonuc = firstNum + Double.parseDouble(hsp.input.getText());
                }
                break;
            default:
                sonuc = Double.parseDouble(hsp.input.getText());
        }
        return sonuc;
    }

}
