public class InstanceBlock {
    
    int room;
    String meal;
    static String state;

    {
        room = 23;
        meal = "Pure Veg || No Non-Veg Please !!";
        state = "AR";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Room : "+room+" Meal : "+meal+" State : "+state);
    }

    public static void main(String[] args) {
        
        InstanceBlock ib = new InstanceBlock();
        System.out.println(ib);
    }
}
