package com.jofish.game.Init;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JoFish extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int SCREEN_WIDTH, SCREEN_HEIGHT;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("title_jofish.png");
		SCREEN_WIDTH = Gdx.graphics.getWidth();
		SCREEN_HEIGHT = Gdx.graphics.getHeight();
	}

	@Override
	public void render () {
		renderBackgroundColor(100, 100, 50, 1);
		renderImage(img, (SCREEN_WIDTH/2)-(img.getWidth()/2), (SCREEN_HEIGHT/2)-(img.getHeight()/2));
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	private void renderBackgroundColor(int r, int g, int b, int a) {
		Gdx.gl.glClearColor(r, g, b, a);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	private void renderImage(Texture texture, int x, int y) {
		batch.begin();
		batch.draw(texture, x, y);
		batch.end();
	}
}
