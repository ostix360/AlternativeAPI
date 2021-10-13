package fr.trxyy.alternative.alternative_api.minecraft.utils;

public enum EnumJavaFileType {
	FILE("file"),
	DIRECTORY("directory");

	private String name;

	EnumJavaFileType(String par1Name) {
		this.name = par1Name;
	}

	public String getName() {
		return this.name;
	}

}
