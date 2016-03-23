package teletext.interfaces;

/**
 * Created by domin_000 on 22.03.2016.
 */
public interface IHeadlineRenderManager extends IRenderManager {
    void updateAllRendererPageInput(String pageInput);
    void updateAllRendererCurrentPage(String currentPageNumber);
}
