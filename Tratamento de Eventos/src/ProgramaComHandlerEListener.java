import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaComHandlerEListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Programa com Handler e Listener");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLayout(new FlowLayout());

            JTextField textField = new JTextField(20);
            JButton button = new JButton("Clique aqui");

            // Adicionando listener ao botão
            button.addActionListener(new MeuActionListener(textField));

            frame.add(textField);
            frame.add(button);

            frame.setVisible(true);
        });
    }
}

// Implementação do ActionListener personalizado
class MeuActionListener implements ActionListener {
    private final JTextField textField;

    public MeuActionListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ação a ser realizada quando o botão for clicado
        String textoAtual = textField.getText();
        JOptionPane.showMessageDialog(null, "Texto atual: " + textoAtual);
    }
}
