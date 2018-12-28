package com.meditab.training.ocp.exercise;

public class ResourceAllocator
{
	interface resource()
	{
		public int allocate(ResourceType resourceType);
		 public void free(ResourceType resourceType, int resourceId);
		
	}
}
