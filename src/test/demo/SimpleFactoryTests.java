package demo;

import demo.SimpleFactory.ConcreteProductA;
import demo.SimpleFactory.ConcreteProductB;
import demo.SimpleFactory.Product;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * 简单工厂模式单测
 * Simple factory unit tests
 *
 * @author Notis Hell notishell@gmail.com 2024/03/30 20:01:08
 */
public class SimpleFactoryTests {

	@Test
	public void should_createProduct_return_ConcreteProductA() {
		SimpleFactory factory = new SimpleFactory();
		Product product = factory.createProduct("A");
		product.print();

		Assert.isTrue(product instanceof ConcreteProductA, "not expected product");
	}

	@Test
	public void should_createProduct_return_ConcreteProductB() {
		SimpleFactory factory = new SimpleFactory();
		Product product = factory.createProduct("B");
		product.print();

		Assert.isTrue(product instanceof ConcreteProductB, "not expected product");
	}

	@Test
	public void should_createProduct_return_null() {
		SimpleFactory factory = new SimpleFactory();
		Product product = factory.createProduct("C");

		Assert.isNull(product, "not null");
	}

	@Test
	public void should_demo_no_exception() {
		SimpleFactory factory = new SimpleFactory();
		factory.demo();
	}

}
