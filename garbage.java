class garbage {
    public void finalize() {
        System.out.println("Object Memory is released");
    }
    public static void main(String args[]) {
        garbage obj = new garbage();
        garbage obj1 = new garbage();
        obj = null;
        obj1 = null;
        System.gc();
    }
}
