package teletext.interfaces;

/**
 * Created by richie on 10/03/16.
 */
public interface IRenderManager {

    void registerRenderer(IRenderer renderer);
    void unregisterRenderer(IRenderer renderer);

}
