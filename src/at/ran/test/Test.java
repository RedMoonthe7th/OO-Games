package at.ran.test;


import org.newdawn.slick.*;

public class Test extends BasicGame {
    public Test(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Test("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException var2) {
            var2.printStackTrace();
        }

    }
}
