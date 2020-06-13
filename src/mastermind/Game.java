package mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    private static int chances = 0; //This instance determine the row of guess and it will disabled other rows when it set to a certain number
    private int assign = -1; //This instance represent colour to be send to the codemaker, by default it set to -1 which represent no colour
    private static int mode;
    private static int[] feed = new int[2];
    private static String name;
    private static boolean end = false;
    private int cnt = 0;
    Timer t;

    public Game() {
        initComponents();
    }

    public Game(int chances) {
        this.chances = chances; // Export chances value from other class
    }

    public void setMode(int mode) {
        Timer();
        this.mode = mode;
        switch (mode) {
            case 2:
                C2.setVisible(false);
                C3.setVisible(false);
                C4.setVisible(false);
                C5.setVisible(false);
                C6.setVisible(false);
                C7.setVisible(false);
                break;
            case 3:
                C3.setVisible(false);
                C4.setVisible(false);
                C5.setVisible(false);
                C6.setVisible(false);
                C7.setVisible(false);
                break;
            case 4:
                C4.setVisible(false);
                C5.setVisible(false);
                C6.setVisible(false);
                C7.setVisible(false);
                break;
            case 5:
                C5.setVisible(false);
                C6.setVisible(false);
                C7.setVisible(false);
                break;
            case 6:
                C6.setVisible(false);
                C7.setVisible(false);
                break;
            case 7:
                C7.setVisible(false);
                break;
            case 8:
                break;
        }
    } //To visible the apprioprate number of guess in a row for the user

    public void setFeed(int[] feed) {
        this.feed = feed;
    }//Receive value from result the give the player a feedback about the guess

    public void Timer() {
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TimeCounter.setText(String.valueOf(cnt));
                cnt++;
            }
        });
        t.start();
    }

    public void Surrender() {
        Codemaker get = new Codemaker();
        int[] code = get.getCode();
        end = true;
        try{
        switch (code[0]) {
            case 0:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }
        switch (code[1]) {
            case 0:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }
        switch (code[2]) {
            case 0:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }
        switch (code[3]) {
            case 0:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }
        switch (code[4]) {
            case 0:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }
        switch (code[5]) {
            case 0:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }
        switch (code[6]) {
            case 0:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }
        switch (code[7]) {
            case 0:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                break;
            case 1:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                break;
            case 2:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                break;
            case 3:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                break;
            case 4:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                break;
            case 5:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                break;
            case 6:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                break;
            case 7:
                Code8.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                break;
        }}
        catch(Exception ArrayOutOfBound){
            System.out.println("No problem");
        }
    }

    /**
     * 3
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Accept = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        REDassign = new javax.swing.JButton();
        GREENassign = new javax.swing.JButton();
        BLUEassign = new javax.swing.JButton();
        YELLOWassign = new javax.swing.JButton();
        ORANGEassign = new javax.swing.JButton();
        PINKassign = new javax.swing.JButton();
        PURPLEassign = new javax.swing.JButton();
        TEALassign = new javax.swing.JButton();
        C4 = new javax.swing.JPanel();
        R7C4 = new javax.swing.JButton();
        R6C4 = new javax.swing.JButton();
        R5C4 = new javax.swing.JButton();
        R4C4 = new javax.swing.JButton();
        R3C4 = new javax.swing.JButton();
        R2C4 = new javax.swing.JButton();
        R1C4 = new javax.swing.JButton();
        R0C4 = new javax.swing.JButton();
        C3 = new javax.swing.JPanel();
        R7C3 = new javax.swing.JButton();
        R6C3 = new javax.swing.JButton();
        R5C3 = new javax.swing.JButton();
        R4C3 = new javax.swing.JButton();
        R3C3 = new javax.swing.JButton();
        R2C3 = new javax.swing.JButton();
        R1C3 = new javax.swing.JButton();
        R0C3 = new javax.swing.JButton();
        C2 = new javax.swing.JPanel();
        R7C2 = new javax.swing.JButton();
        R6C2 = new javax.swing.JButton();
        R5C2 = new javax.swing.JButton();
        R4C2 = new javax.swing.JButton();
        R3C2 = new javax.swing.JButton();
        R2C2 = new javax.swing.JButton();
        R1C2 = new javax.swing.JButton();
        R0C2 = new javax.swing.JButton();
        C1 = new javax.swing.JPanel();
        R7C1 = new javax.swing.JButton();
        R6C1 = new javax.swing.JButton();
        R5C1 = new javax.swing.JButton();
        R4C1 = new javax.swing.JButton();
        R3C1 = new javax.swing.JButton();
        R2C1 = new javax.swing.JButton();
        R1C1 = new javax.swing.JButton();
        R0C1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        R7C0 = new javax.swing.JButton();
        R6C0 = new javax.swing.JButton();
        R5C0 = new javax.swing.JButton();
        R4C0 = new javax.swing.JButton();
        R3C0 = new javax.swing.JButton();
        R2C0 = new javax.swing.JButton();
        R1C0 = new javax.swing.JButton();
        R0C0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        C5 = new javax.swing.JPanel();
        R7C5 = new javax.swing.JButton();
        R6C5 = new javax.swing.JButton();
        R5C5 = new javax.swing.JButton();
        R4C5 = new javax.swing.JButton();
        R3C5 = new javax.swing.JButton();
        R2C5 = new javax.swing.JButton();
        R1C5 = new javax.swing.JButton();
        R0C5 = new javax.swing.JButton();
        C6 = new javax.swing.JPanel();
        R7C6 = new javax.swing.JButton();
        R6C6 = new javax.swing.JButton();
        R5C6 = new javax.swing.JButton();
        R4C6 = new javax.swing.JButton();
        R3C6 = new javax.swing.JButton();
        R2C6 = new javax.swing.JButton();
        R1C6 = new javax.swing.JButton();
        R0C6 = new javax.swing.JButton();
        C7 = new javax.swing.JPanel();
        R7C7 = new javax.swing.JButton();
        R6C7 = new javax.swing.JButton();
        R5C7 = new javax.swing.JButton();
        R4C7 = new javax.swing.JButton();
        R3C7 = new javax.swing.JButton();
        R2C7 = new javax.swing.JButton();
        R1C7 = new javax.swing.JButton();
        R0C7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        WHITE6 = new javax.swing.JLabel();
        BLACK6 = new javax.swing.JLabel();
        WHITE5 = new javax.swing.JLabel();
        WHITE2 = new javax.swing.JLabel();
        WHITE4 = new javax.swing.JLabel();
        WHITE3 = new javax.swing.JLabel();
        WHITE0 = new javax.swing.JLabel();
        BLACK3 = new javax.swing.JLabel();
        WHITE1 = new javax.swing.JLabel();
        BLACK7 = new javax.swing.JLabel();
        BLACK2 = new javax.swing.JLabel();
        BLACK0 = new javax.swing.JLabel();
        WHITE7 = new javax.swing.JLabel();
        BLACK1 = new javax.swing.JLabel();
        BLACK5 = new javax.swing.JLabel();
        BLACK4 = new javax.swing.JLabel();
        SurrenderButton = new javax.swing.JButton();
        Restart = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        TimeCounter = new javax.swing.JLabel();
        CodePanel = new javax.swing.JPanel();
        Code1 = new javax.swing.JButton();
        Code2 = new javax.swing.JButton();
        Code3 = new javax.swing.JButton();
        Code4 = new javax.swing.JButton();
        Code5 = new javax.swing.JButton();
        Code6 = new javax.swing.JButton();
        Code7 = new javax.swing.JButton();
        Code8 = new javax.swing.JButton();
        BLACK = new javax.swing.JLabel();
        WHITE = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mastermind");
        setBackground(new java.awt.Color(255, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setName("GameGUI"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        Accept.setText("Accept");
        Accept.setToolTipText("");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });
        getContentPane().add(Accept);
        Accept.setBounds(660, 600, 100, 23);

        jPanel1.setOpaque(false);

        REDassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/RED.png"))); // NOI18N
        REDassign.setBorder(null);
        REDassign.setBorderPainted(false);
        REDassign.setContentAreaFilled(false);
        REDassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        REDassign.setInheritsPopupMenu(true);
        REDassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDassignActionPerformed(evt);
            }
        });
        jPanel1.add(REDassign);

        GREENassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/GREEN.png"))); // NOI18N
        GREENassign.setBorder(null);
        GREENassign.setBorderPainted(false);
        GREENassign.setContentAreaFilled(false);
        GREENassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GREENassign.setInheritsPopupMenu(true);
        GREENassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GREENassignActionPerformed(evt);
            }
        });
        jPanel1.add(GREENassign);

        BLUEassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/BLUE.png"))); // NOI18N
        BLUEassign.setBorder(null);
        BLUEassign.setBorderPainted(false);
        BLUEassign.setContentAreaFilled(false);
        BLUEassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLUEassign.setInheritsPopupMenu(true);
        BLUEassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLUEassignActionPerformed(evt);
            }
        });
        jPanel1.add(BLUEassign);

        YELLOWassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/YELLOW.png"))); // NOI18N
        YELLOWassign.setBorder(null);
        YELLOWassign.setBorderPainted(false);
        YELLOWassign.setContentAreaFilled(false);
        YELLOWassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        YELLOWassign.setInheritsPopupMenu(true);
        YELLOWassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YELLOWassignActionPerformed(evt);
            }
        });
        jPanel1.add(YELLOWassign);

        ORANGEassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/ORANGE.png"))); // NOI18N
        ORANGEassign.setBorder(null);
        ORANGEassign.setBorderPainted(false);
        ORANGEassign.setContentAreaFilled(false);
        ORANGEassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ORANGEassign.setInheritsPopupMenu(true);
        ORANGEassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORANGEassignActionPerformed(evt);
            }
        });
        jPanel1.add(ORANGEassign);

        PINKassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/PINK.png"))); // NOI18N
        PINKassign.setBorder(null);
        PINKassign.setBorderPainted(false);
        PINKassign.setContentAreaFilled(false);
        PINKassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PINKassign.setInheritsPopupMenu(true);
        PINKassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PINKassignActionPerformed(evt);
            }
        });
        jPanel1.add(PINKassign);

        PURPLEassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/PURPLE.png"))); // NOI18N
        PURPLEassign.setBorder(null);
        PURPLEassign.setBorderPainted(false);
        PURPLEassign.setContentAreaFilled(false);
        PURPLEassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PURPLEassign.setInheritsPopupMenu(true);
        PURPLEassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PURPLEassignActionPerformed(evt);
            }
        });
        jPanel1.add(PURPLEassign);

        TEALassign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/TEAL.png"))); // NOI18N
        TEALassign.setBorder(null);
        TEALassign.setBorderPainted(false);
        TEALassign.setContentAreaFilled(false);
        TEALassign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TEALassign.setInheritsPopupMenu(true);
        TEALassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEALassignActionPerformed(evt);
            }
        });
        jPanel1.add(TEALassign);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(87, 587, 530, 70);

        C4.setMinimumSize(new java.awt.Dimension(450, 61));
        C4.setOpaque(false);

        R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C4.setBorder(null);
        R7C4.setBorderPainted(false);
        R7C4.setContentAreaFilled(false);
        R7C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C4.setInheritsPopupMenu(true);
        R7C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C4ActionPerformed(evt);
            }
        });
        C4.add(R7C4);

        R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C4.setBorder(null);
        R6C4.setBorderPainted(false);
        R6C4.setContentAreaFilled(false);
        R6C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C4.setInheritsPopupMenu(true);
        R6C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C4ActionPerformed(evt);
            }
        });
        C4.add(R6C4);

        R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C4.setBorder(null);
        R5C4.setBorderPainted(false);
        R5C4.setContentAreaFilled(false);
        R5C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C4.setInheritsPopupMenu(true);
        R5C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C4ActionPerformed(evt);
            }
        });
        C4.add(R5C4);

        R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C4.setBorder(null);
        R4C4.setBorderPainted(false);
        R4C4.setContentAreaFilled(false);
        R4C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C4.setInheritsPopupMenu(true);
        R4C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C4ActionPerformed(evt);
            }
        });
        C4.add(R4C4);

        R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C4.setBorder(null);
        R3C4.setBorderPainted(false);
        R3C4.setContentAreaFilled(false);
        R3C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C4.setInheritsPopupMenu(true);
        R3C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C4ActionPerformed(evt);
            }
        });
        C4.add(R3C4);

        R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C4.setBorder(null);
        R2C4.setBorderPainted(false);
        R2C4.setContentAreaFilled(false);
        R2C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C4.setInheritsPopupMenu(true);
        R2C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C4ActionPerformed(evt);
            }
        });
        C4.add(R2C4);

        R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C4.setBorder(null);
        R1C4.setBorderPainted(false);
        R1C4.setContentAreaFilled(false);
        R1C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C4.setInheritsPopupMenu(true);
        R1C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C4ActionPerformed(evt);
            }
        });
        C4.add(R1C4);

        R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C4.setBorder(null);
        R0C4.setBorderPainted(false);
        R0C4.setContentAreaFilled(false);
        R0C4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C4.setInheritsPopupMenu(true);
        R0C4.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C4.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C4.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C4ActionPerformed(evt);
            }
        });
        C4.add(R0C4);

        getContentPane().add(C4);
        C4.setBounds(337, 86, 63, 500);

        C3.setMinimumSize(new java.awt.Dimension(450, 61));
        C3.setOpaque(false);

        R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C3.setBorder(null);
        R7C3.setBorderPainted(false);
        R7C3.setContentAreaFilled(false);
        R7C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C3.setInheritsPopupMenu(true);
        R7C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C3ActionPerformed(evt);
            }
        });
        C3.add(R7C3);

        R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C3.setBorder(null);
        R6C3.setBorderPainted(false);
        R6C3.setContentAreaFilled(false);
        R6C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C3.setInheritsPopupMenu(true);
        R6C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C3ActionPerformed(evt);
            }
        });
        C3.add(R6C3);

        R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C3.setBorder(null);
        R5C3.setBorderPainted(false);
        R5C3.setContentAreaFilled(false);
        R5C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C3.setInheritsPopupMenu(true);
        R5C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C3ActionPerformed(evt);
            }
        });
        C3.add(R5C3);

        R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C3.setBorder(null);
        R4C3.setBorderPainted(false);
        R4C3.setContentAreaFilled(false);
        R4C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C3.setInheritsPopupMenu(true);
        R4C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C3ActionPerformed(evt);
            }
        });
        C3.add(R4C3);

        R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C3.setBorder(null);
        R3C3.setBorderPainted(false);
        R3C3.setContentAreaFilled(false);
        R3C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C3.setInheritsPopupMenu(true);
        R3C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C3ActionPerformed(evt);
            }
        });
        C3.add(R3C3);

        R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C3.setBorder(null);
        R2C3.setBorderPainted(false);
        R2C3.setContentAreaFilled(false);
        R2C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C3.setInheritsPopupMenu(true);
        R2C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C3ActionPerformed(evt);
            }
        });
        C3.add(R2C3);

        R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C3.setBorder(null);
        R1C3.setBorderPainted(false);
        R1C3.setContentAreaFilled(false);
        R1C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C3.setInheritsPopupMenu(true);
        R1C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C3ActionPerformed(evt);
            }
        });
        C3.add(R1C3);

        R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C3.setBorder(null);
        R0C3.setBorderPainted(false);
        R0C3.setContentAreaFilled(false);
        R0C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C3.setInheritsPopupMenu(true);
        R0C3.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C3.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C3.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C3ActionPerformed(evt);
            }
        });
        C3.add(R0C3);

        getContentPane().add(C3);
        C3.setBounds(275, 86, 56, 500);

        C2.setOpaque(false);

        R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C2.setBorder(null);
        R7C2.setBorderPainted(false);
        R7C2.setContentAreaFilled(false);
        R7C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C2.setInheritsPopupMenu(true);
        R7C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C2ActionPerformed(evt);
            }
        });
        C2.add(R7C2);

        R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C2.setBorder(null);
        R6C2.setBorderPainted(false);
        R6C2.setContentAreaFilled(false);
        R6C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C2.setInheritsPopupMenu(true);
        R6C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C2ActionPerformed(evt);
            }
        });
        C2.add(R6C2);

        R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C2.setBorder(null);
        R5C2.setBorderPainted(false);
        R5C2.setContentAreaFilled(false);
        R5C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C2.setInheritsPopupMenu(true);
        R5C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C2ActionPerformed(evt);
            }
        });
        C2.add(R5C2);

        R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C2.setBorder(null);
        R4C2.setBorderPainted(false);
        R4C2.setContentAreaFilled(false);
        R4C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C2.setInheritsPopupMenu(true);
        R4C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C2ActionPerformed(evt);
            }
        });
        C2.add(R4C2);

        R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C2.setBorder(null);
        R3C2.setBorderPainted(false);
        R3C2.setContentAreaFilled(false);
        R3C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C2.setInheritsPopupMenu(true);
        R3C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C2ActionPerformed(evt);
            }
        });
        C2.add(R3C2);

        R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C2.setBorder(null);
        R2C2.setBorderPainted(false);
        R2C2.setContentAreaFilled(false);
        R2C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C2.setInheritsPopupMenu(true);
        R2C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C2ActionPerformed(evt);
            }
        });
        C2.add(R2C2);

        R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C2.setBorder(null);
        R1C2.setBorderPainted(false);
        R1C2.setContentAreaFilled(false);
        R1C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C2.setInheritsPopupMenu(true);
        R1C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C2ActionPerformed(evt);
            }
        });
        C2.add(R1C2);

        R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C2.setBorder(null);
        R0C2.setBorderPainted(false);
        R0C2.setContentAreaFilled(false);
        R0C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C2.setInheritsPopupMenu(true);
        R0C2.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C2.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C2.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C2ActionPerformed(evt);
            }
        });
        C2.add(R0C2);

        getContentPane().add(C2);
        C2.setBounds(209, 86, 60, 500);

        C1.setOpaque(false);

        R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C1.setBorder(null);
        R7C1.setBorderPainted(false);
        R7C1.setContentAreaFilled(false);
        R7C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C1.setInheritsPopupMenu(true);
        R7C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C1ActionPerformed(evt);
            }
        });
        C1.add(R7C1);

        R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C1.setBorder(null);
        R6C1.setBorderPainted(false);
        R6C1.setContentAreaFilled(false);
        R6C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C1.setInheritsPopupMenu(true);
        R6C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C1ActionPerformed(evt);
            }
        });
        C1.add(R6C1);

        R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C1.setBorder(null);
        R5C1.setBorderPainted(false);
        R5C1.setContentAreaFilled(false);
        R5C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C1.setInheritsPopupMenu(true);
        R5C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C1ActionPerformed(evt);
            }
        });
        C1.add(R5C1);

        R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C1.setBorder(null);
        R4C1.setBorderPainted(false);
        R4C1.setContentAreaFilled(false);
        R4C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C1.setInheritsPopupMenu(true);
        R4C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C1ActionPerformed(evt);
            }
        });
        C1.add(R4C1);

        R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C1.setBorder(null);
        R3C1.setBorderPainted(false);
        R3C1.setContentAreaFilled(false);
        R3C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C1.setInheritsPopupMenu(true);
        R3C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C1ActionPerformed(evt);
            }
        });
        C1.add(R3C1);

        R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C1.setBorder(null);
        R2C1.setBorderPainted(false);
        R2C1.setContentAreaFilled(false);
        R2C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C1.setInheritsPopupMenu(true);
        R2C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C1ActionPerformed(evt);
            }
        });
        C1.add(R2C1);

        R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C1.setBorder(null);
        R1C1.setBorderPainted(false);
        R1C1.setContentAreaFilled(false);
        R1C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C1.setInheritsPopupMenu(true);
        R1C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C1ActionPerformed(evt);
            }
        });
        C1.add(R1C1);

        R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C1.setBorder(null);
        R0C1.setBorderPainted(false);
        R0C1.setContentAreaFilled(false);
        R0C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C1.setInheritsPopupMenu(true);
        R0C1.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C1.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C1.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C1ActionPerformed(evt);
            }
        });
        C1.add(R0C1);

        getContentPane().add(C1);
        C1.setBounds(146, 86, 57, 500);

        jPanel2.setOpaque(false);

        R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C0.setBorder(null);
        R7C0.setBorderPainted(false);
        R7C0.setContentAreaFilled(false);
        R7C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C0.setInheritsPopupMenu(true);
        R7C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R7C0);

        R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C0.setBorder(null);
        R6C0.setBorderPainted(false);
        R6C0.setContentAreaFilled(false);
        R6C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C0.setInheritsPopupMenu(true);
        R6C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R6C0);

        R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C0.setBorder(null);
        R5C0.setBorderPainted(false);
        R5C0.setContentAreaFilled(false);
        R5C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C0.setInheritsPopupMenu(true);
        R5C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R5C0);

        R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C0.setBorder(null);
        R4C0.setBorderPainted(false);
        R4C0.setContentAreaFilled(false);
        R4C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C0.setInheritsPopupMenu(true);
        R4C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R4C0);

        R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C0.setBorder(null);
        R3C0.setBorderPainted(false);
        R3C0.setContentAreaFilled(false);
        R3C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C0.setInheritsPopupMenu(true);
        R3C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R3C0);

        R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C0.setBorder(null);
        R2C0.setBorderPainted(false);
        R2C0.setContentAreaFilled(false);
        R2C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C0.setInheritsPopupMenu(true);
        R2C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R2C0);

        R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C0.setBorder(null);
        R1C0.setBorderPainted(false);
        R1C0.setContentAreaFilled(false);
        R1C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C0.setInheritsPopupMenu(true);
        R1C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R1C0);

        R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C0.setBorder(null);
        R0C0.setBorderPainted(false);
        R0C0.setContentAreaFilled(false);
        R0C0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C0.setInheritsPopupMenu(true);
        R0C0.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C0.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C0.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C0ActionPerformed(evt);
            }
        });
        jPanel2.add(R0C0);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(87, 86, 53, 500);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(745, 407, 0, 0);

        C5.setMinimumSize(new java.awt.Dimension(450, 61));
        C5.setOpaque(false);

        R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C5.setBorder(null);
        R7C5.setBorderPainted(false);
        R7C5.setContentAreaFilled(false);
        R7C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C5.setInheritsPopupMenu(true);
        R7C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C5ActionPerformed(evt);
            }
        });
        C5.add(R7C5);

        R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C5.setBorder(null);
        R6C5.setBorderPainted(false);
        R6C5.setContentAreaFilled(false);
        R6C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C5.setInheritsPopupMenu(true);
        R6C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C5ActionPerformed(evt);
            }
        });
        C5.add(R6C5);

        R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C5.setBorder(null);
        R5C5.setBorderPainted(false);
        R5C5.setContentAreaFilled(false);
        R5C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C5.setInheritsPopupMenu(true);
        R5C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C5ActionPerformed(evt);
            }
        });
        C5.add(R5C5);

        R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C5.setBorder(null);
        R4C5.setBorderPainted(false);
        R4C5.setContentAreaFilled(false);
        R4C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C5.setInheritsPopupMenu(true);
        R4C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C5ActionPerformed(evt);
            }
        });
        C5.add(R4C5);

        R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C5.setBorder(null);
        R3C5.setBorderPainted(false);
        R3C5.setContentAreaFilled(false);
        R3C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C5.setInheritsPopupMenu(true);
        R3C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C5ActionPerformed(evt);
            }
        });
        C5.add(R3C5);

        R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C5.setBorder(null);
        R2C5.setBorderPainted(false);
        R2C5.setContentAreaFilled(false);
        R2C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C5.setInheritsPopupMenu(true);
        R2C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C5ActionPerformed(evt);
            }
        });
        C5.add(R2C5);

        R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C5.setBorder(null);
        R1C5.setBorderPainted(false);
        R1C5.setContentAreaFilled(false);
        R1C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C5.setInheritsPopupMenu(true);
        R1C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C5ActionPerformed(evt);
            }
        });
        C5.add(R1C5);

        R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C5.setBorder(null);
        R0C5.setBorderPainted(false);
        R0C5.setContentAreaFilled(false);
        R0C5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C5.setInheritsPopupMenu(true);
        R0C5.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C5.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C5.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C5ActionPerformed(evt);
            }
        });
        C5.add(R0C5);

        getContentPane().add(C5);
        C5.setBounds(408, 86, 63, 500);

        C6.setMinimumSize(new java.awt.Dimension(450, 61));
        C6.setOpaque(false);

        R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C6.setBorder(null);
        R7C6.setBorderPainted(false);
        R7C6.setContentAreaFilled(false);
        R7C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C6.setInheritsPopupMenu(true);
        R7C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C6ActionPerformed(evt);
            }
        });
        C6.add(R7C6);

        R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C6.setBorder(null);
        R6C6.setBorderPainted(false);
        R6C6.setContentAreaFilled(false);
        R6C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C6.setInheritsPopupMenu(true);
        R6C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C6ActionPerformed(evt);
            }
        });
        C6.add(R6C6);

        R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C6.setBorder(null);
        R5C6.setBorderPainted(false);
        R5C6.setContentAreaFilled(false);
        R5C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C6.setInheritsPopupMenu(true);
        R5C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C6ActionPerformed(evt);
            }
        });
        C6.add(R5C6);

        R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C6.setBorder(null);
        R4C6.setBorderPainted(false);
        R4C6.setContentAreaFilled(false);
        R4C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C6.setInheritsPopupMenu(true);
        R4C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C6ActionPerformed(evt);
            }
        });
        C6.add(R4C6);

        R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C6.setBorder(null);
        R3C6.setBorderPainted(false);
        R3C6.setContentAreaFilled(false);
        R3C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C6.setInheritsPopupMenu(true);
        R3C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C6ActionPerformed(evt);
            }
        });
        C6.add(R3C6);

        R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C6.setBorder(null);
        R2C6.setBorderPainted(false);
        R2C6.setContentAreaFilled(false);
        R2C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C6.setInheritsPopupMenu(true);
        R2C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C6ActionPerformed(evt);
            }
        });
        C6.add(R2C6);

        R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C6.setBorder(null);
        R1C6.setBorderPainted(false);
        R1C6.setContentAreaFilled(false);
        R1C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C6.setInheritsPopupMenu(true);
        R1C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C6ActionPerformed(evt);
            }
        });
        C6.add(R1C6);

        R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C6.setBorder(null);
        R0C6.setBorderPainted(false);
        R0C6.setContentAreaFilled(false);
        R0C6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C6.setInheritsPopupMenu(true);
        R0C6.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C6.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C6.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C6ActionPerformed(evt);
            }
        });
        C6.add(R0C6);

        getContentPane().add(C6);
        C6.setBounds(477, 86, 63, 500);

        C7.setMinimumSize(new java.awt.Dimension(450, 61));
        C7.setOpaque(false);

        R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R7C7.setBorder(null);
        R7C7.setBorderPainted(false);
        R7C7.setContentAreaFilled(false);
        R7C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R7C7.setInheritsPopupMenu(true);
        R7C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R7C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R7C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R7C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C7ActionPerformed(evt);
            }
        });
        C7.add(R7C7);

        R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R6C7.setBorder(null);
        R6C7.setBorderPainted(false);
        R6C7.setContentAreaFilled(false);
        R6C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R6C7.setInheritsPopupMenu(true);
        R6C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R6C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R6C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R6C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C7ActionPerformed(evt);
            }
        });
        C7.add(R6C7);

        R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R5C7.setBorder(null);
        R5C7.setBorderPainted(false);
        R5C7.setContentAreaFilled(false);
        R5C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R5C7.setInheritsPopupMenu(true);
        R5C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R5C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R5C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R5C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C7ActionPerformed(evt);
            }
        });
        C7.add(R5C7);

        R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R4C7.setBorder(null);
        R4C7.setBorderPainted(false);
        R4C7.setContentAreaFilled(false);
        R4C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R4C7.setInheritsPopupMenu(true);
        R4C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R4C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R4C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R4C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C7ActionPerformed(evt);
            }
        });
        C7.add(R4C7);

        R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R3C7.setBorder(null);
        R3C7.setBorderPainted(false);
        R3C7.setContentAreaFilled(false);
        R3C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R3C7.setInheritsPopupMenu(true);
        R3C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R3C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R3C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R3C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C7ActionPerformed(evt);
            }
        });
        C7.add(R3C7);

        R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R2C7.setBorder(null);
        R2C7.setBorderPainted(false);
        R2C7.setContentAreaFilled(false);
        R2C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2C7.setInheritsPopupMenu(true);
        R2C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R2C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R2C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R2C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C7ActionPerformed(evt);
            }
        });
        C7.add(R2C7);

        R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R1C7.setBorder(null);
        R1C7.setBorderPainted(false);
        R1C7.setContentAreaFilled(false);
        R1C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R1C7.setInheritsPopupMenu(true);
        R1C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R1C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R1C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R1C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C7ActionPerformed(evt);
            }
        });
        C7.add(R1C7);

        R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/hole.png"))); // NOI18N
        R0C7.setBorder(null);
        R0C7.setBorderPainted(false);
        R0C7.setContentAreaFilled(false);
        R0C7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R0C7.setInheritsPopupMenu(true);
        R0C7.setMaximumSize(new java.awt.Dimension(52, 53));
        R0C7.setMinimumSize(new java.awt.Dimension(52, 53));
        R0C7.setPreferredSize(new java.awt.Dimension(52, 53));
        R0C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C7ActionPerformed(evt);
            }
        });
        C7.add(R0C7);

        getContentPane().add(C7);
        C7.setBounds(546, 86, 63, 500);

        jPanel3.setOpaque(false);

        WHITE6.setBackground(new java.awt.Color(255, 255, 255));
        WHITE6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE6.setForeground(new java.awt.Color(255, 255, 255));
        WHITE6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE6.setToolTipText("");
        WHITE6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE6.setFocusCycleRoot(true);
        WHITE6.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE6.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE6.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK6.setBackground(new java.awt.Color(255, 255, 255));
        BLACK6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK6.setForeground(new java.awt.Color(255, 255, 255));
        BLACK6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK6.setToolTipText("");
        BLACK6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK6.setFocusCycleRoot(true);
        BLACK6.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK6.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK6.setPreferredSize(new java.awt.Dimension(52, 53));

        WHITE5.setBackground(new java.awt.Color(255, 255, 255));
        WHITE5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE5.setForeground(new java.awt.Color(255, 255, 255));
        WHITE5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE5.setToolTipText("");
        WHITE5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE5.setFocusCycleRoot(true);
        WHITE5.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE5.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE5.setPreferredSize(new java.awt.Dimension(52, 53));

        WHITE2.setBackground(new java.awt.Color(255, 255, 255));
        WHITE2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE2.setForeground(new java.awt.Color(255, 255, 255));
        WHITE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE2.setToolTipText("");
        WHITE2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE2.setFocusCycleRoot(true);
        WHITE2.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE2.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE2.setPreferredSize(new java.awt.Dimension(52, 53));

        WHITE4.setBackground(new java.awt.Color(255, 255, 255));
        WHITE4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE4.setForeground(new java.awt.Color(255, 255, 255));
        WHITE4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE4.setToolTipText("");
        WHITE4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE4.setFocusCycleRoot(true);
        WHITE4.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE4.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE4.setPreferredSize(new java.awt.Dimension(52, 53));

        WHITE3.setBackground(new java.awt.Color(255, 255, 255));
        WHITE3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE3.setForeground(new java.awt.Color(255, 255, 255));
        WHITE3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE3.setToolTipText("");
        WHITE3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE3.setFocusCycleRoot(true);
        WHITE3.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE3.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE3.setPreferredSize(new java.awt.Dimension(52, 53));

        WHITE0.setBackground(new java.awt.Color(255, 255, 255));
        WHITE0.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE0.setForeground(new java.awt.Color(255, 255, 255));
        WHITE0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE0.setToolTipText("");
        WHITE0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE0.setFocusCycleRoot(true);
        WHITE0.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE0.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE0.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK3.setBackground(new java.awt.Color(255, 255, 255));
        BLACK3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK3.setForeground(new java.awt.Color(255, 255, 255));
        BLACK3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK3.setToolTipText("");
        BLACK3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK3.setFocusCycleRoot(true);
        BLACK3.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK3.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK3.setPreferredSize(new java.awt.Dimension(52, 53));

        WHITE1.setBackground(new java.awt.Color(255, 255, 255));
        WHITE1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE1.setForeground(new java.awt.Color(255, 255, 255));
        WHITE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE1.setToolTipText("");
        WHITE1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE1.setFocusCycleRoot(true);
        WHITE1.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE1.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE1.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK7.setBackground(new java.awt.Color(255, 255, 255));
        BLACK7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK7.setForeground(new java.awt.Color(255, 255, 255));
        BLACK7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK7.setToolTipText("");
        BLACK7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK7.setFocusCycleRoot(true);
        BLACK7.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK7.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK7.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK2.setBackground(new java.awt.Color(255, 255, 255));
        BLACK2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK2.setForeground(new java.awt.Color(255, 255, 255));
        BLACK2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK2.setToolTipText("");
        BLACK2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK2.setFocusCycleRoot(true);
        BLACK2.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK2.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK2.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK0.setBackground(new java.awt.Color(255, 255, 255));
        BLACK0.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK0.setForeground(new java.awt.Color(255, 255, 255));
        BLACK0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK0.setToolTipText("");
        BLACK0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK0.setFocusCycleRoot(true);
        BLACK0.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK0.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK0.setPreferredSize(new java.awt.Dimension(52, 53));

        WHITE7.setBackground(new java.awt.Color(255, 255, 255));
        WHITE7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WHITE7.setForeground(new java.awt.Color(255, 255, 255));
        WHITE7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WHITE7.setToolTipText("");
        WHITE7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WHITE7.setFocusCycleRoot(true);
        WHITE7.setMaximumSize(new java.awt.Dimension(52, 53));
        WHITE7.setMinimumSize(new java.awt.Dimension(52, 53));
        WHITE7.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK1.setBackground(new java.awt.Color(255, 255, 255));
        BLACK1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK1.setForeground(new java.awt.Color(255, 255, 255));
        BLACK1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK1.setToolTipText("");
        BLACK1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK1.setFocusCycleRoot(true);
        BLACK1.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK1.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK1.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK5.setBackground(new java.awt.Color(255, 255, 255));
        BLACK5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK5.setForeground(new java.awt.Color(255, 255, 255));
        BLACK5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK5.setToolTipText("");
        BLACK5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK5.setFocusCycleRoot(true);
        BLACK5.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK5.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK5.setPreferredSize(new java.awt.Dimension(52, 53));

        BLACK4.setBackground(new java.awt.Color(255, 255, 255));
        BLACK4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BLACK4.setForeground(new java.awt.Color(255, 255, 255));
        BLACK4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLACK4.setToolTipText("");
        BLACK4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BLACK4.setFocusCycleRoot(true);
        BLACK4.setMaximumSize(new java.awt.Dimension(52, 53));
        BLACK4.setMinimumSize(new java.awt.Dimension(52, 53));
        BLACK4.setPreferredSize(new java.awt.Dimension(52, 53));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLACK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLACK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLACK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLACK7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLACK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLACK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLACK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLACK0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WHITE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLACK7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLACK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLACK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(WHITE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BLACK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WHITE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BLACK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLACK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WHITE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(WHITE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WHITE0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BLACK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BLACK0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(610, 80, 130, 480);

        SurrenderButton.setText("SURRENDER");
        SurrenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurrenderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SurrenderButton);
        SurrenderButton.setBounds(870, 140, 110, 40);

        Restart.setText("RESTART");
        Restart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        getContentPane().add(Restart);
        Restart.setBounds(890, 40, 90, 40);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(890, 90, 90, 40);

        TimeCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TimeCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeCounter.setText("0");
        TimeCounter.setOpaque(true);
        getContentPane().add(TimeCounter);
        TimeCounter.setBounds(790, 50, 80, 30);

        CodePanel.setOpaque(false);

        Code1.setBorder(null);
        Code1.setBorderPainted(false);
        Code1.setContentAreaFilled(false);
        Code1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code1.setInheritsPopupMenu(true);
        Code1.setMaximumSize(new java.awt.Dimension(52, 53));
        Code1.setMinimumSize(new java.awt.Dimension(52, 53));
        Code1.setPreferredSize(new java.awt.Dimension(52, 53));
        Code1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code1ActionPerformed(evt);
            }
        });

        Code2.setBorder(null);
        Code2.setBorderPainted(false);
        Code2.setContentAreaFilled(false);
        Code2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code2.setInheritsPopupMenu(true);
        Code2.setMaximumSize(new java.awt.Dimension(52, 53));
        Code2.setMinimumSize(new java.awt.Dimension(52, 53));
        Code2.setPreferredSize(new java.awt.Dimension(52, 53));
        Code2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code2ActionPerformed(evt);
            }
        });

        Code3.setBorder(null);
        Code3.setBorderPainted(false);
        Code3.setContentAreaFilled(false);
        Code3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code3.setInheritsPopupMenu(true);
        Code3.setMaximumSize(new java.awt.Dimension(52, 53));
        Code3.setMinimumSize(new java.awt.Dimension(52, 53));
        Code3.setPreferredSize(new java.awt.Dimension(52, 53));
        Code3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code3ActionPerformed(evt);
            }
        });

        Code4.setBorder(null);
        Code4.setBorderPainted(false);
        Code4.setContentAreaFilled(false);
        Code4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code4.setInheritsPopupMenu(true);
        Code4.setMaximumSize(new java.awt.Dimension(52, 53));
        Code4.setMinimumSize(new java.awt.Dimension(52, 53));
        Code4.setPreferredSize(new java.awt.Dimension(52, 53));
        Code4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code4ActionPerformed(evt);
            }
        });

        Code5.setBorder(null);
        Code5.setBorderPainted(false);
        Code5.setContentAreaFilled(false);
        Code5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code5.setInheritsPopupMenu(true);
        Code5.setMaximumSize(new java.awt.Dimension(52, 53));
        Code5.setMinimumSize(new java.awt.Dimension(52, 53));
        Code5.setPreferredSize(new java.awt.Dimension(52, 53));
        Code5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code5ActionPerformed(evt);
            }
        });

        Code6.setBorder(null);
        Code6.setBorderPainted(false);
        Code6.setContentAreaFilled(false);
        Code6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code6.setInheritsPopupMenu(true);
        Code6.setMaximumSize(new java.awt.Dimension(52, 53));
        Code6.setMinimumSize(new java.awt.Dimension(52, 53));
        Code6.setPreferredSize(new java.awt.Dimension(52, 53));
        Code6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code6ActionPerformed(evt);
            }
        });

        Code7.setBorder(null);
        Code7.setBorderPainted(false);
        Code7.setContentAreaFilled(false);
        Code7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code7.setInheritsPopupMenu(true);
        Code7.setMaximumSize(new java.awt.Dimension(52, 53));
        Code7.setMinimumSize(new java.awt.Dimension(52, 53));
        Code7.setPreferredSize(new java.awt.Dimension(52, 53));
        Code7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code7ActionPerformed(evt);
            }
        });

        Code8.setBorder(null);
        Code8.setBorderPainted(false);
        Code8.setContentAreaFilled(false);
        Code8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Code8.setInheritsPopupMenu(true);
        Code8.setMaximumSize(new java.awt.Dimension(52, 53));
        Code8.setMinimumSize(new java.awt.Dimension(52, 53));
        Code8.setPreferredSize(new java.awt.Dimension(52, 53));
        Code8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CodePanelLayout = new javax.swing.GroupLayout(CodePanel);
        CodePanel.setLayout(CodePanelLayout);
        CodePanelLayout.setHorizontalGroup(
            CodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Code1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Code2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Code3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Code4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Code5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Code6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Code7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Code8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CodePanelLayout.setVerticalGroup(
            CodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Code1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(CodePanel);
        CodePanel.setBounds(100, 10, 500, 70);

        BLACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/Black.png"))); // NOI18N
        getContentPane().add(BLACK);
        BLACK.setBounds(620, 20, 52, 53);

        WHITE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/White.png"))); // NOI18N
        getContentPane().add(WHITE);
        WHITE.setBounds(680, 20, 53, 53);

        BG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/resources/bg.png"))); // NOI18N
        BG.setToolTipText("");
        BG.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1130, 980);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void REDassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDassignActionPerformed
        assign = 0;
    }//GEN-LAST:event_REDassignActionPerformed

    private void GREENassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GREENassignActionPerformed
        assign = 1;
    }//GEN-LAST:event_GREENassignActionPerformed

    private void BLUEassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLUEassignActionPerformed
        assign = 2;
    }//GEN-LAST:event_BLUEassignActionPerformed

    private void YELLOWassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YELLOWassignActionPerformed
        assign = 3;
    }//GEN-LAST:event_YELLOWassignActionPerformed

    private void ORANGEassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORANGEassignActionPerformed
        assign = 4;
    }//GEN-LAST:event_ORANGEassignActionPerformed

    private void PINKassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PINKassignActionPerformed
        assign = 5;
    }//GEN-LAST:event_PINKassignActionPerformed

    private void PURPLEassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PURPLEassignActionPerformed
        assign = 6;
    }//GEN-LAST:event_PURPLEassignActionPerformed

    private void TEALassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEALassignActionPerformed
        assign = 7;
    }//GEN-LAST:event_TEALassignActionPerformed

    private void R0C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C0ActionPerformed
        if (chances == 0) {
            R0C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C0ActionPerformed

    private void R0C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C1ActionPerformed
        if (chances == 0) {
            R0C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C1.setIcon(new javax.swing.ImageIcon("D:\\My Courses\\Fundamental Of Programming\\Assignmnet FOP Mastermind\\Mastermind\\src\\mastermind\\resources\\RED.png"));
                    break;
                case 1:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C1ActionPerformed

    private void R0C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C2ActionPerformed
        if (chances == 0) {
            R0C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C2ActionPerformed

    private void R0C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C3ActionPerformed
        if (chances == 0) {
            R0C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C3ActionPerformed

    private void R0C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C4ActionPerformed
        if (chances == 0) {
            R0C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C4ActionPerformed

    private void R1C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C0ActionPerformed
        if (chances == 1) {
            R1C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }

    }//GEN-LAST:event_R1C0ActionPerformed

    private void R1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C1ActionPerformed
        if (chances == 1) {
            R1C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R1C1ActionPerformed

    private void R1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C2ActionPerformed
        if (chances == 1) {
            R1C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R1C2ActionPerformed

    private void R1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C3ActionPerformed
        if (chances == 1) {
            R1C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R1C3ActionPerformed

    private void R1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C4ActionPerformed
        if (chances == 1) {
            R1C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R1C4ActionPerformed

    private void R2C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C0ActionPerformed
        if (chances == 2) {
            R2C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C0ActionPerformed

    private void R2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C1ActionPerformed
        if (chances == 2) {
            R2C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C1ActionPerformed

    private void R2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C2ActionPerformed
        if (chances == 2) {
            R2C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C2ActionPerformed

    private void R2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C3ActionPerformed
        if (chances == 2) {
            R2C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C3ActionPerformed

    private void R2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C4ActionPerformed
        if (chances == 2) {
            R2C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C4ActionPerformed

    private void R3C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C0ActionPerformed
        if (chances == 3) {
            R3C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C0ActionPerformed

    private void R3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C1ActionPerformed
        if (chances == 3) {
            R3C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C1ActionPerformed

    private void R3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C2ActionPerformed
        if (chances == 3) {
            R3C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C2ActionPerformed

    private void R3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C3ActionPerformed
        if (chances == 3) {
            R3C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C3ActionPerformed

    private void R3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C4ActionPerformed
        if (chances == 3) {
            R3C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C4ActionPerformed

    private void R4C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C0ActionPerformed
        if (chances == 4) {
            R4C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R4C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C0ActionPerformed

    private void R4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C1ActionPerformed
        if (chances == 4) {
            R4C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C1ActionPerformed

    private void R4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C2ActionPerformed
        if (chances == 4) {
            R4C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C2ActionPerformed

    private void R4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C3ActionPerformed
        if (chances == 4) {
            R4C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R4C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C3ActionPerformed

    private void R4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C4ActionPerformed
        if (chances == 4) {
            R4C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R4C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C4ActionPerformed

    private void R5C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C0ActionPerformed
        if (chances == 5) {
            R5C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C0ActionPerformed

    private void R5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C1ActionPerformed
        if (chances == 5) {
            R5C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C1ActionPerformed

    private void R5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C2ActionPerformed
        if (chances == 5) {
            R5C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C2ActionPerformed

    private void R5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C3ActionPerformed
        if (chances == 5) {
            R5C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C3ActionPerformed

    private void R5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C4ActionPerformed
        if (chances == 5) {
            R5C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C4ActionPerformed

    private void R6C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C0ActionPerformed
        if (chances == 6) {
            R6C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C0ActionPerformed

    private void R6C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C1ActionPerformed
        if (chances == 6) {
            R6C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C1ActionPerformed

    private void R6C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C2ActionPerformed
        if (chances == 6) {
            R6C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C2ActionPerformed

    private void R6C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C3ActionPerformed
        if (chances == 6) {
            R6C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C3ActionPerformed

    private void R6C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C4ActionPerformed
        if (chances == 6) {
            R6C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C4ActionPerformed

    private void R7C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C0ActionPerformed
        if (chances == 7) {
            R7C0.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C0.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(0, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C0ActionPerformed

    private void R7C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C1ActionPerformed
        if (chances == 7) {
            R7C1.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(1, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C1ActionPerformed

    private void R7C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C2ActionPerformed
        if (chances == 7) {
            R7C2.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(2, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C2ActionPerformed

    private void R7C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C3ActionPerformed
        if (chances == 7) {
            R7C3.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(3, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C3ActionPerformed

    private void R7C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C4ActionPerformed
        if (chances == 7) {
            R7C4.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(4, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C4ActionPerformed

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        Score set = new Score();
        Codemaker guess = new Codemaker();
        if (end == false) {
            if (guess.checkBlank() != true) {
                end = guess.checkGuess();
                set.setChances(chances);
                if (chances < 8) {
                    switch (chances) { // Display feedback
                        case 0:
                            BLACK0.setText("" + feed[0]);
                            WHITE0.setText("" + feed[1]);
                            break;
                        case 1:
                            BLACK1.setText("" + feed[0]);
                            WHITE1.setText("" + feed[1]);
                            break;
                        case 2:
                            BLACK2.setText("" + feed[0]);
                            WHITE2.setText("" + feed[1]);
                            break;
                        case 3:
                            BLACK3.setText("" + feed[0]);
                            WHITE3.setText("" + feed[1]);
                            break;
                        case 4:
                            BLACK4.setText("" + feed[0]);
                            WHITE4.setText("" + feed[1]);
                            break;
                        case 5:
                            BLACK5.setText("" + feed[0]);
                            WHITE5.setText("" + feed[1]);
                            break;
                        case 6:
                            BLACK6.setText("" + feed[0]);
                            WHITE6.setText("" + feed[1]);
                            break;
                        case 7:
                            BLACK7.setText("" + feed[0]);
                            WHITE7.setText("" + feed[1]);
                            break;
                        default:
                    }
                    if (end == true) {// for timer
                        t.stop();
                        Surrender();
                        JOptionPane.showMessageDialog(null, "YOU ARE THE WINNER");
                        set.setTime(cnt);
                        set.score();
                        set.write();
                        Back.doClick();
                    }
                    if (chances == 7 && end == false) {// for timer
                        t.stop();
                        Surrender();
                        JOptionPane.showMessageDialog(null, "DEFEATED");
                        set.setTime(cnt);
                        set.score();
                        set.write();
                        Back.doClick();
                    }

                }
            }
            guess.Resetter(); //To move into the next row of guess if player do not complete the code yet
            chances = guess.getChances();
        }


    }//GEN-LAST:event_AcceptActionPerformed

    private void R7C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C5ActionPerformed
        if (chances == 7) {
            R7C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C5ActionPerformed

    private void R6C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C5ActionPerformed
        if (chances == 6) {
            R6C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C5ActionPerformed

    private void R5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C5ActionPerformed
        if (chances == 5) {
            R5C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C5ActionPerformed

    private void R4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C5ActionPerformed
        if (chances == 4) {
            R4C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R4C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C5ActionPerformed

    private void R3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C5ActionPerformed
        if (chances == 3) {
            R3C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C5ActionPerformed

    private void R2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C5ActionPerformed
        if (chances == 2) {
            R5C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C5ActionPerformed

    private void R1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C5ActionPerformed
        if (chances == 1) {
            R1C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R1C5ActionPerformed

    private void R0C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C5ActionPerformed
        if (chances == 0) {
            R0C5.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(5, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C5ActionPerformed

    private void R7C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C6ActionPerformed
        if (chances == 7) {
            R7C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C6ActionPerformed

    private void R6C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C6ActionPerformed
        if (chances == 6) {
            R6C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C6ActionPerformed

    private void R5C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C6ActionPerformed
        if (chances == 5) {
            R5C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C6ActionPerformed

    private void R4C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C6ActionPerformed
        if (chances == 4) {
            R4C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R4C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C6ActionPerformed

    private void R3C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C6ActionPerformed
        if (chances == 3) {
            R3C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C6ActionPerformed

    private void R2C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C6ActionPerformed
        if (chances == 2) {
            R2C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C6ActionPerformed

    private void R1C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C6ActionPerformed
        if (chances == 1) {
            R1C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R1C6ActionPerformed

    private void R0C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C6ActionPerformed
        if (chances == 0) {
            R0C6.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(6, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C6ActionPerformed

    private void R7C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C7ActionPerformed
        if (chances == 7) {
            R7C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R7C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R7C7ActionPerformed

    private void R6C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C7ActionPerformed
        if (chances == 6) {
            R6C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R6C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R6C7ActionPerformed

    private void R5C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C7ActionPerformed
        if (chances == 5) {
            R5C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R5C7ActionPerformed

    private void R4C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C7ActionPerformed
        if (chances == 4) {
            R4C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R4C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R5C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R4C7ActionPerformed

    private void R3C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C7ActionPerformed
        if (chances == 3) {
            R3C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R3C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R3C7ActionPerformed

    private void R2C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C7ActionPerformed
        if (chances == 2) {
            R2C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R2C7ActionPerformed

    private void R1C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C7ActionPerformed
        if (chances == 1) {
            R1C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R1C7ActionPerformed

    private void R0C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C7ActionPerformed
        if (chances == 0) {
            R0C7.setEnabled(true);
            switch (assign) {
                case 0:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\RED.png")));
                    break;
                case 1:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\GREEN.png")));
                    break;
                case 2:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\BLUE.png")));
                    break;
                case 3:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\YELLOW.png")));
                    break;
                case 4:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\ORANGE.png")));
                    break;
                case 5:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PINK.png")));
                    break;
                case 6:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\PURPLE.png")));
                    break;
                case 7:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\TEAL.png")));
                    break;
                default:
                    R0C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources\\hole.png")));
                    break;
            }
            Codemaker guess = new Codemaker(7, assign); // This object will pass location of code array and also the value that represent the colour
        }
    }//GEN-LAST:event_R0C7ActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        Game restart = new Game();
        Codemaker start = new Codemaker(mode);
        if (evt.getSource() == Restart) {
            dispose();
            assign = -1;
            chances = 0;
            end = false;
            restart.setVisible(true);
            restart.setMode(mode);
            start.ResetChances();
            start.Generator();

        }
    }//GEN-LAST:event_RestartActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        if (evt.getSource() == Back) {
            dispose();
            assign = -1;
            chances = 0;
            end = false;
            MainMenu b = new MainMenu();
            b.setVisible(true);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void Code1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code1ActionPerformed

    private void Code2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code2ActionPerformed

    private void Code3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code3ActionPerformed

    private void Code4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code4ActionPerformed

    private void Code5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code5ActionPerformed

    private void Code6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code6ActionPerformed

    private void Code7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code7ActionPerformed

    private void Code8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code8ActionPerformed

    private void SurrenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurrenderButtonActionPerformed
        Surrender();
        t.stop();
        JOptionPane.showMessageDialog(null, "YOU ARE DEFEATED!!");
    }//GEN-LAST:event_SurrenderButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BLACK;
    protected javax.swing.JLabel BLACK0;
    protected javax.swing.JLabel BLACK1;
    protected javax.swing.JLabel BLACK2;
    protected javax.swing.JLabel BLACK3;
    protected javax.swing.JLabel BLACK4;
    protected javax.swing.JLabel BLACK5;
    protected javax.swing.JLabel BLACK6;
    protected javax.swing.JLabel BLACK7;
    private javax.swing.JButton BLUEassign;
    private javax.swing.JButton Back;
    private javax.swing.JPanel C1;
    private javax.swing.JPanel C2;
    private javax.swing.JPanel C3;
    private javax.swing.JPanel C4;
    private javax.swing.JPanel C5;
    private javax.swing.JPanel C6;
    private javax.swing.JPanel C7;
    private javax.swing.JButton Code1;
    private javax.swing.JButton Code2;
    private javax.swing.JButton Code3;
    private javax.swing.JButton Code4;
    private javax.swing.JButton Code5;
    private javax.swing.JButton Code6;
    private javax.swing.JButton Code7;
    private javax.swing.JButton Code8;
    private javax.swing.JPanel CodePanel;
    private javax.swing.JButton GREENassign;
    private javax.swing.JButton ORANGEassign;
    private javax.swing.JButton PINKassign;
    private javax.swing.JButton PURPLEassign;
    private javax.swing.JButton R0C0;
    private javax.swing.JButton R0C1;
    private javax.swing.JButton R0C2;
    private javax.swing.JButton R0C3;
    private javax.swing.JButton R0C4;
    private javax.swing.JButton R0C5;
    private javax.swing.JButton R0C6;
    private javax.swing.JButton R0C7;
    private javax.swing.JButton R1C0;
    private javax.swing.JButton R1C1;
    private javax.swing.JButton R1C2;
    private javax.swing.JButton R1C3;
    private javax.swing.JButton R1C4;
    private javax.swing.JButton R1C5;
    private javax.swing.JButton R1C6;
    private javax.swing.JButton R1C7;
    private javax.swing.JButton R2C0;
    private javax.swing.JButton R2C1;
    private javax.swing.JButton R2C2;
    private javax.swing.JButton R2C3;
    private javax.swing.JButton R2C4;
    private javax.swing.JButton R2C5;
    private javax.swing.JButton R2C6;
    private javax.swing.JButton R2C7;
    private javax.swing.JButton R3C0;
    private javax.swing.JButton R3C1;
    private javax.swing.JButton R3C2;
    private javax.swing.JButton R3C3;
    private javax.swing.JButton R3C4;
    private javax.swing.JButton R3C5;
    private javax.swing.JButton R3C6;
    private javax.swing.JButton R3C7;
    private javax.swing.JButton R4C0;
    private javax.swing.JButton R4C1;
    private javax.swing.JButton R4C2;
    private javax.swing.JButton R4C3;
    private javax.swing.JButton R4C4;
    private javax.swing.JButton R4C5;
    private javax.swing.JButton R4C6;
    private javax.swing.JButton R4C7;
    private javax.swing.JButton R5C0;
    private javax.swing.JButton R5C1;
    private javax.swing.JButton R5C2;
    private javax.swing.JButton R5C3;
    private javax.swing.JButton R5C4;
    private javax.swing.JButton R5C5;
    private javax.swing.JButton R5C6;
    private javax.swing.JButton R5C7;
    private javax.swing.JButton R6C0;
    private javax.swing.JButton R6C1;
    private javax.swing.JButton R6C2;
    private javax.swing.JButton R6C3;
    private javax.swing.JButton R6C4;
    private javax.swing.JButton R6C5;
    private javax.swing.JButton R6C6;
    private javax.swing.JButton R6C7;
    private javax.swing.JButton R7C0;
    private javax.swing.JButton R7C1;
    private javax.swing.JButton R7C2;
    private javax.swing.JButton R7C3;
    private javax.swing.JButton R7C4;
    private javax.swing.JButton R7C5;
    private javax.swing.JButton R7C6;
    private javax.swing.JButton R7C7;
    private javax.swing.JButton REDassign;
    private javax.swing.JButton Restart;
    private javax.swing.JButton SurrenderButton;
    private javax.swing.JButton TEALassign;
    private javax.swing.JLabel TimeCounter;
    private javax.swing.JLabel WHITE;
    protected javax.swing.JLabel WHITE0;
    protected javax.swing.JLabel WHITE1;
    protected javax.swing.JLabel WHITE2;
    protected javax.swing.JLabel WHITE3;
    protected javax.swing.JLabel WHITE4;
    protected javax.swing.JLabel WHITE5;
    protected javax.swing.JLabel WHITE6;
    protected javax.swing.JLabel WHITE7;
    private javax.swing.JButton YELLOWassign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
