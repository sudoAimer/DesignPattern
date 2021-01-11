package sy1_5;

public class BeiFangCook implements Cook {

    @Override
    public ChaoCai produceChaoCai() {
        return new BeiFangChaoCai();
    }

    @Override
    public DunCai produceDunCai() {
        return new BeiFangDunCai();
    }
}
