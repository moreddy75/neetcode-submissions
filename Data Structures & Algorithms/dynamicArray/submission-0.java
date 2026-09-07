class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    // Constructor
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // Return element at index i
    public int get(int i) {
        return arr[i];
    }

    // Set element at index i
    public void set(int i, int n) {
        arr[i] = n;
    }

    // Add element at the end
    public void pushback(int n) {

        // If array is full, resize first
        if (size == capacity) {
            resize();
        }

        arr[size] = n;
        size++;
    }

    // Remove and return last element
    public int popback() {

        int removedElement = arr[size - 1];

        size--;

        return removedElement;
    }

    // Double the capacity
    public void resize() {

        capacity = capacity * 2;

        int[] newArray = new int[capacity];

        // Copy old elements
        for (int i = 0; i < size; i++) {
            newArray[i] = arr[i];
        }

        arr = newArray;
    }

    // Return current number of elements
    public int getSize() {
        return size;
    }

    // Return total capacity
    public int getCapacity() {
        return capacity;
    }
}
