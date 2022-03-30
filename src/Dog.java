public class Dog extends Pet
{
    private String breed;

    public Dog(String breed, String name)

    {
        super(name,"dog");
        this.breed =breed;

    }

    @Override
    public void printPetInfo()
    {
        super.printPetInfo();
        System.out.println("of breed" + breed);
    }



}
