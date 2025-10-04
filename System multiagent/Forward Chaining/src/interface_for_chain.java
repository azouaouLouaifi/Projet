import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class interface_for_chain extends JFrame{

    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public interface_for_chain() {
        // Titre de la fen�tre
        super("Ma Fen�tre");

        // Cr�er les composants
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        button = new JButton("Ok");

        // Cr�er le conteneur principal
        JPanel panel = new JPanel(new GridLayout(0, 1));
       

        // Ajouter les composants au conteneur
        panel.add(new JLabel("Fait base:"));
        panel.add(textField1);
        panel.add(new JLabel("Fait to prove:"));
        panel.add(textField2);
        panel.add(button);

        // Ajouter le conteneur � la fen�tre
        add(panel);

        // Action � effectuer lorsque le bouton est cliqu�
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
               
            }
        });
        

        // Configurer la fen�tre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setResizable(false);
    }
   
    
    
}
