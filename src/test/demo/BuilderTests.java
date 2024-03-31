package demo;

import org.junit.jupiter.api.Test;

/**
 * 建造者模式单元测试
 * Builder pattern unit tests
 *
 * @author Notis Hell notishell@gmail.com 2024/03/31 21:13:23
 */
public class BuilderTests {
	@Test
	public void should_demo_no_exception() {
		Builder builder = new Builder();
		builder.demo();
	}
}
