package com.seaboxdata.hlbejk.service.utils;

import java.util.ArrayList;
import java.util.List;

import com.seaboxdata.hlbejk.service.modules.entity.SysResource;

public class ResourceTreeUtils {

	// 把一个List转成树
	public static List<SysResource> buidTree(List<SysResource> list) {
		List<SysResource> tree = new ArrayList<>();
		for (SysResource node : list) {
			if (node.getParentId().equals("0")) {
				tree.add(findChild(node, list));
			}
		}
		return tree;
	}

	public static SysResource findChild(SysResource node, List<SysResource> list) {
		for (SysResource n : list) {
			if (n.getParentId().equals(node.getId())) {
				if (node.getChildren() == null) {
					node.setChildren(new ArrayList<SysResource>());
				}
				node.getChildren().add(findChild(n, list));
			}
		}
		return node;
	}

}