import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;

class TextFieldTest extends JFrame
{
    // Текстовые поля
    JTextField smallField;

    public TextFieldTest()
    {
        super("Текстовые поля");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание текстового поля
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");

        // Слушатель окончания ввода
        smallField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                JOptionPane.showMessageDialog(TextFieldTest.this,
                        "Ваши числа " + smallField.getText());
            }
        });

        // Создание панели с текстовыми полями
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(300, 300);
        setVisible(true);

    }
    public static void main(String[] args) {
        new TextFieldTest();
    }
}
