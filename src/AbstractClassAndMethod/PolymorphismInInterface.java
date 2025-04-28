package AbstractClassAndMethod;

interface GpsPro{
    void trackLocation();
    void viewMap();
}
interface CameraPro{
    void takeSnap();
    void recordVideo();
}
interface MXPlayerPro{
    void playMusic();
    String[] showMusicList();
}

class MyCellPhonePro{
    int CallNumber(int num){
        System.out.println("Show My Number..calling "+num);
        return num;
    }
    void pickCall(){
        System.out.println("Pick My Call....");
    }
}

class MySmartPhonePro extends AbstractClassAndMethod.MyCellPhone implements Gps, Camera, MXPlayer {
    public void insta(){
        System.out.println("Show Instagram reels...");
    }
    public void trackLocation(){
        System.out.println("Your Phone is In " + "+" +"Pune" +"+"+" recently");
    }
    public void viewMap(){
        System.out.println("Here is the Shortest path for your...enjoy your Journey >_<");
    }

    public void takeSnap(){
        System.out.println("Clicking Your Pictures...");
    }
    public void recordVideo(){
        System.out.println("Making reels On Instagram");
    }

    public void playMusic(){
        System.out.println("Playing Tum Prem Ho Tum Preet Ho From radhaKrishn");
    }
    public String[] showMusicList(){
        System.out.println("Listing Your Favourite Music List here...");
        String [] musicList={"Dil","Jaruri tha","RadhaKrishna","Piya","Tum Prem Ho Tum Preet Ho"};
        for (String list:musicList){
            System.out.println(list);
        }
        return musicList;
    }
}

public class PolymorphismInInterface {
    public static void main(String[] args) {
       Camera cam=new MySmartPhonePro();  //This I SmartPhone byt Your Can Now Use it As a Camera....This is Poly
       cam.takeSnap();   //can only call camera method by camera object
    }
}
