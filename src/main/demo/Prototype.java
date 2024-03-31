package demo;

/**
 * 原型模式
 * Prototype pattern
 *
 * @author Notis Hell notishell@gmail.com 2024/03/31 18:02:50
 */
public class Prototype implements Cloneable {
	private String property;

	public Prototype(String property) {
		this.property = property;
	}

	/**
	 * 使用克隆方法创建对象副本
 	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getProperty() {
		return property;
	}

	/**
	 * 客户端代码
	 */
	public static void demo() throws CloneNotSupportedException {
		Prototype prototype = new Prototype("Original");
		Prototype clone = (Prototype) prototype.clone();
		System.out.println(clone.getProperty()); // 输出 "Original"
	}
}
