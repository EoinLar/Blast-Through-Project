import java.awt.*;
/*
Eoin Lardner
----Blast through game----
Aim is to hit all white blocks with the ball
Bounce ball off panel
Paddle is controlled using mouse
If the ball passes the paddle a life is lost and a new ball is introduced
User has 3 lives to hit all of the blocks
If user loses 3 lives game is over
When game is over user is prompted to press any key to play again
*/
public class Main {
    public static void main(String[] args) {
        // initial values
        double paddleX=0.5, paddleY=0.02, paddleWidth=0.09, paddleHeight=0.05;
        double block1=0, block2=0, block3=0, block4=0, block5=0 , block6=0, block7=0, block8=0, block9=0 , block10=0;
        int score=0, numBalls=0, try_again=0;
        int lives=3;
        double rx = 0.5, ry = 0.40;     // position
        double vx = 0.008, vy = 0.01;     // velocity (slow)
        //double vx = 0.009, vy = 0.02;     // velocity (fast)
        double radius = 0.03;              // radius
        StdDraw.setCanvasSize(500, 500);
        //draw the background picture
        StdDraw.picture(0.5, 0.5, "red.png",1.0,1.0);
        //draw paddle
        StdDraw.filledRectangle(paddleX, paddleY, paddleWidth, paddleHeight);

        //loop forever until user shuts down game
        while(true)
        {
            paddleX = StdDraw.mouseX();
            StdDraw.picture(0.5, 0.5, "red.png",1.0,1.0);
            StdDraw.setPenColor(StdDraw.WHITE);
            if(block1==0)
            {
                StdDraw.filledRectangle(0.1,0.90 ,0.06 ,0.06 );
                if(rx<=0.1+0.06 && rx>=0.1-0.06 && ry>=0.90-0.06 && ry<=0.90 +0.06)
                {
                    score++;
                    block1=1;
                    vy = -vy;
                }
            }
            if(block2==0)
            {
                StdDraw.filledRectangle(0.3,0.90 ,0.06 ,0.06 );
                if(rx<=0.3+0.06 && rx>=0.3-0.06 && ry>=0.90-0.06 && ry<=0.90 +0.06)
                {
                    score++;
                    block2=1;
                    vy = -vy;
                }
            }
            if(block3==0)
            {
                StdDraw.filledRectangle(0.5,0.90 ,0.06 ,0.06 );
                if(rx<=0.5+0.06 && rx>=0.5-0.06 && ry>=0.90-0.06 && ry<=0.90 +0.06)
                {
                    score++;
                    block3=1;
                    vy = -vy;
                }
            }
            if(block4==0)
            {
                StdDraw.filledRectangle(0.7,0.90 ,0.06 ,0.06 );
                if(rx<=0.7+0.06 && rx>=0.7-0.06 && ry>=0.90-0.06 && ry<=0.90 +0.06)
                {
                    score++;
                    block4=1;
                    vy = -vy;
                }
            }
            if(block5==0)
            {
                StdDraw.filledRectangle(0.9,0.90 ,0.06 ,0.06 );
                if(rx<=0.9+0.06 && rx>=0.9-0.06 && ry>=0.90-0.06 && ry<=0.90 +0.06)
                {
                    score++;
                    block5=1;
                    vy = -vy;
                }
            }
            if(block6==0)
            {
                StdDraw.filledRectangle(0.1,0.70 ,0.06 ,0.06 );
                if(rx<=0.1+0.06 && rx>=0.1-0.06 && ry>=0.70-0.06 && ry<=0.70 +0.06)
                {
                    score++;
                    block6=1;
                    vy = -vy;
                }
            }
            if(block7==0)
            {
                StdDraw.filledRectangle(0.3,0.70 ,0.06 ,0.06 );
                if(rx<=0.3+0.06 && rx>=0.3-0.06 && ry>=0.70-0.06 && ry<=0.70 +0.06)
                {
                    score++;
                    block7=1;
                    vy = -vy;
                }
            }
            if(block8==0)
            {
                StdDraw.filledRectangle(0.5,0.70 ,0.06 ,0.06 );
                if(rx<=0.5+0.06 && rx>=0.5-0.06 && ry>=0.70-0.06 && ry<=0.70 +0.06)
                {
                    score++;
                    block8=1;
                    vy = -vy;
                }
            }
            if(block9==0)
            {
                StdDraw.filledRectangle(0.7,0.70 ,0.06 ,0.06 );
                if(rx<=0.7+0.06 && rx>=0.7-0.06 && ry>=0.70-0.06 && ry<=0.70 +0.06)
                {
                    score++;
                    block9=1;
                    vy = -vy;
                }
            }
            if(block10==0)
            {
                StdDraw.filledRectangle(0.9,0.70 ,0.06 ,0.06 );
                if(rx<=0.9+0.06 && rx>=0.9-0.06 && ry>=0.70-0.06 && ry<=0.70 +0.06)
                {
                    score++;
                    block10=1;
                    vy = -vy;
                }
            }
            if(score==10)
            {
                StdDraw.setPenColor(java.awt.Color.CYAN);
                StdDraw.setPenRadius(0.5);
                StdDraw.text(0.5, 0.5, "PRESS ANY KEY TO PLAY AGAIN");
                StdDraw.show(1500);
                while(try_again==0)
                {
                    if(StdDraw.hasNextKeyTyped())
                        try_again=1;
                }
                try_again=0;
                block1=0; block2=0; block3=0; block4=0; block5=0; block6=0; block7=0; block8=0; block9=0; block10=0;
                score=0;
                lives=3;
                rx = 0.5;
                ry = 0.40;
            }
            //bounce ball off wall
            //right hand side
            if (Math.abs(rx + vx ) > 1.1 - radius*4) {
                vx = -vx;

            }
            //Left-hand side
            if (rx + vx  < 0.0 - radius/50) {
                vx = -vx;

            }
            //top of screen
            if (Math.abs(ry + vy) > 1.1 - radius*4){
                vy = -vy;

            }
            //paddle
            if((Math.abs(ry + vy) - (Math.abs(paddleY) + paddleHeight) < 0.001) && (Math.abs(rx + vx) >= (Math.abs(paddleX) - paddleWidth))
                    && (Math.abs(rx + vx) <= (Math.abs(paddleX) + paddleWidth)))
            {
                vy = -vy;

            }
            // update position
            rx = rx + vx;
            ry = ry + vy;

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            //Draw the paddle
            StdDraw.setPenColor(StdDraw.BLUE);

            StdDraw.filledRectangle(paddleX, paddleY, paddleWidth, paddleHeight);

            StdDraw.setPenColor(java.awt.Color.BLACK);
            StdDraw.setPenRadius(0.2);
            StdDraw.text(0.1,0.1, " Your score:  " + score);

            StdDraw.setPenColor(java.awt.Color.BLACK);
            StdDraw.setPenRadius(0.2);
            StdDraw.text(0.9,0.1, " Lives:  " + lives);

            StdDraw.show(20);
            StdDraw.clear();

            //When the ball leaves the screen introduce a new ball
            if(ry + vy < 0)
            {
                numBalls++;
                rx = 0.5;
                ry = 0.40;
                StdDraw.picture(0.5, 0.5, "ghost.png",1.0,1.0);
                StdDraw.setPenColor(Color.CYAN);
                StdDraw.setPenRadius(0.5);
                StdDraw.text(0.5, 0.4, numBalls + " lives used");
                lives--;
                //If the user loses 3 lives....game over
                if(numBalls >=3)
                {
                    block1=0; block2=0; block3=0; block4=0; block5=0; block6=0; block7=0; block8=0; block9=0; block10=0;
                    try_again=0;
                    numBalls=0;
                    lives=3;
                    StdDraw.picture(0.5, 0.5, "red.png",1.0,1.0);
                    StdDraw.setPenColor(java.awt.Color.CYAN);
                    StdDraw.text(0.5, 0.5, "GAME OVER");
                    score=10;
                }
                StdDraw.show(2000);
            }
        }
    }
}