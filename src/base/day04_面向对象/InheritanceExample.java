package base.day04_面向对象;

import java.util.Arrays;

public class InheritanceExample {
	public static void main(String[] args) {
		ImportCosmeticManager cs = new ImportCosmeticManager();
		cs.add(new Cosmetic("香内儿", "进口", 1400));
		cs.add(new Cosmetic("圣罗兰", "进口", 800));
		cs.add(new Cosmetic("大宝", "国产", 20));
		cs.add(new Cosmetic("万紫千红", "国产", 15));
		cs.print();
	}
}

// 可输出进口化妆品的管理类
class ImportCosmeticManager extends CosmeticManager {
	@Override
	public void print() {
		for (int i = 0; i < count; i++) {
			// 比较连个字符串的值是否相等，不能使用==，要是用equals()
			if ("进口".equals(cosmetics[i].getType())) {
				System.out.println(cosmetics[i].getInfo());
			}
		}
	}
}

// 可按照单价进行排序的化妆品管理类
class SortCosmeticManager extends CosmeticManager {
	// 排序输出所有产品
	@Override
	public void print() {
		Cosmetic[] temp = Arrays.copyOf(cosmetics, count);
		Cosmetic c = null;
		// System.out.println(temp.length);
		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = 0; j < temp.length - i - 1; j++) {
				if (temp[j].getPrice() > temp[j + 1].getPrice()) {
					c = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = c;
				}
			}
		}
		for (Cosmetic cosmetic : temp) {
			System.out.println(cosmetic.getInfo());
		}
	}
}

// 化妆品管理类
class CosmeticManager {
	protected Cosmetic[] cosmetics = new Cosmetic[4];
	protected int count = 0;

	// 进货功能
	public void add(Cosmetic c) {
		int len = cosmetics.length;
		if (count >= len) {
			int newLen = len * 2;
			cosmetics = Arrays.copyOf(cosmetics, newLen);
		}
		cosmetics[count] = c;
		count++;
	}

	// 输出所有产品
	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(cosmetics[i].getInfo());
		}
	}
}

// 化妆品类
class Cosmetic {
	private String name;// 品牌
	private String type;// 进口或国产
	private double price;// 单价

	public Cosmetic() {
	}

	public Cosmetic(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInfo() {
		return "name=" + name + ",type=" + type + ",price=" + price;
	}
}