 /**
 * Lesson 7
 * @author Tselovalnikov S
 * @version 07 okt 2021
 */

class DZ7 {
    public static void main(String[] args) {
        Cat[] arrCats = new Cat[3];
        arrCats[0] = new Cat("BRAT", 15);
        arrCats[1] = new Cat("SWAT", 10);
        arrCats[2] = new Cat("KUM", 25);

        Plate p = new Plate(25);

        for (Cat cat : arrCats) {
            cat.eat(p);
            cat.info();
        }

        p.info();
        p.addFood(25);
        p.info();

        for (Cat cat : arrCats) {
            cat.eat(p);
            cat.info();
		
		        p.info();
        p.addFood(0);
        p.info();
        }
    }
}