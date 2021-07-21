package RunescapeStats;

public class PlayerStats {
	
	
	private String name;
	private Skill overallSkill;
	private Skill attackSkill;
	private Skill defenseSkill;
	private Skill strengthSkill;
	
	
	public PlayerStats() {}
	
	public PlayerStats(String name, Skill overallSkill, Skill attackSkill, Skill defenseSkill, Skill strengthSkill) {
		super();
		this.name = name;
		this.overallSkill = overallSkill;
		this.attackSkill = attackSkill;
		this.defenseSkill = defenseSkill;
		this.strengthSkill = strengthSkill;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Skill getOverallSkill() {
		return overallSkill;
	}
	public void setOverallSkill(Skill overallSkill) {
		this.overallSkill = overallSkill;
	}
	public Skill getAttackSkill() {
		return attackSkill;
	}
	public void setAttackSkill(Skill attackSkill) {
		this.attackSkill = attackSkill;
	}
	public Skill getDefenseSkill() {
		return defenseSkill;
	}
	public void setDefenseSkill(Skill defenseSkill) {
		this.defenseSkill = defenseSkill;
	}
	public Skill getStrengthSkill() {
		return strengthSkill;
	}
	public void setStrengthSkill(Skill strengthSkill) {
		this.strengthSkill = strengthSkill;
	}
	@Override
	public String toString() {
		return "PlayerStats: [\n name=" + name + ",\n overallSkill=" + overallSkill + ",\n attackSkill=" + attackSkill
				+ ",\n defenseSkill=" + defenseSkill + ",\n strengthSkill=" + strengthSkill + "]";
	}

	
	

}
