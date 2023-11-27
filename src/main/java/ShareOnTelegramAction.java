import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.ui.Messages;
public class ShareOnTelegramAction extends AnAction {

    @Override
    public void actionPerformed(@org.jetbrains.annotations.NotNull AnActionEvent anActionEvent) {
        if (Messages.showYesNoDialog("Do you want to share the code on Telegram?", "Sharing", Messages.getQuestionIcon()) != 0) {
            return;
        }

        String code = anActionEvent.getData(PlatformDataKeys.FILE_TEXT);

        if (code == null) {
            Messages.showErrorDialog("File not selected", "Failed to Share");
            return;
        }

        String url = String.format("https://telegram.me/share/url?url=```%s```", code);

        BrowserUtil.browse(url);
    }

    @Override
    public boolean isDumbAware() {
        return super.isDumbAware();
    }
}
