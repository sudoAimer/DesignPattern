package sy2_2;
public class FileOut extends OutPut {
    @Override
    public void output(String system, String language) {
        String means="以File方式输出";
        System.out.println("在"+system+"用"+language+"以"+means);
    }
}
