import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ShareAction extends AnAction {

    @Override
    public void actionPerformed(@org.jetbrains.annotations.NotNull AnActionEvent anActionEvent) {
        Messages.showMessageDialog("Do you want to repost the code?", "Repost", Messages.getQuestionIcon());

        String code = anActionEvent.getData(PlatformDataKeys.FILE_TEXT);

        anActionEvent.getData(PlatformDataKeys.FILE_TEXT);

        String url = String.format("https://telegram.me/share/url?url=```%s```", code);

        BrowserUtil.browse(url);
    }

    @Override
    public boolean isDumbAware() {
        return super.isDumbAware();
    }
}
