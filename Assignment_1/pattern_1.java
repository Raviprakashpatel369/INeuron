// Java Program to print the Alphabets
// of a Given Word using * pattern
public class MyClass{

static char ch;

// Function to print the letter A
static void a()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int a = 0; a < 8; a++) {
			if (i == 0 && (a == 0 || a == 7))
				System.out.printf(" ");
			else if (a < 2 || a > 5) {
				System.out.printf("%c", ch);
			}
			else if (i < 2 || (i > 3 && i < 5)) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter B
static void b()
{
	System.out.printf("\n");
	for (int i = 0; i < 9; i++) {
		System.out.printf(" %c%c", ch, ch);

		for (int r = 0; r < 6; r++) {
			if (i == 0 && r < 5)
				System.out.printf("%c", ch);
			else if (i == 1)
				System.out.printf("%c", ch);
			else if (i < 4 && i > 0
					&& r > 3) {
				System.out.printf("%c", ch);
			}

			else if (i == 4 && r < 5) {
				System.out.printf("%c", ch);
			}
			else if (i > 4 && i < 7
					&& r > 3) {
				System.out.printf("%c", ch);
			}
			else if (i == 7) {
				System.out.printf("%c", ch);
			}
			else if (i == 8 && r < 5) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter C
static void c()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");
		for (int o = 0; o < 8; o++) {
			if (i == 0 && (o <= 1))
				System.out.printf(" ");
			else if (i == 1
					&& (o == 0 || o == 8 - i
						|| (o > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (o == 1 || o == 8 - i
						|| (o > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4
					|| i == 5)
					&& (o > 0))
				System.out.printf(" ");
			else if (i == 6
					&& (o == 0 || o == 8 + 5 - i
						|| (o > 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (o <= 1))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter D
static void d()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		{
			System.out.printf(" %c", ch);
		}

		for (int o = 0; o < 8; o++) {
			if (i == 0 && (o >= 6 - i))
				System.out.printf(" ");
			else if (i == 1
					&& (o == 0 || o == 8 - i
						|| (o < 6)))
				System.out.printf(" ");
			else if (i == 2
					&& (o == 1 || o == 8 - i
						|| (o < 6)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4
					|| i == 5)
					&& (o < 7))
				System.out.printf(" ");
			else if (i == 6
					&& (o == 0 || o == 8 + 5 - i
						|| (o < 6)))
				System.out.printf(" ");
			else if (i == 7
					&& (o >= 6 - i + 7))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter E
static void e()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 7; j++) {
			if (i == 0) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && i < 3
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 3 && j < 6) {
				System.out.printf("%c", ch);
			}
			else if (i > 3 && i < 6
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 6) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter F
static void f()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 7; j++) {
			if (i == 0) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && i < 3
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 3 && j < 6) {
				System.out.printf("%c", ch);
			}
			else if (i > 3 && i < 7
					&& j < 2) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter G
static void g()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");
		for (int o = 0; o < 8; o++) {
			if (i == 4 && o > 3
				|| (o == 4 || o == 7)
					&& i > 4) {
				System.out.printf("%c", ch);
			}

			else if (i == 0 && (o <= 1))
				System.out.printf(" ");
			else if (i == 1
					&& (o == 0 || o == 8 - i
						|| (o > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (o == 1 || o == 8 - i
						|| (o > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4
					|| i == 5)
					&& (o > 0))
				System.out.printf(" ");
			else if (i == 6
					&& (o == 0 || (o > 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (o <= 1 || o == 5
						|| o == 6))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter H
static void h()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int h = 0; h < 8; h++) {
			if (h < 2 || h > 5) {
				System.out.printf("%c", ch);
			}
			else if (i > 2 && i < 5) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter I
static void i()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");

		for (int t = 0; t < 8; t++) {

			if ((i < 1 || i > 6)
				&& t < 8) {
				System.out.printf("%c", ch);
			}

			else if (i > 0 && t < 3)
				System.out.printf(" ");
			else if (i > 0 && t > 2
					&& t < 5) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && t > 4)
				System.out.printf(" ");
			else {
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter J
static void j()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int h = 0; h < 8; h++) {
			if (i < 1) {
				System.out.printf("%c", ch);
			}
			else if (i == 5 && h < 1) {
				System.out.printf("%c", ch);
			}
			else if (i < 7 && h > 5) {
				System.out.printf("%c", ch);
			}
			else if (i == 7
					&& (h == 0 || h == 7))
				System.out.printf(" ");
			else if (i > 5) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter K
static void k()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int k1 = 0; k1 < 7; k1++) {
			if (k1 < 2) {
				System.out.printf("%c", ch);
			}
			else if ((k1 >= 5 - i)
					&& (k1 <= 6 - i)) {
				System.out.printf("%c", ch);
			}

			else if (i >= 4) {
				if (k1 == i - 2 || k1 == i - 1) {
					System.out.printf("%c", ch);
				}
				else
					System.out.printf(" ");
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter L
static void l()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		{
			System.out.printf("%c%c", ch, ch);
		}
		if (i == 6) {
			{
				System.out.printf("%c%c", ch, ch);
			}
			{
				System.out.printf("%c%c", ch, ch);
			}
			System.out.printf("%c%c", ch, ch);
		}
		if (i == 7) {
			{
				System.out.printf("%c%c", ch, ch);
			}
			{
				System.out.printf("%c%c", ch, ch);
			}
			System.out.printf("%c%c", ch, ch);
		}
		System.out.printf("\n");
	}
}

// Function to print the letter M
static void m()
{
	System.out.printf("\n");

	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (j == 0 || j == 7) {
				System.out.printf("%c", ch);
			}
			else if (i < 4
					&& (j == 7 - i || j == i)) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter N
static void n()
{
	System.out.printf("\n");

	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int n = 0; n < 8; n++) {
			if (n < 2 || n > 5) {
				System.out.printf("%c", ch);
			}
			else if (i == n - 1
					|| i == n + 1 || i == n) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter O
static void o()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int o = 0; o < 8; o++) {
			if (i == 0 && (o <= 1 || o >= 6 - i))
				System.out.printf(" ");
			else if (i == 1
					&& (o == 0 || o == 8 - i
						|| (o < 6 && o > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (o == 1 || o == 8 - i
						|| (o < 6 && o > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4 || i == 5)
					&& (o > 0 && o < 7))
				System.out.printf(" ");
			else if (i == 6
					&& (o == 0 || o == 8 + 5 - i
						|| (o < 6 && o > 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (o <= 1 || o >= 6 - i + 7))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter P
static void p()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		{
			System.out.printf("%c%c", ch, ch);
		}

		for (int r = 0; r < 6; r++) {
			if (i == 0 && r < 5)
				System.out.printf("%c", ch);
			else if (i == 1)
				System.out.printf("%c", ch);
			else if (i < 4 && i > 0 && r > 3) {
				System.out.printf("%c", ch);
			}

			else if (i == 4 && r < 5) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter Q
static void q()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int o = 0; o < 8; o++) {
			if (o == i)
				System.out.printf("%c", ch);

			else if (i == 0
					&& (o <= 1 || o >= 6 - i))
				System.out.printf(" ");
			else if (i == 1
					&& (o == 0 || o == 8 - i
						|| (o < 6 && o > 1)))
				System.out.printf(" ");
			else if (i == 2
					&& (o == 1 || o == 8 - i
						|| (o < 6 && o > 1)))
				System.out.printf(" ");
			else if ((i == 3 || i == 4 || i == 5)
					&& (o > 0 && o < 7))
				System.out.printf(" ");
			else if (i == 6
					&& (o == 0 || o == 8 + 5 - i
						|| (o < 6 && o > 1)))
				System.out.printf(" ");
			else if (i == 7
					&& (o <= 1 || o >= 6 - i + 7))
				System.out.printf(" ");
			else {
				System.out.printf("%c", ch);
			}
		}
		System.out.printf("\n");
	}
}

// Function to print the letter R
static void r()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		{
			System.out.printf("%c%c", ch, ch);
		}

		for (int r = 0; r < 6; r++) {
			if (i == 0 && r < 5)
				System.out.printf("%c", ch);
			else if (i == 1)
				System.out.printf("%c", ch);
			else if (i < 4 && i > 0
					&& r > 3) {
				System.out.printf("%c", ch);
			}

			else if (i >= 4) {
				if (i == 4
					&& (r == 3 || r == 4)) {
					System.out.printf("%c", ch);
				}

				else if (r == i - 2
						|| r == i - 3) {
					System.out.printf("%c", ch);
				}
				else
					System.out.printf(" ");
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter S
static void s()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 7; j++) {
			if (i == 0 && j > 0) {
				System.out.printf("%c", ch);
			}
			else if (i > 0 && i < 3
					&& j < 2) {
				System.out.printf("%c", ch);
			}
			else if (i == 3 && j > 0
					&& j < 6) {
				System.out.printf("%c", ch);
			}
			else if (i > 3 && i < 6
					&& j > 4) {
				System.out.printf("%c", ch);
			}
			else if (i == 6 && j < 6) {
				System.out.printf("%c", ch);
			}

			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter T
static void t()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {

		System.out.printf(" ");
		for (int t = 0; t < 8; t++) {

			if (i < 2 && t < 8) {
				System.out.printf("%c", ch);
			}

			if (i > 1 && t < 3)
				System.out.printf(" ");
			if (i > 1 && t > 2
				&& t < 5) {
				System.out.printf("%c", ch);
			}
			if (i > 1 && t > 4)
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter U
static void u()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int h = 0; h < 8; h++) {
			if (i < 7 && (h < 2 || h > 5)) {
				System.out.printf("%c", ch);
			}
			else if (i == 7
					&& (h == 0 || h == 7))
				System.out.printf(" ");
			else if (i > 5) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter V
static void v()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int v = 0; v < 8; v++)
			if ((v == 0 || v == 7)
				&& i < 4) {
				System.out.printf("%c", ch);
			}
			else if ((v == i - 4 || v == 11 - i)
					&& i >= 4) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		System.out.printf("\n");
	}
}

// Function to print the letter W
static void w()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (j == 0 || j == 7) {
				System.out.printf("%c", ch);
			}
			else if (i > 3
					&& (j == 7 - i || j == i)) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter X
static void x()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int m = 0; m < 8; m++) {
			if (i == m || m == 7 - i) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}

		System.out.printf("\n");
	}
}

// Function to print the letter Y
static void y()
{
	System.out.printf("\n");
	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");

		for (int y = 0; y < 8; y++) {
			if (i < 4) {
				if (y == i || y == i + 1
					|| y == 6 - i || y == 7 - i) {
					System.out.printf("%c", ch);
				}
				else
					System.out.printf(" ");
			}
			else if (y == 3 || y == 4) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the letter Z
static void z()
{
	System.out.printf("\n");

	for (int i = 0; i < 8; i++) {
		System.out.printf(" ");
		for (int j = 0; j < 8; j++) {
			if (i == 0 || i == 7) {
				System.out.printf("%c", ch);
			}
			else if (j == 7 - i) {
				System.out.printf("%c", ch);
			}
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the required pattern
// by taking out each characters in it
static void printPattern(char[] str)
{

	int in = 0;

	while (in<str.length) {

		char ch = str[in];
		if (ch < 95)
			ch = (char) (ch + 32);
		switch (ch) {
		case 'a':
			a();
			break;
		case 'b':
			b();
			break;
		case 'c':
			c();
			break;
		case 'd':
			d();
			break;
		case 'e':
			e();
			break;
		case 'f':
			f();
			break;
		case 'g':
			g();
			break;
		case 'h':
			h();
			break;
		case 'i':
			i();
			break;
		case 'j':
			j();
			break;
		case 'k':
			k();
			break;
		case 'l':
			l();
			break;
		case 'm':
			m();
			break;
		case 'n':
			n();
			break;
		case 'o':
			o();
			break;
		case 'p':
			p();
			break;
		case 'q':
			q();
			break;
		case 'r':
			r();
			break;
		case 's':
			s();
			break;
		case 't':
			t();
			break;
		case 'u':
			u();
			break;
		case 'v':
			v();
			break;
		case 'w':
			w();
			break;
		case 'x':
			x();
			break;
		case 'y':
			y();
			break;
		case 'z':
			z();
			break;
		default:
			break;
		}
		in++;
	}
}

// Driver code
public static void main(String[] args)
{
	ch = '*';
	char[] str = "INEURON".toCharArray();
	printPattern(str);

}
}

// This code contributed by Rajput-Ji
