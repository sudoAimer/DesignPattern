package sy3_4;
import java.util.Hashtable;

public abstract class UN {
    protected String name;
    protected Hashtable<String,Country> countries;

    public UN() {
        this.countries = new Hashtable<String,Country>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCountry(Country co) {
        if(countries == null) {
            return;
        }
        countries.put(co.getName(),co);
    }

    public void delCountry(String co) {
        if(countries == null) {
            return;
        }
        countries.remove(co);
    }

    public void delCountry(Country co) {
        if(countries == null) {
            return;
        }
        countries.remove(co.getName());
    }

    public void sendMessage(String from,String to,String msg) {
        Country co = countries.get(to);
        if(co != null) {
            co.ReceiveMessage(from,msg);
        }
        else {
            System.out.println("Sorry, "+from+" isn't in UN");
        }
    }

    public void ReceiveMessage(String from,String to,String msg) {
        sendMessage(from,to,msg);
    }
}