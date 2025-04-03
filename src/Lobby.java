import javax.swing.*;
import java.awt.*;

public class Lobby extends JFrame {

    public Lobby() {

        setTitle("Lobby");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel lblTitulo = new JLabel("Lobby");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 48));
        lblTitulo.setForeground(Color.BLACK);
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblTitulo);

        // Espaciado entre el título y los botones
        add(Box.createVerticalStrut(20));


        JButton btnJugar = new JButton("Jugar");
        btnJugar.setPreferredSize(new Dimension(200, 50)); // Tamaño del botón
        btnJugar.setFont(new Font("Arial", Font.PLAIN, 18)); // Estilo de la fuente
        btnJugar.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el botón
        btnJugar.setBackground(Color.GRAY); // Establecer el color de fondo gris
        btnJugar.setForeground(Color.WHITE); // Establecer el color del texto blanco
        btnJugar.addActionListener(e -> {new Juego();dispose();});
        add(btnJugar);

        JButton btnAjustes = new JButton("Ajustes");
        btnAjustes.setPreferredSize(new Dimension(200, 50));
        btnAjustes.setFont(new Font("Arial", Font.PLAIN, 18));
        btnAjustes.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAjustes.setBackground(Color.GRAY);
        btnAjustes.setForeground(Color.WHITE);
        btnAjustes.addActionListener(e -> configuracionSingleton.getinstance().Ajustes());
        add(Box.createVerticalStrut(10));
        add(btnAjustes);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setPreferredSize(new Dimension(200, 50));
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 18));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSalir.setBackground(Color.GRAY);
        btnSalir.setForeground(Color.WHITE);
        btnSalir.addActionListener(e -> dispose());
        add(Box.createVerticalStrut(10));
        add(btnSalir);

        setVisible(true);
    }

}

