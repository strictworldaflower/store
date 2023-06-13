package page;

import cart.Cart;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CartAddItemPage extends JPanel {

    ImageIcon imageBook;
    int mSelectRow = 0;
    Cart mCart;

    public CartAddItemPage(JPanel panel, Cart cart) {
        Font ft;
        ft = new Font("함초롬돋움", Font.BOLD., 15);

        setLayout(null);

        Rectangle rect = panel.getBounds();
        System.out.println(rect);
        setPreferredSize(rect.getSize());

        mCart = cart;

        JPanel imagePanel = new JPanel();
        imagePanel.setBounds(20, 0, 300, 400);
        imageBook = new ImageIcon("/images/ITEM1234.jpg");
        imageBook.setImage(imageBook.getImage().getScaledInstance(250,
                300, Image.SCALE_DEFAULT));
        JLabel label = new JLabel(imageBook);
        imagePanel.add(label);
        add(imagePanel);

        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(300, 0, 700, 400);
        add(tablePanel);

        ArrayList
    }

    }
}
