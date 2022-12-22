
// Пример диалогового окна входа в систему
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task163 extends JDialog {
    private static final long serialVersionUID = 1L;

    public JTextField tfLogin, tfPassword;
    public JButton btnOk, btnCancel;

    public task163(JFrame parent) {
        super(parent, "Вход в систему");
        // При выходе из диалогового окна работа заканчивается
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        // добавляем расположение в центр окна
        getContentPane().add(createGUI());
        // задаем предпочтительный размер
        pack();
        // выводим окно на экран
        setVisible(true);
    }

    // Класс для работы с менеджером расположением

    public class BoxLayoutUtils

    {
        // Выравнивание компонентов по оси X для группы компонентов
        public static void setGroupAlignmentX(JComponent[] components, float alignment) {
            for (int i = 0; i < components.length; i++)
                components[i].setAlignmentX(alignment);
        }

        // Выравнивание компонентов по оси Y для группы компонентов
        public static void setGroupAlignmentY(JComponent[] components, float alignment) {
            for (int i = 0; i < components.length; i++)
                components[i].setAlignmentY(alignment);
        }

        // Создание панели с вертикальным расположением
        public static JPanel createVerticalPanel() {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            return panel;
        }

        // Создание панели с горизонтальным расположением
        public static JPanel createHorizontalPanel() {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
            return panel;
        }

    }

    

    public class GUITools {
        /**
         * Метод определения отступа компонентов от границ слева и справа
         * 
         * @param buttons список кнопок
         */
        public static void createRecommendedMargin(JButton[] buttons) {
            for (int i = 0; i < buttons.length; i++) {
                // Объект Insets хранит расстояние от текста до границ кнопки
                Insets margin = buttons[i].getMargin();
                margin.left = 12;
                margin.right = 12;
                buttons[i].setMargin(margin);
            }
        }

        /**
         * Определение компонентам размера самого большого (по ширине) компонента в
         * группе
         * Метод придания группе компонентов одинаковых размеров (минимальных,
         * предпочтительных и максимальных).
         * 
         * @param components список компонентов
         */
        public static void makeSameSize(JComponent[] components) {
            // Массив компонентов
            int[] array = new int[components.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = components[i].getPreferredSize().width;
            }
            // Получение максимального размера
            int maxSizePos = maximumElementPosition(array);
            Dimension maxSize = components[maxSizePos].getPreferredSize();
            // Установка компонентам одинаковых размеров
            for (int i = 0; i < components.length; i++) {
                components[i].setPreferredSize(maxSize);
                components[i].setMinimumSize(maxSize);
                components[i].setMaximumSize(maxSize);
            }
        }

        // Корректировка размера текстового поля JTextField
        public static void fixTextFieldSize(JTextField field) {
            Dimension size = field.getPreferredSize();
            // чтобы текстовое поле по-прежнему могло увеличивать свой размер в длину
            size.width = field.getMaximumSize().width;
            // Определение максимального размера текстового поля
            field.setMaximumSize(size);
        }

        // Метод определения позиции максимального элемента массива
        private static int maximumElementPosition(int[] array) {
            int maxPos = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[maxPos])
                    maxPos = i;
            }
            return maxPos;
        }
    }

    // этот метод будет возвращать панель с созданным расположением
    private JPanel createGUI() {
        // Создание панели для размещение компонентов
        JPanel panel = BoxLayoutUtils.createVerticalPanel();
        // Определение отступов от границ ранели. Для этого используем пустую рамку
        panel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        // Создание панели для размещения метки и текстового поля логина
        JPanel name = BoxLayoutUtils.createHorizontalPanel();
        JLabel nameLabel = new JLabel("Имя:");
        name.add(nameLabel);
        name.add(Box.createHorizontalStrut(12));
        tfLogin = new JTextField(15);
        name.add(tfLogin);
        // Создание панели для размещения метки и текстового поля пароля
        JPanel password = BoxLayoutUtils.createHorizontalPanel();
        JLabel passwrdLabel = new JLabel("Пароль:");
        password.add(passwrdLabel);
        password.add(Box.createHorizontalStrut(12));
        tfPassword = new JTextField(15);
        password.add(tfPassword);
        // Создание панели для размещения кнопок управления
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        JPanel grid = new JPanel(new GridLayout(1, 2, 5, 0));
        btnOk = new JButton("OK");
        btnCancel = new JButton("Отмена");
        grid.add(btnOk);
        grid.add(btnCancel);
        flow.add(grid);
        // Выравнивание вложенных панелей по горизонтали
        BoxLayoutUtils.setGroupAlignmentX(new JComponent[] { name, password, panel, flow },
                Component.LEFT_ALIGNMENT);
        // Выравнивание вложенных панелей по вертикали
        BoxLayoutUtils.setGroupAlignmentY(new JComponent[] { tfLogin, tfPassword, nameLabel, passwrdLabel },
                Component.CENTER_ALIGNMENT);
        // Определение размеров надписей к текстовым полям
        GUITools.makeSameSize(new JComponent[] { nameLabel, passwrdLabel });
        // Определение стандартного вида для кнопок
        GUITools.createRecommendedMargin(new JButton[] { btnOk, btnCancel });
        // Устранение "бесконечной" высоты текстовых полей
        GUITools.fixTextFieldSize(tfLogin);
        GUITools.fixTextFieldSize(tfPassword);

        // Сборка интерфейса
        panel.add(name);
        panel.add(Box.createVerticalStrut(12));
        panel.add(password);
        panel.add(Box.createVerticalStrut(17));
        panel.add(flow);
        // готово
        return panel;
    }

    // тестовый метод для проверки диалогового окна
    public static void main(String[] args) {
        new task163(new JFrame());
    }
}
