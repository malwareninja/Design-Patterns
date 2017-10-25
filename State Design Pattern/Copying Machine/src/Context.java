
public class Context {
   private State state;
   private String ready_light;
   private String display_panel;
   
   public Context(){
      state = null;
      ready_light = null;
      display_panel = null;
   }

   public void setState(State state){
      this.state = state;
   }

   public State getState(){
      return state;
   } 
  
   public String getReadyLight() {
	   return(this.ready_light);
   }
   
   public void setReadyLight(String act) {
	   this.ready_light = act;
   }
   
   public String getDisplayPanel() {
	   return(this.display_panel);
   }
   
   public void setDisplayPanel(String disp) {
	   this.display_panel = disp;
   }

}