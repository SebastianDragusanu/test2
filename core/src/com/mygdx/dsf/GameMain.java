package com.mygdx.dsf;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.xml.soap.Text;

import helpers.GameInfo;

public class GameMain extends ApplicationAdapter {
	private SpriteBatch batch;
	Texture img;
	Sprite player;
	int a = 0;
	@Override
	public void create () {

		batch = new SpriteBatch();
		img = new Texture("dsf.png");
		player = new Sprite(new Texture("Player.png"));

		player.setPosition((GameInfo.WIDTH) - player.getWidth(), (GameInfo.HEIGHT/2) - player.getHeight()/2);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		player.setPosition(player.getX()-5, player.getY());
		a++;
		if(a > 100){
			player.setPosition((GameInfo.WIDTH) - player.getWidth(), (GameInfo.HEIGHT/2) - player.getHeight()-1);
			a = 0;
		}
		System.out.println("The car is moving! " + a);
		batch.begin();
		batch.draw(img, 0,0 );
		batch.draw(player, player.getX(), player.getY());
		batch.end();
	}

    public SpriteBatch getBatch() {
        return this.batch;
    }

    @Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
