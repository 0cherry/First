package one_to_one_equivalence_partitioning;

public class PassOrNot {
	// score1: A ���� ���� score2: B ���� ����
    public String ckScore(int score1, int score2) { 
          if (score1<0 || score2<0) throw new InvalidRangeException();
          if (score1>100 || score2>100) throw new InvalidRangeException();
          if (score1<50 || score2<50) return "����";
          if (score1+score2>=120) return "���";
          return "����";
    }
}
