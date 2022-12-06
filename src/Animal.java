public class Animal{
    String animalName;

    public Animal(String animalName){
        this.animalName=animalName;
    }
    public void animalSound(){
        System.out.println("Roarr!");
    }
    public void animalSound(int intensity){
        if (intensity>9){
            System.out.println("Roarrrrrrrr!");
        }else if(intensity<4){
            System.out.println("Roar");
        }else{
            System.out.println("Cannot reproduce it properly");
        }
    }
}
