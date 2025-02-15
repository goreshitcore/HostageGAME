import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
    ImageIcon DingyRoom, TitleScreenImage;    

    // Handlers
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    SubmitNameHandler snHandler = new SubmitNameHandler();

    public static void main(String[] args) {
        new GameFrame();
    }


//Random Java.UTIL


    public getInt generateRandom; {

        Random rand = new Random();
        int rand_int1 = rand.nextInt(3);
        System.out.println("Random : " + rand_int1);
        
        
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
        TitleScreenImage = new ImageIcon("C:\\Users\\GGPC\\Desktop\\JavaCodePersonal\\images for game\\Hostage.png");
       

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
        choiceButtonPanel.setLayout(new GridLayout(2, 1));
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


        
        scene11(); // Start game
        con.revalidate();
        con.repaint();
    }

    public void scene11() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene11";
        mainTextArea.setText("You wake up, wincing at the pain of your body being bruised. ");
        choice1.setText(">");
        choice2.setText(">");
    }
    
    public void scene12() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene12";
        mainTextArea.setText("Kidnapper enters room");
        choice1.setText("Let me go please!");
        choice2.setText("Soooo how's your day been?");
       
    }
    
    public void scene13() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene13";
        mainTextArea.setText("The kidnapper frees you from the chains.");
        choice1.setText("You run for the door. Dreaming of escape");
        choice2.setText("You thank the kidnapper.");
       
    }

    public void scene14() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene14";
        mainTextArea.setText("Kidnapper grabs you and forces you back in chains. Then  he leaves the room");

       
    }

    public void scene15() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene15";
        mainTextArea.setText("He enters the room once again, offering oyu a glass of water.");
        choice1.setText("You drink the water");
        choice2.setText("You don't touch the water. Afraid it's been drugged");
       
    }
  
    public void scene16() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene16";
        mainTextArea.setText("He leaves the room, a few hours pass by and he emerges back in the room. With a sandwich and water.");
        choice1.setText("You eat the food. Expressing gratitude, but you tell him that you want some fresh air.");
        choice2.setText("You don't touch the food or water");
       
    }

    public void scene17() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene17";
        mainTextArea.setText("He agrees to let you roam around the house, but only inside. Once you are out you notice all the doors/windows are locked.");
        choice1.setText("You run to the front door, screaming for help.");
        choice2.setText("You look around the house timidly.");
       
    }

    public void scene18() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene18";
        mainTextArea.setText("The kidnapper smacks you in the face and starts beating you up");
        choice1.setText("You beg him to let you go, sobbing.");
        choice2.setText("You stay silent, and still try to be nice to him");
       
    }

    public void scene19() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene19";
        mainTextArea.setText("The kidnapper starts trusting you");

    }


    public void scene20() {
        backgroundLabel.setIcon(DingyRoom);

        position = "scene20";
        mainTextArea.setText("He knocks you out");
        choice1.setText(">");
        choice2.setText(">");
        
       
    }


    public void ED31() {
        backgroundLabel.setIcon(DingyRoom);
        position = "ED31";
        mainTextArea.setText("Cop shoot out. Kidnapper shoots you. You're dead");
        choice1.setText(">");
        choice2.setText(">");
        
       
    }

    public void ED32() {
        backgroundLabel.setIcon(DingyRoom);

        position = "ED31";
        mainTextArea.setText("He knocks you out");
        choice1.setText(">");
        choice2.setText(">");
        
       
    }

    public void ED33() {
        backgroundLabel.setIcon(DingyRoom);

        position = "ED31";
        mainTextArea.setText("He knocks you out");
        choice1.setText(">");
        choice2.setText(">");
        
       
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
                case "scene11":
                if (yourChoice.equals("c1")) {
                    scene12();
                } else if(yourChoice.equals("c2"))
                    scene12();
                    break;

                case "scene12":
                    if (yourChoice.equals("c1")) {
                        scene20();
                    } else if (yourChoice.equals("c2")) {
                        scene19();
                    } 
                    break;
                    /* case "scene20" :
                    if (yourChoice.equals("c1")) {
                        //knocks out mikey's part
                    }
                     * 
                     * 
                     * if (rand_int1 == 2) {
                     * } ED31();
                     * 
                     */
               
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
