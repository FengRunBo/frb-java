package J11J8;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.font.GraphicAttribute;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;
public class Ewm {

	public static void main(String[] args) {
		Qrcode ewm=new Qrcode();
		int width=300;
		int height=300;
		BufferedImage hctx=new BufferedImage(width, height,BufferedImage.TYPE_INT_BGR);
		Graphics2D ewhb =hctx.createGraphics();
		ewhb.setBackground(Color.WHITE);
		ewhb.clearRect(0,0, width, height);
		String zf="уе╥и";
		byte[] zjsz=zf.getBytes();
		int pianyi=2;
		if (zjsz.length>0&&zjsz.length<100) {
			boolean[][] ewsz=ewm.calQrcode(zjsz);
			for (int i=0;i<ewsz.length;i++) {
			for (int j = 0; j < ewsz.length; j++) {
				if (ewsz[j][i]) {
					ewhb.fillRect(j*3+pianyi,i*3+pianyi,3,3);
				}
				
				}
			}
		}
		ewhb.dispose();
		hctx.flush();
		ImageIO.write(hctx,"jpg",new File("ewm.jpg"));

	}
}
