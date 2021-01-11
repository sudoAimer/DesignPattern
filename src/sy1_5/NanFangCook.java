package sy1_5;

public class NanFangCook implements Cook {
    @Override
    public ChaoCai produceChaoCai() {
        return new NanFangChaoCai();
    }

    @Override
    public DunCai produceDunCai() {
        return new NanFangDunCai();
    }
}
