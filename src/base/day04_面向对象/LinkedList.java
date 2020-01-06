package base.day04_面向对象;

public class LinkedList {
	public static void main(String[] args) {
		NodeManager nodeManager = new NodeManager();
		nodeManager.add(5);
		nodeManager.add(4);
		nodeManager.add(3);
		nodeManager.add(2);
		nodeManager.add(1);
		nodeManager.print();
		
		nodeManager.del(3);
		nodeManager.print();
		
		boolean findFlag = nodeManager.find(1);
		if (findFlag == true) {
			System.out.println("该数据在链表中");
		} else {
			System.out.println("该数据不在链表中");
		}
		
		boolean updateFlag = nodeManager.update(1, 10);
		if (updateFlag == true) {
			System.out.println("更新成功");
		} else {
			System.out.println("更新失败");
		}
		nodeManager.print();
		
		nodeManager.insert(2, 6);
		nodeManager.print();
	}
}

class NodeManager {
	private Node rootNode;// 根节点
	private int currentIndex = 0;// 节点的序号，每次操作从0开始
	
	// 添加节点
	public void add(int data) {
		if (rootNode == null) {
			rootNode = new Node(data);
		} else {
			rootNode.addNode(data);
		}
	}
	
	// 删除节点
	public void del(int data) {
		if (rootNode == null) {
			return;
		}
		if (rootNode.getData() == data) {
			rootNode = rootNode.nextNode;
		} else {
			rootNode.delNode(data);
		}
	}
	
	// 打印所有节点
	public void print() {
		if (rootNode != null) {
			System.out.print(rootNode.getData() + "->");
			rootNode.printNode();
			System.out.println();
		}
	}
	
	// 查找节点是否存在
	public boolean find(int data) {
		if (rootNode == null) {
			return false;
		}
		if (rootNode.data == data) {
			return true;
		} else {
			return rootNode.findNode(data);
		}
	}
	
	// 更新节点
	public boolean update(int oldData, int newData) {
		if (rootNode == null) {
			return false;
		}
		if (rootNode.getData() == oldData) {
			rootNode.setData(newData);
			return true;
		} else {
			return rootNode.updateNode(oldData, newData);
		}
	}
	
	public void insert(int index, int data) {
		if (index < 0) {
			return;
		}
		currentIndex = 0;
		if (index == currentIndex) {
			Node newNode = new Node(data);
			rootNode.nextNode = newNode;
			rootNode = newNode;
		} else {
			rootNode.insertNode(index, data);
		}
	}
	
	private class Node {
		private int data;
		private Node nextNode;// 把当前类型作为属性
	
		public Node(int data) {
			this.data = data;
		}
		
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
		// 添加节点
		public void addNode(int data) {
			if (this.nextNode == null) {
				this.nextNode = new Node(data);
			} else {
				this.nextNode.addNode(data);
			}
		}
		
		// 删除节点
		public void delNode(int data) {
			if (this.nextNode != null) {
				if (this.nextNode.data == data) {
					this.nextNode = this.nextNode.nextNode;
				} else {
					this.nextNode.delNode(data);
				}
			}
		}
		
		// 输出所有节点
		public void printNode() {
			if (this.nextNode != null) {
				System.out.print(this.nextNode.data + "->");
				this.nextNode.printNode();
			}
		}
		
		// 查找节点是否存在
		public boolean findNode(int data) {
			if (this.nextNode != null) {
				if (this.nextNode.data == data) {
					return true;
				} else {
					return this.nextNode.findNode(data);
				}
			}
			return false;
		}
		
		// 修改节点
		public boolean updateNode(int oldData, int newData) {
			if (this.nextNode != null) {
				if (this.nextNode.data == oldData) {
					this.nextNode.data = newData;
					return true;
				} else {
					return this.nextNode.updateNode(oldData, newData);
				}
			}
			return false;
		}
		
		// 插入节点
		public void insertNode(int index, int data) {
			currentIndex++;
			if (index == currentIndex) {
				Node newNode = new Node(data);
				newNode.nextNode = this.nextNode;
				this.nextNode = newNode;
			} else {
				this.insertNode(index, data);
			}
		}
	}
}