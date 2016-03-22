package teletext.interfaces;

/**
 * Created by domin_000 on 22.03.2016.
 */
public interface IPluginRenderManager extends IRenderManager {
    void updateAllRendererContent(IPlugin plugin, Integer pagenumber);
}
