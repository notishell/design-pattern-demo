package demo;

/**
 * 简单工厂模式
 * Simple factory
 *
 * @author Notis Hell notishell@gmail.com 2024/03/30 20:00:33
 */
public class SimpleFactory {

	interface Product {
		/**
		 * 打印信息
		 */
		void print();
	}

	class ConcreteProductA implements Product {
		@Override
		public void print() {
			System.out.println("Using Product A");
		}
	}

	class ConcreteProductB implements Product {
		@Override
		public void print() {
			System.out.println("Using Product B");
		}
	}

	public Product createProduct(String type) {
		if ("A".equals(type)) {
			return new ConcreteProductA();
		} else if ("B".equals(type)) {
			return new ConcreteProductB();
		}
		return null;
	}

	/**
	 * 客户端代码
	 */
	public void demo() {
		SimpleFactory factory = new SimpleFactory();
		Product product = factory.createProduct("A");
		product.print();
	}
}