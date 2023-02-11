package object.Homework3;

public class Student extends Person {
        private String program;
        private int year;
        private double fee;

        //-------------Constructor--------------
        public Student(String name, String address, String program, int year, double fee){
            super(name, address);
            this.program = program;
            this.year = year;
            this.fee = fee;
        }
        //----------------Getter------------
        public String getProgram(){
            return this.program;
        }
        public int getYear(){
            return this.year;
        }
        public double getFee(){
            return this.fee;
        }
        //----------Setter-----------
        public void setProgram(String program){
            this.program = program;
        }
        public void setYear(int year){
            this.year = year;
        }
        public void setFee(double fee){
            this.fee = fee;
        }
        //------------ToString-------------
        @Override
        public String toString(){
            return "Student[" + super.toString() + ",program=" + this.program + ",year=" + this.year + ",fee=" + this.fee + "]";
        }
}
