package teletext.interfaces;

/**
 * Created by richie on 10/03/16.
 */
public interface IRenderer {

    void renderContent(TeletextCell[][] content);
    void renderCurrentPage(String currentPage);
    void renderPageInput(String pageInput);

}
