class ParkingSystem {

    int n[];

    public ParkingSystem(int big, int medium, int small) {
        n = new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        if(n[carType-1]>0)
        {
            n[carType-1]--;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */