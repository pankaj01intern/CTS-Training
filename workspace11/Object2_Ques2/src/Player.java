

public class Player{

	private String name;
	private String country;
	private String skill;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Player(){
		
	}
	
    public Player(String name,String country,String skill){
    	 this.setName(name);
         this.setCountry(country);
         this.setSkill(skill);
	}
    
    @Override
    public String toString() { 
        return getName()+" -- " +getCountry()+" -- "+getSkill();
        
        
    } 

}
