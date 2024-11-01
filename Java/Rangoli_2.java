import java.awt.*;
import javax.swing.*;

public class Rangoli_2 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        setBackground(Color.WHITE);

        Color[] colors = {Color.RED, Color.ORANGE, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.CYAN, Color.YELLOW};

        drawFlower(g2d, centerX, centerY, 40, colors[0]);
        for (int i = 1; i <= 6; i++) {
            int radius = i * 40;
            drawDecoratedRing(g2d, centerX, centerY, radius, colors[i % colors.length]);
        }
        drawDiamonds(g2d, centerX, centerY, 170, colors[2]);
        drawLotusPetals(g2d, centerX, centerY, 220, colors[3]);
        drawZigZagBorder(g2d, centerX, centerY, 280, colors[4]);
    }

    private void drawFlower(Graphics2D g2d, int x, int y, int size, Color color) {
        g2d.setColor(color);
        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30);
            int petalX = x + (int) (Math.cos(angle) * size);
            int petalY = y + (int) (Math.sin(angle) * size);
            g2d.fillOval(petalX - size / 3, petalY - size / 3, size, size);
        }
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x - size / 2, y - size / 2, size, size);
    }

    private void drawDecoratedRing(Graphics2D g2d, int x, int y, int radius, Color color) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
        for (int i = 0; i < 18; i++) {
            double angle = Math.toRadians(i * 20);
            int dotX = x + (int) (Math.cos(angle) * radius);
            int dotY = y + (int) (Math.sin(angle) * radius);
            g2d.fillOval(dotX - 4, dotY - 4, 8, 8);
        }
    }

    private void drawDiamonds(Graphics2D g2d, int x, int y, int distance, Color color) {
        g2d.setColor(color);
        int diamondSize = 40;
        for (int i = 0; i < 4; i++) {
            double angle = Math.toRadians(i * 90);
            int diamondX = x + (int) (Math.cos(angle) * distance);
            int diamondY = y + (int) (Math.sin(angle) * distance);
            g2d.fillRect(diamondX - diamondSize / 2, diamondY - diamondSize / 2, diamondSize, diamondSize);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(diamondX - diamondSize / 4, diamondY - diamondSize / 4, diamondSize / 2, diamondSize / 2);
            g2d.setColor(color);
        }
    }

    private void drawLotusPetals(Graphics2D g2d, int x, int y, int distance, Color color) {
        g2d.setColor(color);
        for (int i = 0; i < 16; i++) {
            double angle = Math.toRadians(i * 22.5);
            int petalX = x + (int) (Math.cos(angle) * distance);
            int petalY = y + (int) (Math.sin(angle) * distance);
            g2d.fillOval(petalX - 15, petalY - 7, 30, 15);
        }
    }

    private void drawZigZagBorder(Graphics2D g2d, int x, int y, int radius, Color color) {
        g2d.setColor(color);
        for (int i = 0; i < 36; i++) {
            double angle = Math.toRadians(i * 10);
            int startX = x + (int) (Math.cos(angle) * radius);
            int startY = y + (int) (Math.sin(angle) * radius);
            int endX = x + (int) (Math.cos(angle + Math.toRadians(5)) * radius);
            int endY = y + (int) (Math.sin(angle + Math.toRadians(5)) * radius);
            g2d.drawLine(startX, startY, endX, endY);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rangoli Design");
        Rangoli_2 rangoliPanel = new Rangoli_2();
        frame.add(rangoliPanel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
