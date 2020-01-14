package gradleproject01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("���� ��� ���α׷� �׽�Ʈ")
class GraderTest {

	@DisplayName("90�� �̻��̸� A ���")
	@Test
	void should_give_A_for_students_with_more_than_90pts() {
		/* Arrange */
		double mids = 90;
		double finals = 92;
		double homeworks = 90;
		Grader grader = new Grader();
		
		/* Act */
		Grade actual = grader.computeGrade(mids, finals, homeworks);
		
		/* Assert */
		assertEquals(Grade.A, actual, "Should be A");
	}
	
	@DisplayName("80�� �̻��̸� B ���")
	@Test
	void should_give_B_for_students_with_more_than_80pts() {
		/* Arrange */
		double mids = 80;
		double finals = 92;
		double homeworks = 90;
		Grader grader = new Grader();
		
		/* Act */
		Grade actual = grader.computeGrade(mids, finals, homeworks);
		
		/* Assert */
		assertEquals(Grade.B, actual, "Should be B");
	}
	
	@DisplayName("70�� �̻��̸� C ���")
	@Test
	void should_give_C_for_students_with_more_than_70pts() {
		/* Arrange */
		double mids = 80;
		double finals = 72;
		double homeworks = 70;
		Grader grader = new Grader();
		
		/* Act */
		Grade actual = grader.computeGrade(mids, finals, homeworks);
		
		/* Assert */
		assertEquals(Grade.C, actual, "Should be C");
	}
	
	@DisplayName("60�� �̻��̸� D ���")
	@Test
	void should_give_D_for_students_with_more_than_60pts() {
		/* Arrange */
		double mids = 60;
		double finals = 62;
		double homeworks = 70;
		Grader grader = new Grader();
		
		/* Act */
		Grade actual = grader.computeGrade(mids, finals, homeworks);
		
		/* Assert */
		assertEquals(Grade.D, actual, "Should be D");
	}
	
	@DisplayName("60�� �̸��̸� F ���")
	@Test
	void should_give_F_for_students_with_less_than_60pts() {
		/* Arrange */
		double mids = 50;
		double finals = 92;
		double homeworks = 30;
		Grader grader = new Grader();
		
		/* Act */
		Grade actual = grader.computeGrade(mids, finals, homeworks);
		
		/* Assert */
		assertEquals(Grade.F, actual, "Should be F");
	}

}
