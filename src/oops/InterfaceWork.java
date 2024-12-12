package oops;
interface TVRemote{
	public void powerOn();
    public void powerOff();
    public void changeChannel();
    
}
interface SmartTvRemote extends TVRemote{
	public void browseInternet(String website);
	public void launchapp(String appName);
	
}
class TV implements SmartTVRemote{
	
}

	


public class InterfaceWork {

	public static void main(String[] args) {
		
	}

}
