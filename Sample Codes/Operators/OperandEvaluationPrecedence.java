class OperandEvaluationPrecedence
{
	public static void main(String[] args)
	{
		System.out.println(m(1) + m(2) * m(3) / m(4) + m(5) * m(6));
	}
	public static int m(int i)
	{
		System.out.println(i);
		return i;
	}
}

/* 
	Explanation of evaluation
	Before applying any operator precedence rule all operands will be evaluated first from
	LEFT -> RIGHT
 m(1) + m(2) * m(3) / m(4) + m(5) * m(6)
 => 1 + 2 * 3 / 4 + 5 * 6
 => 1 + 6 / 4 + 5 * 6
 => 1 + 1 + 5 * 6
 => 1 + 1 + 30
 => 2 + 30
 => 32