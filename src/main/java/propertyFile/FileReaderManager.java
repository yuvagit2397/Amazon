package propertyFile;

import java.io.IOException;

public class FileReaderManager {
private FileReaderManager() {
	
}

public static confiqReader getConfiqInstance() {
	confiqReader cr=new confiqReader();
	return cr;
}

}
