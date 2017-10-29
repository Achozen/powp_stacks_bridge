package edu.kis.vh.stacks;

public class StackArray {
	private static final int FULL_STACK_VALUE = 11;

	private static final int STACK_SIZE = 12;

	private static final int EMPTY_STACK_VALUE = -1;

	private final int[] items = new int[STACK_SIZE];

	private int total = EMPTY_STACK_VALUE;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			getItems()[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return getItems()[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return getItems()[total--];
	}

	private int[] getItems() {
		return items;
	}
}