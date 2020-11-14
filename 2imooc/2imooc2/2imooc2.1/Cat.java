public class Cat extends Animal implements Jumpping {
    
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    
    public void jump(){
        System.out.println("猫可以调高了");
    }

    public Cat() {
    }

    public Cat(String name,int age) {
        super(name,age);
    }
    
}
