package Interface;

public abstract interface Youtuber { 
	// or er can do like this 
	void makeMoreVideo();  //as by default in interface it public static , i.e  it is public static void makeMoreVideo();
	abstract void makeVideo();
	
	default void uploadVideo ()  {    //in java after the 8 version we can make functions in abstract class by using the default keyword,and after that its children class don't need to override its methods (compulsary),but  if its wan then it also do it , but it is not compulsary
		System.out.println("uploading video");
	}
	
}
