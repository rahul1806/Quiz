package quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
class quizapps 
{
 public static void main(String args[])
	{
  String arr[]= { 
 "Who invented the telephone?\t \n",
" Which nail grows fastest?\n",
" What temperature does water boil at?\n",
" Who discovered penicillin?\n",
" What Spanish artist said he would eat his wife when she died?\n",
" Who wrote Julius Caesar, Macbeth and Hamlet?\n",            
" Who wrote Lazarillo de Tormes?\n", 
" What did the crocodile swallow in Peter Pan?\n",
" Where was Lope de Vega born?\n",
" Who did Lady Diana Spencer marry?\n",
"Where is Mulhacen? \n",
" How many states are there in the United States of America?\n",
" Which river passes through Madrid? \n",
" What year did the Spanish Civil War end?\n",
" When did the First World War start?\n",
" What did Joseph Priesley discover in 1774?\n",
" Where is the smallest bone in the body?\n",
" Which is the only mammal that can’t jump ?\n",
" What does the roman numeral C represent?\n",
" What’s the best known artificial international language?\n"};
	 
	 String ans[]= {"GRAHAM BELL","MIDDLE","100C","FLEMING","DALI",
			 "SHAKESPEARE","ANONYMUS","CLOCK","MADRID","PRINCE CHARLES","GRENADA,SPAIN",
			 "50","MANZANARES","1939","1912","OXYGEN",
			 "EAR","ELEPHANT","100","ESPERANTO"};
	 
	 String opt1[]= {"GRAHAM BELL","LITTLE","100F","FLEMING","DALI",
			 "CANNON DOYLE","ANONYMUS","TABLE","MADRID","PRINCE HARRY","EGYPT",
			 "50","NILE","1930","1919","OXYGEN",
			 "EAR","BULL","100","POLISH"};
	 
	 String opt2[]= {"JAMES WATT","PINKY","100C","G.MANDEL","ANONYMUS",
			 "SHAKESPEARE","H.LONGFELLOW","MONKEY","PORTUGAL","PRINCE CHARLES","ZAMBIA",
			 "49","ORANGE","1959","1913","HYDROGEN",
			 "TEETH","CAMEL","200","CHINESE"};
	 
	 String opt3[]= {"TESLA","THUMB","110C","CHARLES DARWIN","SCARLET",
			 "NILATILSON","CHARLES DICKEN","FISH","ITALY","KING ALEX CIPHER","GRENADA,SPAIN",
			 "48","MANZANARES","1937","1914","NEON",
			 "NOSE","RHINO","50","FRENCH"};
	 
	 String opt4[]= {"M.FARADAY","MIDDLE","300K","AV LEUVENHOEKE","BRUTUS",
			 "H.LONGFELLOW","ROBERT FROST","CLOCK","SOUTH AFRICA","PRINCE WHARTON","MIAMI",
			 "46","AMAZON","1939","1912","NITROGEN",
			 "LITTLE FINGER(TOE)","ELEPHANT","75","ESPERANTO"};
	 
             
            JPanel panel=new JPanel();
            
			JFrame ob=new JFrame();
			ob.setLayout(null);
			ob.setSize(1350, 600);
			ob.setResizable(true);
	        ob.setVisible(true);
	        ob.setTitle("QUIZ APP");
	        JTextField textarea=new JTextField();
	        JButton button1=new JButton("START QUIZ");
	        button1.setBounds(900,500,150,30);
	        ob.add(button1);
	        button1.setLayout(null);
	        button1.setVisible(true);
	        ImageIcon icon=new ImageIcon();
	        JLabel label1=new JLabel(icon);
	        JLabel label2=new JLabel();
	        label1.setLayout(null);
	        label1.setBounds(10, 50,1300, 100);
	        ob.add(label1);
	        
	        Font font=new Font("Serif",Font.BOLD,40);
	        
	      label1.setFont(font);
	      label1.setText("WELCOME TO QUIZ GAME"); 
	      label2.setText("ENTER YOUR NAME :");
	      label2.setLabelFor(null);
	      label2.setBounds(400, 150, 300, 200);
	      ob.add(label2);
	      panel.setBackground(Color.BLUE);
	      Font font1=new Font("Serif",Font.BOLD,20);
	      label2.setFont(font1);
	      textarea.setBounds(650, 230, 300, 40);
	      ob.add(textarea);
	      textarea.setFont(font1);
	     
	      button1.addActionListener(new ActionListener()
	   	  { 
                 int cn=0,p=0,m=0,n=0,o=0,correct=0,wrong=0;
                 String correct1="correct",wrong1="wrong",str1="";
              	 JRadioButton option1=new JRadioButton();
	    		 JRadioButton option2=new JRadioButton();
	    		 JRadioButton option3=new JRadioButton();
	    		 JRadioButton option4=new JRadioButton();  	
	    		 
	    		 Random random=new Random();
	             int g= random.nextInt(20);
	    		 
	    		 ButtonGroup bg=new ButtonGroup();
	    		
	    		 public void actionPerformed(ActionEvent e)
	    	 { 
	    			  try{    
		    	            FileWriter fout=new FileWriter("D:\\"+textarea.getText(),true);    
		    	                
		    	            {
		    	        
		    	            fout.write("ques : "+(cn+1)+arr[g]+"");
		    	            fout.write("( correct ans: "+ans[g]+" )"+"\n");
		    	           
		    	            }
		    	            
		    	            fout.close();   
		    	            System.out.println("success...");    
		    	           }
	    			  
	    			  catch(Exception e1){System.out.println(e1);}  
	    			 
	    			 button1.setText("NEXT");
	    			label2.setText("");
	    			label2.setText("PLAYER'S NAME :"+textarea.getText());
	    			label2.setBounds(1050,-60, 500, 200);
	    			Font font1=new Font("Serif",Font.BOLD,15);
	    		      label2.setFont(font1);
	    		      textarea.setBounds(1000, 1000, 00, 00);
	    		      
	    			 
	    			 if(option1.isSelected())
	    			 {
	    				 if(option1.getText().equals(ans[g-1]))
	    				 {
	    				 correct++;
	    				str1 =correct1;
	    				 }
	    				 else 
	    				 {
	    					 wrong++;
	    					 str1=wrong1;
	    					 
	    				 }
	    			 }
	    			 
	    			 if(option2.isSelected())
	    			 {
	    				 if(option2.getText().equals(ans[g-1]))
	    				 {
	    				 correct++;
	    				 str1=correct1;
	    				 }
	    				 else 
	    				 {
	    					 wrong++;
	    					 str1=wrong1;
	    				 }
	    			 }
	    			 
	    			 if(option3.isSelected())
	    			 {
	    				 if(option3.getText().equals(ans[g-1]))
	    				 {
	    				 correct++;
	    				 str1=correct1;
	    				 }
	    				 else 
	    				 {
	    					 wrong++;
	    					 str1=wrong1;
	    				 }
	    			 }
	    			 
	    			 if(option4.isSelected())
	    			 {
	    				 if(option4.getText().equals(ans[g-1]))
	    				 {
	    				 correct++;
	    				 str1=correct1;
	    				 }
	    				 else 
	    				 {
	    					wrong++;
	    					str1=wrong1;
	    				 }
	    			 }
			       if(cn<5)
	    		 {
			            option3.setBounds(400,400,180,40);
				        ob.add(option3);
				        bg.add(option3);
				        option3.setLayout(null);
				        option3.setVisible(true);
				        ob.add(panel);
				        panel.setVisible(true);
				     
				        option4.setBounds(750,400,180,40);
				        ob.add(option4);
				        bg.add(option4);
				        option4.setLayout(null);
				        option4.setVisible(true);
				        ob.add(panel);
				        panel.setVisible(true);
				  
				        option1.setBounds(400,350,180,40);
				        ob.add(option1);
				        bg.add(option1);
				        option1.setLayout(null);
				        option1.setVisible(true);
				        ob.add(panel);
				        panel.setVisible(true);
				          
				        option2.setBounds(750,350,180,40);
				        ob.add(option2);
				        bg.add(option2);
				        option2.setLayout(null);
				        option2.setVisible(true);
				        ob.add(panel);
				        panel.setVisible(true);
				        
			    	label1.setText("Q."+(cn+1)+": "+arr[g]);
	    		    option2.setText(opt2[g]);
	    		    option3.setText(opt3[g]);
	    		    option4.setText(opt4[g]);
	    		    option1.setText(opt1[g]);
	
	    		   bg.clearSelection();  
	    		   cn++;
	    	       p++;
	    	       m++;
	    	       n++;
	    	       o++;
	    	       g++;
				 }
			       
	    		 else
	    		 {
	    		    button1.setText("SUBMIT QUIZ");
	    			button1.addActionListener(new ActionListener()
	    			{
	    				 public void actionPerformed(ActionEvent e)
	    		    	 { 
	    					 
	    					 JPanel panel=new JPanel();
	    						JFrame ob=new JFrame();
	    						ob.setSize(600, 600);
	    						ob.setResizable(true);
	    				        ob.setVisible(true);
	    				        ob.setTitle("YOUR SCORE");
	    				     
	    					    JLabel label1=new JLabel(icon);
	    				        label1.setLayout(null);
	    				        ob.add(label1);
	    				        Font font=new Font("Serif",Font.BOLD,48);
	    				      label1.setFont(font);
	    				      label1.setText("YOUR SCORE:   "+((correct*2)-wrong));
	    				      
	    		    	 }
	    			});
	    		 }
	         }});}
}
		      
	