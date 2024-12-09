public class Main {
    private static Employee[] mac = new Employee[10];
    private static String[] surname = {"Petrov", "Semenov", "Orlov", "Logvinov"};
    private static String[] name = {"Ivan", "Nikita", "Pavel"};

    public static void tooString(){
        for(int i = 0; i<mac.length; i++) {
            System.out.println(mac[i].toString());
        }
    }
    public static int sumZp(){
        int m = 0;
        for(int i = 0; i< mac.length;i++){
            m += mac[i].getZp();
        }
        return m;
    }

    public static int maxZp(){
        int tmp = 0;
        int store = 0;
        int ansv = 0;
        for(int i = 0; i< mac.length;i++){
            store = mac[i].getZp();
            if(tmp<store){
                ansv = i;
                tmp = store;
            }
        }
        mac[ansv].toString();
        return ansv;
    }
    public static int minZp(){
        int tmp = 1000000000;
        int store = 0;
        int ansv = 0;
        for(int i = 0; i< mac.length;i++){
            store = mac[i].getZp();
            if(tmp>store){
                ansv = i;
                tmp = store;
            }
        }
        mac[ansv].toString();
        return ansv;
    }
    public static int midZp(){
        return sumZp()/ mac.length;
    }
    public static void allFio(){
        for(int i = 0; i< mac.length;i++) {
            System.out.println(mac[i].getFio());
        }
    }

    public static void index(int proc){
        for(int i = 0; i< mac.length;i++) {
            mac[i].setZp(mac[i].getZp()+mac[i].getZp()/100*proc);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i<mac.length; i++) {
            mac[i] = new Employee(surname[i%4]+" "+name[i%3], i%5+1, (i+(10-i*2)+1)*100);
        }
        tooString();
        System.out.println(sumZp());
        System.out.println(minZp());
        System.out.println(maxZp());
        System.out.println(midZp());
        allFio();
        index(50);
        tooString();

    }
}