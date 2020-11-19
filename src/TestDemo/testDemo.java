package TestDemo;

public enum testDemo {

    partone("you are the most precious thing in my life"),
    parttwo("without you i can't face life");

    private String msg;

    private testDemo(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    public static void main(String[] args) {
		
	}
}
