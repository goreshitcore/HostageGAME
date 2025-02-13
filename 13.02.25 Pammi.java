import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GameFrame {

    JFrame frame;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, nameInputPanel;
    JLabel titleNameLabel, backgroundLabel, nameLabel;
    JButton startButton, choice1, choice2, choice3, choice4, submitNameButton;
    JTextArea mainTextArea;
    JTextField nameInputField;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 15);
    String position, playerName;

    // Background images
    ImageIcon DingyRoom;    

    // Handlers
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    SubmitNameHandler snHandler = new SubmitNameHandler();

    public static void main(String[] args) {
        new GameFrame();
    }

    public GameFrame() {
        // Frame setup
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        con = frame.getContentPane();

        // Load images
        DingyRoom = new ImageIcon("C:\\Users\\GGPC\\Desktop\\JavaCodePersonal\\images for game\\DingyRoom.png");
       

        // Background label
        backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, 800, 600);

        // Title screen setup
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Game Title");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(tsHandler);
        startButtonPanel.add(startButton);

      
        con.add(backgroundLabel);
        con.add(titleNamePanel);
        con.add(startButtonPanel) ;
        frame.setVisible(true);
    }



    public void createNameInputScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        nameInputPanel = new JPanel();
        nameInputPanel.setBounds(100, 200, 600, 150);
        nameInputPanel.setBackground(Color.black);
        nameInputPanel.setLayout(new GridLayout(2, 1));

        nameLabel = new JLabel("Enter your name:");
        nameLabel.setForeground(Color.white);
        nameLabel.setFont(normalFont);
        nameInputPanel.add(nameLabel);

        nameInputField = new JTextField();
        nameInputField.setFont(normalFont);
        nameInputPanel.add(nameInputField);

        submitNameButton = new JButton("Submit");
        submitNameButton.setBackground(Color.black);
        submitNameButton.setForeground(Color.white);
        submitNameButton.setFont(normalFont);
        submitNameButton.setFocusPainted(false);
        submitNameButton.addActionListener(snHandler);

        nameInputPanel.add(submitNameButton);

        con.add(nameInputPanel);
        frame.revalidate();
        frame.repaint();
    }

    
    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        backgroundLabel.setIcon(DingyRoom); // Set initial background


        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);


        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        
        scene1(); // Start game
        con.revalidate();
        con.repaint();
    }

    public void scene1() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene1";
        mainTextArea.setText("You find yourself in a dingy room. Blood drips from your forehead. You stand up and look around the room.");
        choice1.setText("You try to open the door");
        choice2.setText("Peek your head through the bars");
        choice3.setText("Try to remember the events");
        choice4.setText("Observe your body for marks");
    }

    public void door() {
        position = "door";
        mainTextArea.setText("The door is locked.");
        choice1.setText(">");
        choice2.setText("null");
        choice3.setText("null");
        choice4.setText("null");

        
    }

    public void bars() {
        position = "bars";
        mainTextArea.setText("Fortunately you were left unchained and free to roam around the room, you spot the window high up but unfortunately you were too short to reach.");
        choice1.setText(">");
        choice2.setText("null");
        choice3.setText("null");
        choice4.setText("null");

    }


    public void  silence() {
        position = "silence";
        mainTextArea.setText("You sit there in silence, trying to remember the events of yesterday.");
        choice1.setText("null");
        choice2.setText("null");
        choice3.setText("null");
        choice4.setText("null");


    }

    public void  observe() {
        position = "observe";
        mainTextArea.setText("You look down at yourself, trying to recollect the events,\n looking for any marks left on you that could give you a hint as to what happened and where you are.");
        choice1.setText(">");
        choice2.setText("null");
        choice3.setText("null");
        choice4.setText("null");


    }


    public void scene2() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene2";
        mainTextArea.setText("");
        choice1.setText(">");
        choice2.setText(">");
        choice3.setText(">");
        choice4.setText(">");
    }

    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createNameInputScreen();
        }
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();

            switch (position) {
                case "scene1":
                    if (yourChoice.equals("c1")) {
                        door();
                    } else if (yourChoice.equals("c2")) {
                        bars();
                    } else if (yourChoice.equals("c3")) {
                        silence();
                    } else if (yourChoice.equals("c4")) {
                        observe();
                    }
                    break;
                case "door":
                    // Add other scene transitions here
                    break;
                case "bars":
                    // Add other scene transitions here
                    break;
                case "silence" :
                //scene
                    break;
                case "observe" :
                //scene
                    break;
            }
        }
    }


    public class SubmitNameHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            playerName = nameInputField.getText().trim();
            if ( playerName.isEmpty()) {
                playerName = "Player";

            }
            JOptionPane.showMessageDialog(frame, "Welcome, " + playerName + "!", "Hello", JOptionPane.INFORMATION_MESSAGE);
            nameInputPanel.setVisible(false);
            con.remove(nameInputPanel);
            createGameScreen();
            
        }
    }
}
