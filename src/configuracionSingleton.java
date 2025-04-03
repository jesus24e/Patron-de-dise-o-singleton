import javax.swing.*;
import java.awt.*;

public class configuracionSingleton extends JFrame {
    private int volumen;
    private String calidad;
    private String resolucion;
    private static configuracionSingleton instance;

    private configuracionSingleton() {
        volumen = 60;
        calidad = "Media";
        resolucion = "1280x720";
    }

    public static configuracionSingleton getinstance() {
        if (instance == null) {
            instance = new configuracionSingleton();
            System.out.println("la primera");
            return instance;
        } else {
            System.out.println("misma instancia");
            return instance;
        }
    }

    public void Ajustes() {

        getContentPane().removeAll(); // Limpiar completamente la ventana antes de agregar componentes para que no se encimen las etiquetas

        setTitle("Ajustes");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        setBackground(Color.lightGray);

        // Volumen
        JLabel lblVolumen = new JLabel("Volumen: " + instance.getVolumen() + "%");
        JSlider sliderVolumen = new JSlider(0, 100, instance.getVolumen());
        sliderVolumen.addChangeListener(e -> lblVolumen.setText("Volumen: " + sliderVolumen.getValue() + "%"));

        // Resolución
        JLabel lblResolucion = new JLabel("Resolución:");
        JComboBox<String> cmbResolucion = new JComboBox<>(new String[]{
                "800x600", "1024x768", "1280x720", "1280x800", "1366x768",
                "1440x900", "1600x900", "1680x1050", "1920x1080"});
        cmbResolucion.setPreferredSize(new Dimension(100, cmbResolucion.getPreferredSize().height));
        cmbResolucion.setSelectedItem(instance.getResolucion());

        // Calidad
        JLabel lblCalidad = new JLabel("Calidad:");
        JComboBox<String> cmbCalidad = new JComboBox<>(new String[]{"ultra", "Alta", "Media", "Baja"});
        cmbCalidad.setPreferredSize(new Dimension(100, cmbCalidad.getPreferredSize().height));
        cmbCalidad.setSelectedItem(instance.getCalidad());

        // Botón Aceptar
        JButton aceptarconfig = new JButton("Aceptar");
        aceptarconfig.addActionListener(e -> {
            instance.setVolumen(sliderVolumen.getValue());
            instance.setResolucion((String) cmbResolucion.getSelectedItem());
            instance.setCalidad((String) cmbCalidad.getSelectedItem());
            System.out.println("Volumen: " + instance.getVolumen());
            System.out.println("Resolución: " + instance.getResolucion());
            System.out.println("Calidad: " + instance.getCalidad());
            dispose(); // Cierra la ventana
        });

        // Añadir bordes para que las etiquetas no choquen con la ventana
        lblVolumen.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        lblResolucion.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        lblCalidad.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cmbCalidad.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cmbResolucion.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Agregar componentes a la ventana
        add(lblVolumen);
        add(sliderVolumen);
        add(lblResolucion);
        add(cmbResolucion);
        add(lblCalidad);
        add(cmbCalidad);
        add(aceptarconfig);

        setVisible(true);
    }

    public String getResolucion() {
        return resolucion;
    }

    public String getCalidad() {
        return calidad;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
