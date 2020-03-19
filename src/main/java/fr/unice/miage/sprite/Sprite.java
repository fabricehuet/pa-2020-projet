package fr.unice.miage.sprite;


import fr.unice.miage.game.GameBoard;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Shape;

public abstract class Sprite {
	protected double x;
	protected double y;
	protected double speedX;
	protected double speedY;

	public Sprite(double x, double y, double speedX, double speedY) {
		super();
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY; 
	}

	public void update(double time, GameBoard b) {
		x += speedX * time;
		y += speedY * time;
	}

	public abstract Shape getBoundingShape() ;
	
	public abstract void render(GraphicsContext gc);
	
	public abstract void handleCollision(GameBoard b, Sprite p);
	
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSpeedX() {
		return speedX;
	}

	public void setSpeedX(double speed) {
		this.speedX = speed;
	}

	public double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(double speed) {
		this.speedY = speed;
	}

}
