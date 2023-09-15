package demo;

public class Armstrong {
	  int num= 153, num1= num,  reminder = 0;
	int rem = 0;
	double result = 0;

	int ar[] = new int[3];
	int i = 0;

	while (num != 0) {

		reminder = num % 10;
		num = num / 10;
		rem++;
		ar[i] = reminder;
		i++;
	}

	int x = 0;
	for (int j = 0; j < ar.length; j++) {
		result = Math.pow(ar[j], rem);
		x = (int) (x + result);
	}

	if (num1 == x) {
		System.out.println("It is Armstrong number: " + x);
	} else {
		System.out.println("It is not Armstrong number: " + x);
	}


	}

}
