package screens;

import com.formdev.flatlaf.FlatLightLaf;
import java.net.URL;
//import java.sql.Connection;
import javax.swing.ImageIcon;
//import repository.DBConnection;

public class MainScreen extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    int deviceWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int deviceHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    //private final Connection conn = new DBConnection().connect();
    URL iconURL = getClass().getResource("/assets/college_mang_icon.png");
    ImageIcon icon = new ImageIcon(iconURL);

    private void customizeComponents() {
        setLocationRelativeTo(this);
    }

    public MainScreen() {
        initComponents();
        customizeComponents();
    }

    //@SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ToLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        AppNameLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        BannerLabel = new javax.swing.JLabel();
        ApplyButton = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("constants/strings"); // NOI18N
        setTitle(bundle.getString("APP_NAME")); // NOI18N
        setIconImage(icon.getImage());
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setName("MainFrame");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        ToLabel.setFont(ToLabel.getFont().deriveFont(ToLabel.getFont().getStyle() | java.awt.Font.BOLD, ToLabel.getFont().getSize()+29));
        ToLabel.setForeground(new java.awt.Color(60, 185, 145));
        ToLabel.setText(bundle.getString("TO"));

        WelcomeLabel.setFont(WelcomeLabel.getFont().deriveFont(WelcomeLabel.getFont().getStyle() | java.awt.Font.BOLD, WelcomeLabel.getFont().getSize()+29));
        WelcomeLabel.setForeground(new java.awt.Color(60, 185, 145));
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText(bundle.getString("WELCOME"));
        WelcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AppNameLabel.setFont(AppNameLabel.getFont().deriveFont(AppNameLabel.getFont().getStyle() | java.awt.Font.BOLD, AppNameLabel.getFont().getSize()+29));
        AppNameLabel.setForeground(new java.awt.Color(60, 185, 145));
        AppNameLabel.setText(bundle.getString("APP_NAME"));

        LoginButton.setFont(LoginButton.getFont().deriveFont(LoginButton.getFont().getStyle() | java.awt.Font.BOLD, LoginButton.getFont().getSize()+5));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btn300x60.png"))); // NOI18N
        LoginButton.setText("LOGIN HERE");
        LoginButton.setToolTipText("");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButtonMousePressed(evt);
            }
        });

        BannerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/college_banner.png"))); // NOI18N
        BannerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(WelcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ToLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(BannerLabel)))
                .addContainerGap(225, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AppNameLabel)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(417, 417, 417))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel)
                    .addComponent(ToLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppNameLabel)
                .addGap(49, 49, 49)
                .addComponent(BannerLabel)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void LoginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMousePressed
        this.dispose();
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppNameLabel;
    private javax.swing.JLabel ApplyButton;
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}


/*abstract

create database ooad;
use ooad;
CREATE TABLE LOGIN(login_id int auto_increment primary key,name varchar(20),password varchar(20),role int);
-- role 0-admin,1-faculty,2-student
CREATE TABLE STUDENT(login_id int foreign key references(LOGIN(login_id)),name varchar,srn varchar primary key);
CREATE TABLE COURSE(course_id int auto_increment primary key,course_name varchar,srn varchar references(STUDENT(srn)),attendance int);
CREATE TABLE EXAM(course_id int foreign key references(COURSE(course_id)),srn varchar references(STUDENT(srn)), marks int);
CREATE TABLE ANSWER(q_id int foreign key references(QUESTION(q_id)), srn varchar foreign key references(STUDENT(srn)), answer varchar);


--CREATE TABLE FACULTY(login_id int foreign key references(LOGIN(login_id)),name varchar);
--CREATE TABLE QUESTION_PAPER(course_id int foreign key references(COURSE(course_id)), exam_no int);
CREATE TABLE QUESTION(q_id int auto_increment primary key,course_id int foreign key references(COURSE(course_id)),exam_no int,marks int);
CREATE TABLE TEACHING(login_id int foreign key references(LOGIN(login_id)),course_id int foreign key references(COURSE(course_id)));



*/