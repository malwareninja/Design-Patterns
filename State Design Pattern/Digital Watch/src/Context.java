
public class Context {
   private State state;
   private int hours;
   private int minutes;
   
   public Context(){
      state = null;
      hours = 0;
      minutes = 0;
   }

   public void setState(State state){
      this.state = state;
   }

   public State getState(){
      return state;
   }
   
   public int getHours() {
	   return(this.hours);
   }

   public int getMinutes() {
	   return(this.minutes);
   }
   
   public void setHours() {
	   this.hours++;
   }

   public void setMinutes() {
	   this.minutes++;
   }
   
   
}