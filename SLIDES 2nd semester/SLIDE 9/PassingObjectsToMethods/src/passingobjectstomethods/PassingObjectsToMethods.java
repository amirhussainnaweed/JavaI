package passingobjectstomethods;

public class PassingObjectsToMethods {

    public static void main(String[] args) {

        
        TV mytv = new TV("samsung");
        mytv.setChannel(23);
        showTVStatus(mytv); 

    }
    
    public static void showTVStatus(TV tv){
        System.out.println("This tv name is " + tv.getName());
        System.out.println("This TV current channel is " + tv.getChannel());
    }
    
}

class TV{
        private String name = "name";
        private int channel = 1;
        public void setName(String newName){
            this.name = newName;
        }

        public TV() {
        }
        public TV(String name) {
            this.name = name;
        }
        
        public String getName(){
            return this.name;
        }
        
        public void setChannel(int newChannel){
            this.channel = newChannel;
        }
        public int getChannel(){
            return this.channel;
        }
        
    }