package classification_tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("ī���� �׽�Ʈ")
class CounterTest {
	@Nested
	@DisplayName("ũ�Ⱑ 0�� �迭�� �Էµ� ��")
	class WhenArrayOfSizeZeroIsEntered {
		@Test
		void shoud_ReturnZeroForArrayOfSizeZero() {
			Counter cnt = new Counter();
			int actual = cnt.count(new int[0], 10);
			assertEquals(0, actual);
		}
	}
	
	@Nested
	@DisplayName("��ȿ�� �迭�� �Էµ� ��")
	class WhenValidArrayIsEntered {
		@ParameterizedTest(name="�迭 [{1}]�� {2}�� {0}�� �����Ͽ��� �Ѵ�")
		@CsvSource({"1, 10, 10", "0, 20, 10", "0, 10;3;10;50;40, 20", "1, 10;3;10;50;40, 50", 
			"4, 10;10;10;40;10, 10", "5, 10;10;10;10;10, 10"})
		void should_Count(int expected, @ConvertWith(IntArrayConverter.class)int[] array, int num) {
			Counter cnt = new Counter();
			int actual = cnt.count(array, num);
			assertEquals(expected, actual);
		}
	}
	
}
