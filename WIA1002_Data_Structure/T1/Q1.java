public class Q1 {
    public class Container<T> {
        private T t;

        Container() {

        }

        public void setT(T t) {
            this.t = t;
        }

        public T getT() {
            return t;
        }

        public static void main(String[] args) {
            Container<Integer> integerContainer = new Container<Integer>();
            Container<String> stringContainer = new Container<String>();

        }
    }
}