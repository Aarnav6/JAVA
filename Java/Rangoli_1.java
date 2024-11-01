import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Rangoli_1 extends JPanel {

    private final int width = 800;
    private final int height = 800;
    private final int layers = 6;
    private final Random rand = new Random();

    public Rangoli_1() {
        setPreferredSize(new Dimension(width, height));
    }

    private Color getRandomColor() {
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 180);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = width / 2;
        int centerY = height / 2;
        int baseRadius = 40;

        for (int i = 0; i < layers; i++) {
            int radius = baseRadius + i * 60;

            g2d.setColor(getRandomColor());
            g2d.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

            int petalRadius = (int) (radius * 0.5);
            for (int j = 0; j < 12; j++) {
                double angle = Math.toRadians(j * 30);
                int petalX = centerX + (int) (radius * Math.cos(angle)) - petalRadius;
                int petalY = centerY + (int) (radius * Math.sin(angle)) - petalRadius;

                g2d.setColor(getRandomColor());
                g2d.fillOval(petalX, petalY, 2 * petalRadius, 2 * petalRadius);
            }

            int starRadius = petalRadius / 2;
            for (int k = 0; k < 12; k++) {
                double starAngle = Math.toRadians(k * 30 + 15);
                int starX = centerX + (int) ((radius + petalRadius / 2) * Math.cos(starAngle)) - starRadius;
                int starY = centerY + (int) ((radius + petalRadius / 2) * Math.sin(starAngle)) - starRadius;

                g2d.setColor(getRandomColor());
                g2d.fillPolygon(createStar(starX, starY, starRadius, 5));
            }

            int miniCircleRadius = petalRadius / 4;
            for (int m = 0; m < 24; m++) {
                double miniAngle = Math.toRadians(m * 15);
                int miniX = centerX + (int) ((radius + petalRadius) * Math.cos(miniAngle)) - miniCircleRadius;
                int miniY = centerY + (int) ((radius + petalRadius) * Math.sin(miniAngle)) - miniCircleRadius;

                g2d.setColor(getRandomColor());
                g2d.fillOval(miniX, miniY, 2 * miniCircleRadius, 2 * miniCircleRadius);
            }
        }
    }

    private Polygon createStar(int x, int y, int radius, int points) {
        Polygon star = new Polygon();
        for (int i = 0; i < points * 2; i++) {
            double angle = Math.PI / points * i;
            int r = (i % 2 == 0) ? radius : radius / 2;
            int xOffset = x + (int) (Math.cos(angle) * r);
            int yOffset = y + (int) (Math.sin(angle) * r);
            star.addPoint(xOffset, yOffset);
        }
        return star;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Complex Colorful Rangoli");
        Rangoli_1 rangoli = new Rangoli_1();
        frame.add(rangoli);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
