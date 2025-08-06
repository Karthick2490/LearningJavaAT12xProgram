package Exercise30_ObjectClass;

public class Lab218_ObjectClass {
        //Object is a root of the class directory
        //Super class, Father class

    class Sample extends Object
    {
        @Override
        public String toString()
        {
            System.out.println("This is coming from object class");
            return null;
        }
        @Override
        public int hashCode()
        {
            System.out.println("Coming from Object class");
            return 1;
        }
        @Override
        public boolean equals(Object object)
        {
            System.out.println("Coming from Object Class");
            return true;
        }
    }
}
