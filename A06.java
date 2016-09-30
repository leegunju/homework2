import java.util.*;

class A06 {
    
    public static void main(String[] args) {
    	Scanner j = new  Scanner(System.in);
    	System.out.print("국어 점수를 입려하세요 : ");
    	int kor = j.nextInt();
    	System.out.print("영어 점수를 입려하세요 : ");
    	int eng = j.nextInt();
    	System.out.print("수학 점수를 입려하세요 : ");
    	int math = j.nextInt();
            
	int total =  kor + eng + math;
	double avg = total/3.0;
	String h;
	if(avg >= 90)
		h="A+";
	else if(avg >= 80)
		h="B+";
	else if(avg >= 70)
		h="C+";
	else
		h="D+";

	System.out.printf("평균은 %.2f 이고\n", avg);
	System.out.printf("학점은 %s입니다.", h);
	}
    }
