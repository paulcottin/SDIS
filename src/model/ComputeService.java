package model;

public class ComputeService {

	private static ComputeService instance;
	
	private ComputeService(){
		
	}
	
	public static ComputeService getInstance() {
		if (instance == null) {
			instance = new ComputeService();
		}
		return instance;
	}
	
	public int compute(int left, int right) {
		return left + right;
	}
}
