package Educatioin.Stepik_Lessons;

public class Test {

    public final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

//        @Override
//        public boolean equals(ComplexNumber dick) {
//            if ((dick.re == this.re)&&(dick.im==this.im)) return true;
//            else return false;
//        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }



}
