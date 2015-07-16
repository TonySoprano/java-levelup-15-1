package lecture5;

import java.io.File;

/**
 * Created by User on 10.07.2015.
 */
public class FileExists {

    private String foundFile;
    private boolean fileSuccess = true;

    public FileExists (String foundFile)  {
        this.foundFile = foundFile;
    }

    public boolean fileExt () {
        File file = new File(foundFile);
        if (!file.exists() && !file.isFile()) {
            fileSuccess = false;
        }
        return fileSuccess;
    }
}
