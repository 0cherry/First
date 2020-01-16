package _final_exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GraderTest {

	@DisplayName("��ȿ�� �߰� ����")
	@ParameterizedTest(name="�߰� {0} �⸻ {1} ���� {2}")
	@CsvSource({
			"0,60,60,F",
			"100,60,60,C"
	})
	void should_be_exception(double m, double f, double h, Grade g) {
		Grader grader = new Grader();
		Grade actual = grader.computeGrade(m, f, h);
		assertEquals(g, actual);
	}
	
	@DisplayName("��ȿ���� ���� �߰� ����")
	@ParameterizedTest(name="�߰� {0} �⸻ {1} ���� {2}")
	@CsvSource({
		"-1,60,60",
		"101,60,60"
	})
	void should_be_exeption(double m, double f, double h) {
		Grader grader = new Grader();
		assertThrows(InvalidRangeException.class, () -> {
			grader.computeGrade(m, f, h);
		});
	}

}
