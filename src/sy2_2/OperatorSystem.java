package sy2_2;

public abstract class OperatorSystem {
    protected Language language;//包含Lauguage类的引用
    public void setlanguage(Language lang)
    {
        this.language=lang;
    }
    public abstract void log();
}
