
public class TimeSlot implements resource {
	private static final int INVALID_RESOURCE_ID = -1;

	public int allocate(ResourceType resourceType) {
		int resourceId;
		if (resourceType == TIME_SLOT) {
			resourceId = findFreeTimeSlot();
			markTimeSlotBusy(resourceId);
		} else {
			System.out.println("ERROR: Attempted to allocate invalid resource");
			resourceId = INVALID_RESOURCE_ID;
		}
		return resourceId;
	}

	private void markTimeSlotFree(int resourceId) {
	}

	private void markTimeSlotBusy(int resourceId) {
	}

	private int findFreeTimeSlot() {
		return 0;
	}
}
