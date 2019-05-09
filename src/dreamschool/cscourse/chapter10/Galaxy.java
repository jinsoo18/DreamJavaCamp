package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile{
	private String osVersion;

	public Galaxy(String production) {
		super(production);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getOsVersion() {
		return osVersion;
	}



	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}



	@Override
	public void charge(int time) {
		System.out.println("Galaxy : 보조배터리" + time + "분 충전");
	}
	
	

}
