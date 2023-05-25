package at.tsa.games.firstgame;

import org.newdawn.slick.*;


public class ObjectsGame extends BasicGame {

    private Rectangle rectangle;
    public ObjectsGame(String title)
    {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {
        this.rectangle = new Rectangle(100, 100, 5.0f);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException
    {
        this.rectangle.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {
        this.rectangle.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException var2) {
            var2.printStackTrace();
        }

    }
}