package demo;

/**
 * 建造者模式
 * Builder pattern
 *
 * @author Notis Hell notishell@gmail.com 2024/03/31 20:50:53
 */
public class Builder {

	class Product {
		private String partA;
		private String partB;

		public void show() {
			System.out.println("PartA: " + partA + ", PartB: " + partB);
		}

		public void setPartA(String partA) {
			this.partA = partA;
		}

		public void setPartB(String partB) {
			this.partB = partB;
		}
	}

	// 抽象建造者
	abstract class AbstractBuilder {
		protected Product product = new Product();

		public abstract AbstractBuilder buildPartA(String partA);
		public abstract AbstractBuilder buildPartB(String partB);

		public Product build() {
			return product;
		}
	}

	// 具体建造者
	class ConcreteBuilder extends AbstractBuilder {
		@Override
		public AbstractBuilder buildPartA(String partA) {
			product.setPartA(partA);
			return this;
		}

		@Override
		public AbstractBuilder buildPartB(String partB) {
			product.setPartB(partB);
			return this;
		}
	}

	// 指挥者
	class Director {
		public Product construct(AbstractBuilder builder) {
			builder.buildPartA("A1");
			builder.buildPartB("B1");
			return builder.build();
		}
	}

	/**
	 * 使用示例代码
	 */
	public void demo() {
		Director director = new Director();
		AbstractBuilder builder = new ConcreteBuilder();
		Product product = director.construct(builder);
		product.show();
	}
}
