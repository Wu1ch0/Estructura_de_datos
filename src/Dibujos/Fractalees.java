package Dibujos;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

    public class Fractalees extends JPanel {

        private static final int WIDTH = 800;
        private static final int HEIGHT = 800;
        private static final int MAX_ITER = 1000;
        private static final double ZOOM = 100.0;
        private static final double X_OFFSET = -0.5;
        private static final double Y_OFFSET = -1;

        private BufferedImage image;

        public Fractalees() {
            image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
            generateMandelbrot();
        }

        private void generateMandelbrot() {
            for (int x = 0; x < WIDTH; x++) {
                for (int y = 0; y < HEIGHT; y++) {
                    double zx = 0;
                    double zy = 0;
                    double cX = (x - WIDTH / 2.0) / ZOOM + X_OFFSET;
                    double cY = (y - HEIGHT / 2.0) / ZOOM + Y_OFFSET;
                    int iter = 0;

                    while (zx * zx + zy * zy < 4 && iter < MAX_ITER) {
                        double temp = zx * zx - zy * zy + cX;
                        zy = 2.0 * zx * zy + cY;
                        zx = temp;
                        iter++;
                    }

                    if (iter < MAX_ITER) {
                        int color = Color.HSBtoRGB((float) iter / MAX_ITER, 1, 1);
                        image.setRGB(x, y, color);
                    } else {
                        image.setRGB(x, y, Color.BLACK.getRGB());
                    }
                }
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Mandelbrot Set");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Fractalees());
                frame.pack();
                frame.setVisible(true);
            });
        }
    }
