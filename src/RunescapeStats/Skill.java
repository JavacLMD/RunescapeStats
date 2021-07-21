package RunescapeStats;

import java.math.BigInteger;

public class Skill {
	
	long rank;
	long level;
	BigInteger experience;
	
	public Skill() {}
	
	public Skill(long rank, long level, int experience) {
		super();
		this.rank = rank;
		this.level = level;
		this.experience = BigInteger.valueOf(experience);
	}
	
	public long getLevel() {
		return level;
	}
	public void setLevel(long level) {
		this.level = level;
	}
	public long getRank() {
		return rank;
	}
	public void setRank(long rank) {
		this.rank = rank;
	}
	public BigInteger getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = BigInteger.valueOf(experience);
	}
	
	@Override
	public String toString() {
		return "[rank=" + rank + ", level=" + level + ", experience=" + experience + "]";
	}
	

}
