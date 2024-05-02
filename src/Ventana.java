import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

public class Ventana {
    private JPanel Ventana;
    private JTextField textCedula;
    private JTextField textNombre;
    private JTextField textEdad;
    private JComboBox comboGenero;
    private JComboBox comboRegion;
    private JButton ingresarButton;
    private JList listPersonas;
    private JTextArea textArea1;
    public Cola colaPersonas = new Cola();
    DefaultListModel dlm = new DefaultListModel<>();
    public Ventana(){

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colaPersonas.encolar(Integer.parseInt(textCedula.getText()),textNombre.getText(),
                        Integer.parseInt(textEdad.getText()),comboGenero.getSelectedItem().toString(),comboRegion.getSelectedItem().toString());
                try {
                    textArea1.setText(colaPersonas.listarPersonas());
                    colaPersonas.validacionCedula();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void llenarJlist(){
        dlm.removeAllElements();
        List<PersonaEmilioBonilla> listaGente = colaPersonas.listadoPersonas();
        Collections.sort(listaGente);
        for(PersonaEmilioBonilla p:listaGente){
            dlm.addElement(p);
        }
        listPersonas.setModel(dlm);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
