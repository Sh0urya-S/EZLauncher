package ezlauncher;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class ezlaunchermain {
    private JFrame frame;
    private JPanel buttonPanel;
    private int buttonCount = 0;

    public ezlaunchermain() {
        frame = new JFrame("EZLauncher");
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        Rectangle maxBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        int taskbarHeight = screenSize.height - maxBounds.height;
        
        frame.setSize(screenWidth, screenHeight - taskbarHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        buttonPanel = new JPanel(new GridLayout(3, 3));

        frame.add(buttonPanel, BorderLayout.CENTER);

        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showInputDialog();
            }
        });

        frame.add(addButton, BorderLayout.NORTH);

        frame.setVisible(true);
    }

    private void showInputDialog() {
        String name = JOptionPane.showInputDialog(frame, "Enter Name:");
        String location = JOptionPane.showInputDialog(frame, "Enter Location:");

        if (name != null && location != null) {
            createFileButton(name, location);
        }
    }

    private void createFileButton(String name, String location) {
        if (buttonCount < 9) {
            JButton fileButton = new JButton(name);
            fileButton.setLayout(new BorderLayout());

            JButton closeButton = new JButton("X");
            closeButton.setBorderPainted(false);
            closeButton.setContentAreaFilled(false);
            closeButton.setFocusPainted(false);
            closeButton.setOpaque(false);

            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonPanel.remove(fileButton);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                    buttonCount--;
                    realignButtons();
                }
            });

            fileButton.add(closeButton, BorderLayout.EAST);
            fileButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    openFile(location);
                }
            });

            buttonPanel.add(fileButton);
            frame.revalidate();
            buttonCount++;
        }
    }

    private void openFile(String location) {
        try {
            File file = new File(location);
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Unable to open the file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void realignButtons() {
        Component[] components = buttonPanel.getComponents();
        buttonPanel.removeAll();

        for (Component component : components) {
            if (component instanceof JButton) {
                buttonPanel.add(component);
            }
        }

        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ezlaunchermain();
            }
        });
    }
}
