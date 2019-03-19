import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/*
 * Created by JFormDesigner on Mon May 28 12:39:02 EET 2018
 */



/**
 * @author Talha
 */
public class Calculator extends JPanel
{

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Talha
    private JTextField display;
    private JPanel panel1;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton clear;
    private JButton zero;
    private JButton equals;
    private JPanel panel2;
    private JButton plus;
    private JButton minus;
    private JButton times;
    private JButton division;
    private JTextField ongoingOperation;
    private JPanel panel3;
    private JButton root;
    private JButton square;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private int result;
    private char operation;
    private Image background;

    public Calculator()
    {
        initComponents();
        result = 0;
        operation = '0';
        attachListeners();

        background = Toolkit.getDefaultToolkit().createImage( "background.png");
    }

    @Override
    public void paintComponent( Graphics g)
    {
        g.drawImage( background, 0, 0, null);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Talha
        display = new JTextField();
        panel1 = new JPanel();
        one = new JButton();
        two = new JButton();
        three = new JButton();
        four = new JButton();
        five = new JButton();
        six = new JButton();
        seven = new JButton();
        eight = new JButton();
        nine = new JButton();
        clear = new JButton();
        zero = new JButton();
        equals = new JButton();
        panel2 = new JPanel();
        plus = new JButton();
        minus = new JButton();
        times = new JButton();
        division = new JButton();
        ongoingOperation = new JTextField();
        panel3 = new JPanel();
        root = new JButton();
        square = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- display ----
        display.setText("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Serif", Font.PLAIN, 20));
        display.setEditable(false);

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(4, 3, 5, 5));

            //---- one ----
            one.setText("1");
            panel1.add(one);

            //---- two ----
            two.setText("2");
            panel1.add(two);

            //---- three ----
            three.setText("3");
            panel1.add(three);

            //---- four ----
            four.setText("4");
            panel1.add(four);

            //---- five ----
            five.setText("5");
            panel1.add(five);

            //---- six ----
            six.setText("6");
            panel1.add(six);

            //---- seven ----
            seven.setText("7");
            panel1.add(seven);

            //---- eight ----
            eight.setText("8");
            panel1.add(eight);

            //---- nine ----
            nine.setText("9");
            panel1.add(nine);

            //---- clear ----
            clear.setText("C");
            panel1.add(clear);

            //---- zero ----
            zero.setText("0");
            panel1.add(zero);

            //---- equals ----
            equals.setText("=");
            panel1.add(equals);
        }

        //======== panel2 ========
        {
            panel2.setLayout(new FlowLayout());

            //---- plus ----
            plus.setText("+");
            plus.setPreferredSize(new Dimension(60, 30));
            panel2.add(plus);

            //---- minus ----
            minus.setText("-");
            minus.setPreferredSize(new Dimension(60, 30));
            panel2.add(minus);

            //---- times ----
            times.setText("X");
            times.setPreferredSize(new Dimension(60, 30));
            panel2.add(times);

            //---- division ----
            division.setText("\u00f7");
            division.setPreferredSize(new Dimension(60, 30));
            panel2.add(division);
        }

        //---- ongoingOperation ----
        ongoingOperation.setEditable(false);
        ongoingOperation.setForeground(new Color(153, 153, 255));

        //======== panel3 ========
        {
            panel3.setLayout(new FlowLayout());

            //---- root ----
            root.setText("\u221a");
            root.setPreferredSize(new Dimension(78, 20));
            panel3.add(root);

            //---- square ----
            square.setText("x\u00b2");
            square.setPreferredSize(new Dimension(78, 20));
            panel3.add(square);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(display, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(ongoingOperation, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(panel2, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(panel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)))
                    .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ongoingOperation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(display, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void attachListeners()
    {
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "1");
                }
                else
                {
                    display.setText( display.getText() + "1");
                }
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "2");
                }
                else
                {
                    display.setText( display.getText() + "2");
                }
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "3");
                }
                else
                {
                    display.setText( display.getText() + "3");
                }
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "4");
                }
                else
                {
                    display.setText( display.getText() + "4");
                }
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "5");
                }
                else
                {
                    display.setText( display.getText() + "5");
                }
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "6");
                }
                else
                {
                    display.setText( display.getText() + "6");
                }
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "7");
                }
                else
                {
                    display.setText( display.getText() + "7");
                }
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "8");
                }
                else
                {
                    display.setText( display.getText() + "8");
                }
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( display.getText().equals( "0") )
                {
                    display.setText( "9");
                }
                else
                {
                    display.setText( display.getText() + "9");
                }
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText( display.getText() + "0");
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText( "0");
                result = 0;
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( operation == '0' )
                {
                    display.setText( display.getText() );
                }

                else if ( operation == '+' ) {
                    display.setText(Integer.toString(result + Integer.parseInt(display.getText())));
                }

                else if ( operation == '-' ) {
                    display.setText(Integer.toString(result - Integer.parseInt(display.getText())));
                }

                else if ( operation == '*' ) {
                    display.setText(Integer.toString(result * Integer.parseInt(display.getText())));
                }

                else {
                    display.setText(Integer.toString(result / Integer.parseInt(display.getText())));
                }

                ongoingOperation.setText( "");
                operation = '0';
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( operation == '0' ) {
                    result = Integer.parseInt( display.getText() );
                }
                else
                {
                    result += Integer.parseInt( display.getText() );
                }
                operation = '+';
                ongoingOperation.setText( ongoingOperation.getText() + " " + display.getText() + " + ");
                display.setText( "0");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( operation == '0' ) {
                    result = Integer.parseInt( display.getText() );
                }
                else
                {
                    result -= Integer.parseInt( display.getText() );
                }

                operation = '-';
                ongoingOperation.setText( ongoingOperation.getText() + " " + display.getText() + " - ");
                display.setText( "0");
            }
        });

        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( operation == '0' ) {
                    result = Integer.parseInt( display.getText() );
                }
                else
                {
                    result *= Integer.parseInt( display.getText() );
                }

                operation = '*';
                ongoingOperation.setText( ongoingOperation.getText() + " " + display.getText() + " X ");
                display.setText( "0");
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( operation == '0' ) {
                    result = Integer.parseInt( display.getText() );
                }
                else
                {
                    result /= Integer.parseInt( display.getText() );
                }

                operation = '/';
                ongoingOperation.setText( ongoingOperation.getText() + " " + display.getText() + " \u00f7 ");
                display.setText( "0");
            }
        });

        root.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText( Double.toString( Math.sqrt( Integer.parseInt( display.getText() ) ) ) );
            }
        });

        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText( Double.toString( Math.pow( Integer.parseInt( display.getText() ), 2 ) ) );
            }
        });
    }

    public static void main(String[] args) {
        JFrame calculator;
        calculator = new JFrame();

        calculator.add( new Calculator() );
        calculator.setTitle( "CALCULATOR");
        calculator.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        calculator.setLocationRelativeTo( null);
        calculator.pack();
        calculator.setVisible( true);
    }
}
