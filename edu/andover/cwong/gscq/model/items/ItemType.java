package edu.andover.cwong.gscq.model.items;

public abstract class ItemType {
	
	private String ItemID;
	private boolean isEquipped;
	
	public boolean checkIfIsItem(String str) {
		return (ItemID.equals(str));
	}
	public abstract String getDescription();
	
	public abstract int attackIncrease();
	public abstract int defenseIncrease();

	public void setItemID(String id) {
		ItemID = id;
	}
	
	public void toggleEquip() {
		isEquipped = !isEquipped;
	}
}
