package ch2.exercise;

public class pb04 {
	// ÁßÃ¸ Å¬·¡½º
	private static class IntHolder {
		private int value;

		IntHolder() {
			this(0);
		}

		IntHolder(int val) {
			this.value = val;
		}

		int getValue() {
			return this.value;
		}

		void setValue(int val) {
			this.value = val;
		}
	}

	public static void main(String[] args) {
		iHolderChange(5, 10);
	}

	private static void iHolderChange(int i, int j) {
		IntHolder iHolder = new IntHolder(i);
		IntHolder iHolder2 = new IntHolder(j);
		IntHolder iHolderTemp = new IntHolder();

		System.out.println("before object value change");
		System.out.println("iHolder object: " + iHolder.getValue());
		System.out.println("iHolder2 object: " + iHolder2.getValue());
		System.out.println();

		iHolderTemp.setValue(iHolder.getValue());
		iHolder.setValue(iHolder2.getValue());

		System.out.println("after object value change");
		System.out.println("iHolder object: " + iHolder.getValue());
		System.out.println("iHolder2 object: " + iHolderTemp.getValue());
	}
}
