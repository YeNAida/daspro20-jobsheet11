public class Kubus20 {
        private double sisi;
    
        public Kubus20(double sisi) {
            this.sisi = sisi;
        }
    
        public double hitungVolume() {
            return Math.pow(sisi, 3);
        }
    
        public double hitungLuasPermukaan() {
            return 6 * Math.pow(sisi, 2);
        }
    
        public static void main(String[] args) {
            Kubus20 kubus = new Kubus20(5);
    
            double volume = kubus.hitungVolume();
            double luasPermukaan = kubus.hitungLuasPermukaan();
    
            System.out.println("Volume kubus: " + volume);
            System.out.println("Luas permukaan kubus: " + luasPermukaan);
        }
    }

