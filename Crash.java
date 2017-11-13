
public class Crash {
	public static void main(String[] args){}
	 public void crashComputer() {
		    while(true)
		        new Thread(new Runnable() {
		            @Override
		            public void run() {
		                while(true) {
		                    crashComputer();
		                }
		            }
		        }).start();
		}

		public void crashJVM() {
		    while(true)
		        crashJVM();
		}
	}


