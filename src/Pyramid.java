    public class Pyramid {
        private double lengthOfBase;
        private double height;
        private int numberOfSides;

        public Pyramid (double lengthOfBase, double height, int numberOfSides){
            this.lengthOfBase = lengthOfBase;
            if(height < 0 ){
                this.height = (-1)*height;
            }else{
                this.height = height;
            }
            if (numberOfSides != 3 && numberOfSides != 4) {
                System.out.println("Number of Signed changed as 4");
                this.numberOfSides = 4;
            } else {
                this.numberOfSides = numberOfSides;
            }

        }

        public double getVolume()
        {
            if(this.numberOfSides == 3){
                double baseArea = (Math.sqrt(3)/4)*Math.pow(this.lengthOfBase,2);
                return (baseArea*this.height)/3;
            } else {
                double baseArea = Math.pow(this.lengthOfBase,2);
                return (1.0/3.0)*baseArea*this.height;
            }
        }

        public static void main(String[] args){
            Pyramid pyr = new Pyramid(2,-12.0,4);
            System.out.println(pyr.getVolume());
        }
    }


