package J11J11;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Random;
import java.util.RandomAccess;

import javax.print.attribute.Size2DSyntax;

public class E7019 {

	public static void main(String[] args) throws Exception{
		RandomAccessFile inFile=new RandomAccessFile("source/src.jpg","rw");
		FileChannel inChannel=inFile.getChannel();
		RandomAccessFile outflie=new RandomAccessFile("target/dest.jpg","rw");
		FileChannel outChannel=outflie.getChannel();
		long transferTo=inChannel.transferTo(0,inChannel.size(),outChannel);
		if (transferTo>0) {
			System.out.println("¸´ÖÆ³É¹¦");
		}
		inFile.close();
		inChannel.close();
		outflie.close();
		outChannel.close();

	}

}
