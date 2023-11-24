class InnerClass{
    static class Inner{
        String name;
        public Inner(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Inner a = new Inner("Andro");
        System.out.println(a.name);
    }
}