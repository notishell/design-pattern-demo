package demo;

/**
 * 工厂方法模式
 * Factory method pattern
 *
 * @author Notis Hell notishell@gmail.com 2024/03/31 12:31:35
 */
public class FactoryMethod {

	/**
	 * 抽象产品
	 */
	interface Product {
		void use();
	}

	/**
	 * 具体产品A
	 */
	class ConcreteProductA implements Product {
		@Override
		public void use() {
			System.out.println("Using ConcreteProductA");
		}
	}

	/**
	 * 具体产品B
	 */
	class ConcreteProductB implements Product {
		@Override
		public void use() {
			System.out.println("Using ConcreteProductB");
		}
	}

	/**
	 * 创建者（工厂）接口
	 */
	interface Creator {
		Product createProduct();
	}

	/**
	 * 具体创建者A
	 */
	class ConcreteCreatorA implements Creator {
		@Override
		public Product createProduct() {
			return new ConcreteProductA();
		}
	}

	/**
	 * 具体创建者B
	 */
	class ConcreteCreatorB implements Creator {
		@Override
		public Product createProduct() {
			return new ConcreteProductB();
		}
	}

	/**
	 * 使用示例代码
	 */
	public void demo() {
		Creator creatorA = new ConcreteCreatorA();
		Product productA = creatorA.createProduct();
		productA.use();

		Creator creatorB = new ConcreteCreatorB();
		Product productB = creatorB.createProduct();
		productB.use();
	}

}