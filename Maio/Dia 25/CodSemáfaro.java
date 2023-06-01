// C++ code
//
void setup()
{
  pinMode(1, OUTPUT);
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
}

void loop()
{
  digitalWrite(1,1);
  digitalWrite(2,0);
  digitalWrite(3,0);
  digitalWrite(8,0);
  digitalWrite(9,0);
  digitalWrite(10,1);
  delay(5000); // Wait for 1000 millisecond(s)
  digitalWrite(1,0);
  digitalWrite(2,1);
  delay(2000); // Wait for 1000 millisecond(s)
  digitalWrite(2,0);
  digitalWrite(3,1);
  digitalWrite(8,1);
  digitalWrite(10,0);
  delay(5000); // Wait for 1000 millisecond(s)
  digitalWrite(8,0);
  digitalWrite(9,1);
  delay(2000); // Wait for 1000 millisecond(s)

}
