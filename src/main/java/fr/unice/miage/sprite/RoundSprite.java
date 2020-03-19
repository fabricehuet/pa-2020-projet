package fr.unice.miage.sprite;

import fr.unice.miage.game.GameBoard;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class RoundSprite extends Sprite {
	
	private int diameter; 

	public RoundSprite(double x, double y, double speedX, double speedY, int diameter) {
		super(x, y, speedX, speedY);
		this.diameter = diameter;
	}

	
	@Override
	public void update(double time, GameBoard b) {
		super.update(time, b);
		if ((this.x+diameter)>b.getWidth() || (this.x) < 0) {
			this.speedX=-this.speedX;
		}
		if ((this.y+diameter)>b.getWidth() || (this.y) < 0) {
			this.speedY=-this.speedY;
		}
	}
	
	@Override
	public void render(GraphicsContext gc) {
		gc.strokeOval(x,y, diameter, diameter);

		gc.fillOval(x, y, diameter, diameter);

	}


	@Override
	public void handleCollision(GameBoard b, Sprite p) {
		System.out.println("RoundSprite.handleCollision()");
	}


	@Override
	public Shape getBoundingShape() {
		return new Rectangle(x,y,diameter,diameter);
		
	}

}
