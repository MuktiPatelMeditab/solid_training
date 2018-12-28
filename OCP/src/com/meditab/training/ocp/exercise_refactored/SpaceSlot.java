
public class SpaceSlot implements resource {

	private static final int INVALID_RESOURCE_ID = -1;

	public int allocate(ResourceType resourceType) {
		int resourceId;
		if (resourceType == SPACE_SLOT) {
			resourceId = findFreeSpaceSlot();
			markSpaceSlotBusy(resourceId);

		} else {
			System.out.println("ERROR: Attempted to allocate invalid resource");
			resourceId = INVALID_RESOURCE_ID;
		}
		return resourceId;
	}

	private void markSpaceSlotFree(int resourceId) {
	}

	private void markSpaceSlotBusy(int resourceId) {
	}

	private int findFreeSpaceSlot() {
		return 0;
	}

}
