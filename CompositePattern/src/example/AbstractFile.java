package example;

public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract void rename(String name);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
