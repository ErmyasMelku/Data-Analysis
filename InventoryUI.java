import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

    public class InventoryUI extends JFrame {

        private JPanel mainPanel;
        private JPanel titlePanel;
        private JPanel productPanel;
        private JPanel buttonPanel;

        private JLabel titleLabel;
        private JLabel productLabel;
        private JLabel quantityLabel;
        private JTextField productName;
        private JTextField productQuantity;
        private JButton addButton;
        private JButton viewButton;

        public InventoryUI() {
            super("Inventory Management System");

            // Set up the main panel
            mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            // Set up the title panel
            titlePanel = new JPanel();
            titleLabel = new JLabel("Inventory Management System");
            titleLabel.setFont(new Font("Verdana", Font.BOLD, 24));
            titlePanel.add(titleLabel);

            // Set up the product panel
            productPanel = new JPanel();
            productLabel = new JLabel("Product Name:");
            quantityLabel = new JLabel("Quantity:");
            productName = new JTextField(20);
            productQuantity = new JTextField(10);
            productPanel.add(productLabel);
            productPanel.add(productName);
            productPanel.add(quantityLabel);
            productPanel.add(productQuantity);

            // Set up the button panel
            buttonPanel = new JPanel();
            addButton = new JButton("Add");
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Add the product to the inventory
                }
            });
            viewButton = new JButton("View");
            viewButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // View the inventory
                }
            });
            buttonPanel.add(addButton);
            buttonPanel.add(viewButton);

            // Add the panels to the main panel
            mainPanel.add(titlePanel, BorderLayout.NORTH);
            mainPanel.add(productPanel, BorderLayout.CENTER);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            // Add the main panel to the frame
            getContentPane().add(mainPanel);

            // Set the frame size and visibility
            setSize(400, 300);
            setVisible(true);
        }

        @Override
        public void paint(Graphics g) {
            // Draw a box around the frame
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

            // Draw a chart in the center of the frame
            int x = (getWidth() - 200) / 2;
            int y = (getHeight() - 100) / 2;
            g.drawLine(x, y, x + 200, y);
            g.drawLine(x, y, x, y + 100);
            g.drawString("Quantity", x + 100, y + 50);
            g.drawString("Product Name", x + 50, y + 10);

            // Fill the box with a color
            g.setColor(Color.RED);
            g.fillRect(1, 1, getWidth() - 2, getHeight() - 2);
        }
    }

