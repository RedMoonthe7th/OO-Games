package at.tsa.games.firstgame;

import org.newdawn.slick.*;


public class Rectangles extends BasicGame {

    private float xRect;
    private float yRect;
    private boolean xRectIsTrue;
    private boolean yRectIsTrue;
    private float xOval;
    private float yOval;
    private boolean OvalIsTrue;
    private float xCircle;
    private float yCircle;
    private boolean CircleIsTrue;
    private float speed;
    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException
    {
        this.xRect = 100;
        this.yRect = 100;
        this.xRectIsTrue = false;
        this.yRectIsTrue = false;

        this.xOval = 50;
        this.yOval = 0;
        this.OvalIsTrue = false;

        this.xCircle = 0;
        this.yCircle = 50;
        this.CircleIsTrue = false;

        this.speed = 5.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException
    {
        this.xRect = this.xRect + (float)delta / this.speed;
        //Rectangle

        //Oval
        if(this.xOval >=  700)
        {
            OvalIsTrue = false;
        } else if (this.xOval <= 100)
        {
            OvalIsTrue = true;
        }

        if (this.OvalIsTrue == true)
        {
            this.xOval = this.xOval + (float)delta / this.speed;
        }
        else if (this.OvalIsTrue == false)
        {
            this.xOval = this.xOval - (float)delta / this.speed;
        }
        //Circle
        if(this.yCircle >=  700)
        {
            CircleIsTrue = false;
        } else if (this.yCircle <= 100)
        {
            CircleIsTrue = true;
        }

        if (this.CircleIsTrue == true)
        {
            this.yCircle = this.yCircle + (float)delta / this.speed;
        }
        else if (this.CircleIsTrue == false)
        {
            this.yCircle = this.yCircle - (float)delta / this.speed;
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRect, this.yRect, 100, 100);
        graphics.drawOval(this.xOval, this.yOval, 75, 30);
        graphics.drawOval(this.xCircle, this.yCircle, 30, 30);
        graphics.drawString("Hello", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException var2) {
            var2.printStackTrace();
        }

    }
}
