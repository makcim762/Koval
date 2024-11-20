import java.util.ArrayList;
import java.util.List;

class Folder extends FileSystemObject {
    private List<FileSystemObject> contents;

    public Folder(String name) {
        super(name);
        this.contents = new ArrayList<>();
    }

    public void add(FileSystemObject obj) {
        contents.add(obj);
    }

    public void remove(FileSystemObject obj) {
        contents.remove(obj);
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemObject obj : contents) {
            totalSize += obj.getSize();
        }
        return totalSize;
    }

    @Override
    public void printStructure(String prefix) {
        System.out.println(prefix + "+ " + name);
        for (FileSystemObject obj : contents) {
            obj.printStructure(prefix + "  ");
        }
    }
}