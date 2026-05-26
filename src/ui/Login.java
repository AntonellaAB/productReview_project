package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class Login extends JFrame {

    // Style Constants (Slate Blue Theme)
    private static final Color COLOR_PRIMARY = new Color(43, 58, 66);       // #2B3A42
    private static final Color COLOR_ACCENT = new Color(63, 81, 181);       // #3F51B5
    private static final Color COLOR_BG = new Color(244, 246, 247);         // #F4F6F7
    private static final Color COLOR_TEXT_DARK = new Color(26, 26, 26);     // #1A1A1A
    private static final Color COLOR_TEXT_MUTED = new Color(98, 109, 115);  // #626D73

    // UI Components
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnIniciarSesion;
    private JButton btnRegistrarse;

    public Login() {
        // Window Configuration (Matches your fixed 800 x 650 constraint or stands alone perfectly)
        setTitle("Review System - System Authentication");
        setSize(800, 650);
        setMinimumSize(new Dimension(800, 650));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window on screen
        setResizable(false);

        // Main Background Split Container
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(COLOR_BG);
        mainPanel.setLayout(null); // Absolute positioning for precise layouts
        getContentPane().add(mainPanel);

        // --- Visual Header / Card ---
        JLabel lblWelcome = new JLabel("¡Bienvenido de Nuevo!");
        lblWelcome.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblWelcome.setForeground(COLOR_PRIMARY);
        lblWelcome.setBounds(250, 80, 400, 40);
        mainPanel.add(lblWelcome);

        JLabel lblInstruction = new JLabel("Por favor, ingrese sus credenciales para continuar.");
        lblInstruction.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblInstruction.setForeground(COLOR_TEXT_MUTED);
        lblInstruction.setBounds(250, 125, 400, 20);
        mainPanel.add(lblInstruction);

        // --- Username Input Field ---
        JLabel lblUsuario = new JLabel("Usuario / Correo Electrónico");
        lblUsuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblUsuario.setForeground(COLOR_TEXT_DARK);
        lblUsuario.setBounds(250, 180, 300, 20);
        mainPanel.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtUsuario.setBounds(250, 205, 300, 40);
        txtUsuario.setBorder(new MatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
        mainPanel.add(txtUsuario);

        // --- Password Input Field ---
        JLabel lblContrasena = new JLabel("Contraseña");
        lblContrasena.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblContrasena.setForeground(COLOR_TEXT_DARK);
        lblContrasena.setBounds(250, 265, 300, 20);
        mainPanel.add(lblContrasena);

        txtContrasena = new JPasswordField();
        txtContrasena.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtContrasena.setBounds(250, 290, 300, 40);
        txtContrasena.setBorder(new MatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
        mainPanel.add(txtContrasena);

        // --- "Iniciar Sesión" Button (Primary) ---
        btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnIniciarSesion.setBackground(COLOR_PRIMARY);
        btnIniciarSesion.setForeground(Color.WHITE);
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setBounds(250, 365, 300, 45);
        mainPanel.add(btnIniciarSesion);

        // --- "Registrarse" Button (Secondary Accent) ---
        btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnRegistrarse.setBackground(COLOR_BG);
        btnRegistrarse.setForeground(COLOR_ACCENT);
        btnRegistrarse.setFocusPainted(false);
        btnRegistrarse.setBorder(new MatteBorder(1, 1, 1, 1, COLOR_ACCENT));
        btnRegistrarse.setBounds(250, 425, 300, 45);
        mainPanel.add(btnRegistrarse);
    }

    // Public getters so your Controller/Main can access input values later
    public String getUsuarioText() {
        return txtUsuario.getText();
    }

    public String getContrasenaText() {
        return new String(txtContrasena.getPassword());
    }

    public JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }
}