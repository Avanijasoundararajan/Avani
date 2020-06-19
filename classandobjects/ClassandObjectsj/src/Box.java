
class Box
{
    double width;
    double height;
    double depth;
    Box()
    {
        System.out.println("Constructing Box");
        width = 100;
        height = 100;
        depth = 100;
    }
    double volume()
    {
        return width * height * depth;
    }
}
