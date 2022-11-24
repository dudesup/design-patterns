package behavioral_patterns.observer.editor;

import behavioral_patterns.observer.publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager events;
    public File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first");
        }
    }
}
