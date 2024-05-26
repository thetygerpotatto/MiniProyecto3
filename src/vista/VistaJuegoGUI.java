package vista;

import controlador.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Color;

public class VistaJuegoGUI extends JFrame implements VistaJuego {
    Container container;
    public JToggleButton RockButton;
    public JToggleButton PaperButton;
    public JToggleButton CissorsButton;
    JButton PlayButton;

    JPanel OptionsBoard;
    JPanel PlayBoard;

    public VistaJuegoGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        container = getContentPane();
        OptionsBoard = new JPanel();
        PlayBoard = new JPanel();

        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        OptionsBoard.setLayout(new GridLayout());
        PlayBoard.setLayout(new FlowLayout());

        RockButton = new JToggleButton("Piedra");
        PaperButton = new JToggleButton("Papel");
        CissorsButton = new JToggleButton("Tijera");
        PlayButton = new JButton("Jugar");

        container.add(OptionsBoard);
        container.add(PlayBoard);
        
        OptionsBoard.add(RockButton);
        OptionsBoard.add(PaperButton);
        OptionsBoard.add(CissorsButton);
        PlayBoard.add(PlayButton);
        
        RockButton.setBackground(new Color(0x4D7A97));
        PaperButton.setBackground(new Color(0x4D7A97));
        CissorsButton.setBackground(new Color(0x4D7A97));
    }

    @Override
    public void mostrarGanador(String ganador, String CpuOp) {
        JOptionPane.showMessageDialog(this, "El computador eligio: " + CpuOp);
        JOptionPane.showMessageDialog(this, ganador);
    }

    @Override
    public void mostrarVista(ControladorJuego control) {
        PlayButton.addActionListener(control);
        setVisible(true);
    }

    @Override
    public Opciones getOpcionP1() {
        Opciones op = null;

        if (RockButton.isSelected() ^ PaperButton.isSelected() ^ CissorsButton.isSelected()) {
            if (RockButton.isSelected()) op = Opciones.PIEDRA;
            if (PaperButton.isSelected()) op = Opciones.PAPEL;
            if (CissorsButton.isSelected()) op = Opciones.TIJERA;
        }

        RockButton.setSelected(false);
        PaperButton.setSelected(false);
        CissorsButton.setSelected(false);
        
        return op;
    }

}
