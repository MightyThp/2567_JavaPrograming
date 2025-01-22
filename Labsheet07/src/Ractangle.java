
public class Ractangle {
 private float length =1.0f;
 private float width =1.0f;
 
 Ractangle () {}

 Ractangle(float length, float width){
	 this.length= length;
	 this.width = width;
 }
 public float getlength () {
	 return length;
 }
 public void setlength (float length) {
	 this.length = length;
 }
 public float getwidth () {
	 return width;
 }
 public void setwidth (float width) {
	 this.width = width;
 }
 public double getArea() {
	 return this.length * this.width;
 }
 public double getPerimeter() {
	 return 2*(this.length+this.width);
 }
 public String showData() {
	 return "Rectangle[length= " +  this.length + ",width = "+ this.width +"]";
 }
 public String tostring() {
	 return "Rectangle[length= " +  this.length + ",width = "+ this.width +"]";
 }
}
