package sy3_4;

public class Client {
    public static void main(String args[]) {
        UN wto = new WTO();
        UN wfc = new WFC();
        UN who = new WHO();

        Country [] co=new Country[5];
        co[0]=new China();
        co[1]=new Japan();
        co[2]=new America();
        co[3]=new England();

        for(int i=0;i<co.length-1;i++) {
            wto.addCountry(co[i]);
            who.addCountry(co[i]);
            wfc.addCountry(co[i]);
        }

        for(int i=0;i<co.length-1;i++) {
            co[i].setWfc(wfc);
            co[i].setWho(who);
            co[i].setWto(wto);
        }

        co[0].SendMessageByWTO("Japan", "通过 WTO");
        co[1].SendMessageByWHO("England","通过 WHO");
        co[2].SendMessageByWFC("China", "通过 WFC");
        co[3].SendMessageByWFC("China", "通过 WFC");

    }
}
