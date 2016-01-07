package model;

public class ComputeBean {

	private int right, left;
	private int result;
	
	public ComputeBean(int right, int left) {
		this.left = left;
		this.right = right;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
