public class HelloAudio {
	public static void main(String[] args) {

		int SAMPLING_RATE = 44100;	//частота
		int hz = 440;			//нота ля
		double duration = 10.0;		//звучит 10 секунд
		int n = (int)(SAMPLING_RATE * duration);
		double[] a = new double[n+1];

		for (int i = 0; i<=n; i++) {
			a[i] = Math.sin(2*Math.PI * i * hz / SAMPLING_RATE);
		}
		StdAudio.play(a);

	}
}