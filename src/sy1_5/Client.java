package sy1_5;

public class Client {
    public static void main(String[]args) {
        BeiFangCook beiFangCook = new BeiFangCook();
        ChaoCai chaoCai1 = beiFangCook.produceChaoCai();
        chaoCai1.chao();
        DunCai dunCai1 = beiFangCook.produceDunCai();
        dunCai1.dun();
        NanFangCook nanFangCook = new NanFangCook();
        ChaoCai chaoCai2 = nanFangCook.produceChaoCai();
        chaoCai2.chao();
        DunCai dunCai2 = nanFangCook.produceDunCai();
        dunCai2.dun();
    }
}
