package demo;

import org.junit.jupiter.api.Test;

/**
 * 抽象工厂模式单元测试
 * Abstract factory pattern unit tests
 *
 * @author Notis Hell notishell@gmail.com 2024/03/31 16:59:16
 */
public class AbstractFactoryTests {
	@Test
	public void should_demo_no_exception() {
		AbstractFactory factory = new AbstractFactory();
		factory.demo();
	}
}
