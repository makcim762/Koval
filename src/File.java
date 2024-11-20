class File extends FileSystemObject {
    private long size; // Розмір файлу в байтах

    public File(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void printStructure(String prefix) {
        System.out.println(prefix + "- " + name + " (" + size + " bytes)");
    }
}