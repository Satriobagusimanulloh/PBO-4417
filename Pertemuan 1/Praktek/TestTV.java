public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volume);
    }
}

class TV {
    public int volume = 1;
    public int channel = 1;
    public boolean power = false;

    public TV(){

    }

    //Methods
    public void turnOn() {
        power = true;
    }
      
    public void turnOff() {
        power = false;
    }

	public void setChannel(int newChannel){
        if (power && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }
    
	public void setVolume(int newVolumeLevel){
        if (power && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volume = newVolumeLevel;
        }
    }
    
    public void channelUp(){
        if (power && channel < 120) {
            channel+=1;
        }
    }

    public void channelDown(){
        if (power && channel > 1){
            channel-=1;
        }
    }

	public void volumeUp(){
        if (power && volume < 7){
            volume+=1;
        }
    }
    
	public void volumeDown(){
		if (power && volume > 1){
            volume-=1;
        }
    }
}