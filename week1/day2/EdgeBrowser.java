package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser accessBrowser = new Browser();
		System.out.println("From EdgeBrowser Class"+ "\n");
		accessBrowser.launchBrowser("Firefox");
		accessBrowser.loadUrl();
	}

}
