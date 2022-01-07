package consommateur;

public enum Genre {
	
	MASCULIN ("M","Masculin"),
	FEMININ ("F","Feminin");
	
	private Genre(String code, String description) {
		this.code = code;
		this.description = description;
	}

	private String code;
	
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
