import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.*;
public class PersonDisplay extends JPanel {

	/**
	 * Create the panel.
	 */
	static JLabel p06 = new JLabel("");
	static JLabel p16 = new JLabel("");
	static JLabel p26 = new JLabel("");
	static JLabel p36 = new JLabel("");
	static JLabel p46 = new JLabel("");
	static JLabel p56 = new JLabel("");
	static JLabel p66 = new JLabel("");
	static JLabel p05 = new JLabel("");
	static JLabel p15 = new JLabel("");
	static JLabel p25 = new JLabel("");
	static JLabel p35 = new JLabel("");
	static JLabel p45 = new JLabel("");
	static JLabel p55 = new JLabel("");
	static JLabel p65 = new JLabel("");
	static JLabel p04 = new JLabel("");
	static JLabel p14 = new JLabel("");
	static JLabel p24 = new JLabel("");
	static JLabel p34 = new JLabel("");
	static JLabel p44 = new JLabel("");
	static JLabel p54 = new JLabel("");
	static JLabel p64 = new JLabel("");
	static JLabel p03 = new JLabel("");
	static JLabel p13 = new JLabel("");
	static JLabel p23 = new JLabel("");
	static JLabel p33 = new JLabel("");
	static JLabel p43 = new JLabel("");
	static JLabel p53 = new JLabel("");
	static JLabel p63 = new JLabel("");
	static JLabel p02 = new JLabel("");
	static JLabel p12 = new JLabel("");
	static JLabel p22 = new JLabel("");
	static JLabel p32 = new JLabel("");
	static JLabel p42 = new JLabel("");
	static JLabel p52 = new JLabel("");
	static JLabel p62 = new JLabel("");
	static JLabel p01 = new JLabel("");
	static JLabel p11 = new JLabel("");
	static JLabel p21 = new JLabel("");
	static JLabel p31 = new JLabel("");
	static JLabel p41 = new JLabel("");
	static JLabel p51 = new JLabel("");
	static JLabel p61 = new JLabel("");
	static JLabel p00 = new JLabel("");
	static JLabel p10 = new JLabel("");
	static JLabel p20 = new JLabel("");
	static JLabel p30 = new JLabel("");
	static JLabel p40 = new JLabel("");
	static JLabel p50 = new JLabel("");
	static JLabel p60 = new JLabel("");
	
	
	public PersonDisplay() {
		setOpaque(false);
		setLayout(new MigLayout("", "[50px][50px][50px][50px][50px][50px][50px]", "[50px][50px][50px][50px][50px][50px][50px]"));
		
		add(p06, "cell 0 0");		
	
		add(p16, "cell 1 0");		
		
		add(p26, "cell 2 0");
				
		add(p36, "cell 3 0");		
		
		add(p46, "cell 4 0");
				
		add(p56, "cell 5 0");
			
		add(p66, "cell 6 0");
		
		add(p05, "cell 0 1");
		
		add(p15, "cell 1 1");
		
		add(p25, "cell 2 1");
		
		add(p35, "cell 3 1");
		
		add(p45, "cell 4 1");
		
		add (p55, "cell 5 1");
		
		add(p65, "cell 6 1");
		
		add(p04, "cell 0 2");
		
		add(p14, "cell 1 2");
		
		add(p24, "cell 2 2");

		add(p34, "cell 3 2");

		add(p44, "cell 4 2");

		add(p54, "cell 5 2");

		add(p64, "cell 6 2");

		add(p03, "cell 0 3");

		add(p13, "cell 1 3");

		add(p23, "cell 2 3");
		
		add(p33, "cell 3 3");
	
		add(p43, "cell 4 3");
		
		add(p53, "cell 5 3");
		
		add(p63, "cell 6 3");
		
		add(p02, "cell 0 4");
		
		add(p12, "cell 1 4");
		
		add(p22, "cell 2 4");
		
		add(p32, "cell 3 4");
		
		add(p42, "cell 4 4");
		
		add(p52, "cell 5 4");
		
		add(p62, "cell 6 4");
		
		add(p01, "cell 0 5");
		
		add(p11, "cell 1 5");
		
		add(p21, "cell 2 5");
		
		add(p31, "cell 3 5");
		
		add(p41, "cell 4 5");
		
		add(p51, "cell 5 5");
		
		add(p61, "cell 6 5");
		
		add(p00, "cell 0 6");
		
		add(p10, "cell 1 6");
		
		add(p20, "cell 2 6");
		
		add(p30, "cell 3 6");
		
		add(p40, "cell 4 6");
		
		add(p50, "cell 5 6");
		
		add(p60, "cell 6 6");
	}
	public static void Paint (int x1,int y1,int x2, int y2)
	{
		p00.setIcon(null);
		p01.setIcon(null);
		p02.setIcon(null);
		p03.setIcon(null);
		p04.setIcon(null);
		p05.setIcon(null);
		p06.setIcon(null);
		p10.setIcon(null);
		p11.setIcon(null);
		p12.setIcon(null);
		p13.setIcon(null);
		p14.setIcon(null);
		p15.setIcon(null);
		p16.setIcon(null);
		p20.setIcon(null);
		p21.setIcon(null);
		p22.setIcon(null);
		p23.setIcon(null);
		p24.setIcon(null);
		p25.setIcon(null);
		p26.setIcon(null);
		p30.setIcon(null);
		p31.setIcon(null);
		p32.setIcon(null);
		p33.setIcon(null);
		p34.setIcon(null);
		p35.setIcon(null);
		p36.setIcon(null);
		p40.setIcon(null);
		p41.setIcon(null);
		p42.setIcon(null);
		p43.setIcon(null);
		p44.setIcon(null);
		p45.setIcon(null);
		p46.setIcon(null);
		p50.setIcon(null);
		p51.setIcon(null);
		p52.setIcon(null);
		p53.setIcon(null);
		p54.setIcon(null);
		p55.setIcon(null);
		p56.setIcon(null);
		p60.setIcon(null);
		p61.setIcon(null);
		p62.setIcon(null);
		p63.setIcon(null);
		p64.setIcon(null);
		p65.setIcon(null);
		p66.setIcon(null);
		if(x1==0)
		{
			if(y1==0)
			{
				p00.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==1)
			{
				p01.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==2)
			{
				p02.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==3)
			{
				p03.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==4)
			{
				p04.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==5)
			{
				p05.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==6)
			{
				p06.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
		}
		if(x1==1)
		{
			if(y1==0)
			{
				p10.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==1)
			{
				p11.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==2)
			{
				p12.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==3)
			{
				p13.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==4)
			{
				p14.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==5)
			{
				p15.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==6)
			{
				p16.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
		}
		if(x1==2)
		{
			if(y1==0)
			{
				p20.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==1)
			{
				p21.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==2)
			{
				p22.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==3)
			{
				p23.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==4)
			{
				p24.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==5)
			{
				p25.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==6)
			{
				p26.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
		}
		if(x1==3)
		{
			if(y1==0)
			{
				p30.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==1)
			{
				p31.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==2)
			{
				p32.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==3)
			{
				p33.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==4)
			{
				p34.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==5)
			{
				p35.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==6)
			{
				p36.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
		}
		if(x1==4)
		{
			if(y1==0)
			{
				p40.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==1)
			{
				p41.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==2)
			{
				p42.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==3)
			{
				p43.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==4)
			{
				p44.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==5)
			{
				p45.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==6)
			{
				p46.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
		}
		if(x1==5)
		{
			if(y1==0)
			{
				p50.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==1)
			{
				p51.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==2)
			{
				p52.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==3)
			{
				p53.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==4)
			{
				p54.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==5)
			{
				p55.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==6)
			{
				p56.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
		}
		if(x1==6)
		{
			if(y1==0)
			{
				p60.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==1)
			{
				p61.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==2)
			{
				p62.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==3)
			{
				p63.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==4)
			{
				p64.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==5)
			{
				p65.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
			if(y1==6)
			{
				p66.setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
			}
		}
		if(x2==0)
		{
			if(y2==0)
			{
				p00.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==1)
			{
				p01.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==2)
			{
				p02.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==3)
			{
				p03.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==4)
			{
				p04.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==5)
			{
				p05.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==6)
			{
				p06.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
		}
		if(x2==1)
		{
			if(y2==0)
			{
				p10.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==1)
			{
				p11.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==2)
			{
				p12.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==3)
			{
				p13.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==4)
			{
				p14.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==5)
			{
				p15.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==6)
			{
				p16.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
		}
		if(x2==2)
		{
			if(y2==0)
			{
				p20.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==1)
			{
				p21.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==2)
			{
				p22.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==3)
			{
				p23.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==4)
			{
				p24.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==5)
			{
				p25.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==6)
			{
				p26.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
		}
		if(x2==3)
		{
			if(y2==0)
			{
				p30.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==1)
			{
				p31.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==2)
			{
				p32.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==3)
			{
				p33.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==4)
			{
				p34.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==5)
			{
				p35.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==6)
			{
				p36.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
		}
		if(x2==4)
		{
			if(y2==0)
			{
				p40.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==1)
			{
				p41.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==2)
			{
				p42.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==3)
			{
				p43.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==4)
			{
				p44.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==5)
			{
				p45.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==6)
			{
				p46.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
		}
		if(x2==5)
		{
			if(y2==0)
			{
				p50.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==1)
			{
				p51.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==2)
			{
				p52.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==3)
			{
				p53.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==4)
			{
				p54.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==5)
			{
				p55.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==6)
			{
				p56.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
		}
		if(x2==6)
		{
			if(y2==0)
			{
				p60.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==1)
			{
				p61.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==2)
			{
				p62.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==3)
			{
				p63.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==4)
			{
				p64.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==5)
			{
				p65.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
			if(y2==6)
			{
				p66.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
			}
		}
	}	
}