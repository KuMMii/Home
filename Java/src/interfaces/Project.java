package interfaces;

public class Project {

		interface Test{
			void nothing();
			default void nothing1() {
				//helps providing default implementation.  prevent compiling error
			}
			
		}
		
		class Class1 implements Test{

			@Override
			public void nothing() {
				// TODO Auto-generated method stub
				
			}
			
		}
		class Class2 implements Test{
			
			@Override
			public void nothing() {
				// TODO Auto-generated method stub
				
			}
			
		}
	public static void main(String[] args) {
		
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 23));
	}

}
