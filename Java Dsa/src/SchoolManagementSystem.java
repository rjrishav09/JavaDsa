import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.io.InputStream;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        new GameFrame();
    }
}

class GameFrame {
    private LinkedList<Point> snake;
    private Point fruit;
    private int direction; // 0 - Up, 1 - Right, 2 - Down, 3 - Left
    private boolean isGameOver;
    private int score;

    private final int WIDTH = 20;
    private final int HEIGHT = 20;

    public GameFrame() {
        snake = new LinkedList<>();
        snake.add(new Point(10, 10)); // Initial position of the snake
        fruit = new Point(5, 5); // Initial position of the fruit
        direction = 1; // Start moving to the right
        isGameOver = false;
        score = 0;

        runGame();
    }

    private void runGame() {
        Scanner scanner = new Scanner(System.in);

        while (!isGameOver) {
            // Display the game board
            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    Point p = new Point(x, y);
                    if (p.equals(snake.peekFirst())) {
                        System.out.print("O");
                    } else if (p.equals(fruit)) {
                        System.out.print("F");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            // Move the snake
            Point newHead = (Point) snake.peekFirst().clone();
            switch (direction) {
                case 0: // Up
                    newHead.translate(0, -1);
                    break;
                case 1: // Right
                    newHead.translate(1, 0);
                    break;
                case 2: // Down
                    newHead.translate(0, 1);
                    break;
                case 3: // Left
                    newHead.translate(-1, 0);
                    break;
            }

            // Check for collisions
            if (newHead.equals(fruit)) {
                // The snake ate the fruit
                score += 10;
                generateFruit();
            } else {
                snake.remove(snake.peekLast());
            }

            // Check for self-collision
            if (snake.contains(newHead) || newHead.x < 0 || newHead.x >= WIDTH || newHead.y < 0 || newHead.y >= HEIGHT) {
                isGameOver = true;
                System.out.println("Game Over. Your score: " + score);
                break;
            }

            snake.addFirst(newHead);

            // Change direction if a key is pressed
            if (1 >= 0) {
                char keyPressed = scanner.next().charAt(0);
                if (keyPressed == 'w' && direction != 2) direction = 0;
                if (keyPressed == 'd' && direction != 3) direction = 1;
                if (keyPressed == 's' && direction != 0) direction = 2;
                if (keyPressed == 'a' && direction != 1) direction = 3;
            }

            try {
                Thread.sleep(100); // Delay for smoother movement
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }

    private void generateFruit() {
        Random rand = new Random();
        do {
            fruit.setLocation(rand.nextInt(WIDTH), rand.nextInt(HEIGHT));
        } while (snake.contains(fruit));
    }
}
