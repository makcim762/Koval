abstract class FileSystemObject {
    protected String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract long getSize();

    public abstract void printStructure(String prefix);
}