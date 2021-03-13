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