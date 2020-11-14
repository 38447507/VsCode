public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping a =new Cat();
        a.jump();
        System.out.println("------------");

        Animal b=new Cat();
        b.setAge(4);
        b.setName("加菲");
        System.out.println(b.getAge()+","+b.getName());

        b.eat();
        
        b=new Cat("加菲",4);
        System.out.println(b.getAge()+","+b.getName());
    }
    
}
