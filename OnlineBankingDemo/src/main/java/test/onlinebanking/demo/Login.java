package test.onlinebanking.demo;

import org.springframework.stereotype.Component;

@Component 
public class Login {
	private String name1;
	private int unitnum;

	public int getUnitnum() {
		return unitnum;
	}

	public void setUnitnum(int unitnum) {
		this.unitnum = unitnum;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	
	
}
