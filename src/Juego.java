import javax.swing.*;
import java.awt.*;

public class Juego extends JFrame{

    public Juego(){
        setTitle("Juego");
        setSize(1080, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.lightGray);

        JPanel panelArriba = new JPanel();
        panelArriba.setLayout(new BorderLayout());

        JButton btnAjustes = new JButton("Ajustes");
        btnAjustes.setFont(new Font("Arial", Font.PLAIN, 18));
        btnAjustes.addActionListener(e -> configuracionSingleton.getinstance().Ajustes());
        panelArriba.add(btnAjustes, BorderLayout.WEST);


        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 18));
        btnSalir.addActionListener(e -> {new Lobby(); dispose();});
        panelArriba.add(btnSalir, BorderLayout.EAST);

        add(panelArriba, BorderLayout.NORTH);

        JLabel lblJuego = new JLabel("Juego", SwingConstants.CENTER);
        lblJuego.setFont(new Font("Arial", Font.BOLD, 32));
        add(lblJuego, BorderLayout.CENTER);

        setVisible(true);
    }
}
