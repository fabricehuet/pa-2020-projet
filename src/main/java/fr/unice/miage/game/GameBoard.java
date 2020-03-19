package fr.unice.miage.game;

import java.util.ArrayList;
import java.util.Iterator;

import fr.unice.miage.sprite.Sprite;

public class GameBoard {

	private int width;
	private int height;

	private ArrayList<Sprite> list = new ArrayList<>();
	
	public GameBoard(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	public void addSprite(Sprite p) {
		this.list.add(p);
	}
	
	public Iterator<Sprite> spriteIterator() {
		return list.iterator();
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
