package sy2_2;
public abstract class Language {
    OutPut output;//包含Output的引用
    public void setOuPut(OutPut out)
    {
        this.output=out;
    }
    public abstract void language(String system);
}
