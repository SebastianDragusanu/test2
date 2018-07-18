package scenes;

import com.badlogic.gdx.Screen;
import com.mygdx.dsf.GameMain;

public class MainMenu implements Screen {

    private GameMain main;

    public MainMenu(GameMain game){
        this.game;
        bg = new Texture("dsf.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.getBatch().begin();
        game.getBatch().draw(bg, 0 , 0);
        game.getBatch().end;


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
} //main menu






















