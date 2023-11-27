import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.ui.Messages;
public class ShareOnVKAction extends AnAction {

    @Override
    public void actionPerformed(@org.jetbrains.annotations.NotNull AnActionEvent anActionEvent) {
        Messages.showYesNoDialog("Do you want to share the code on VK?", "Sharing", Messages.getQuestionIcon());

        String code = anActionEvent.getData(PlatformDataKeys.FILE_TEXT);

        String url = String.format("https://vk.com/share.php?comment=%s", code);

        BrowserUtil.browse(url);
    }

    @Override
    public boolean isDumbAware() {
        return super.isDumbAware();
    }
}
