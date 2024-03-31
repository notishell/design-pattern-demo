package demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * 工厂方法模式单元测试
 * Factory method pattern unit tests
 *
 * @author Notis Hell notishell@gmail.com 2024/03/31 12:42:31
 */
public class FactoryMethodTests {
	@Test
	public void should_demo_no_exception() {
		FactoryMethod factory = new FactoryMethod();
		factory.demo();
	}
}
