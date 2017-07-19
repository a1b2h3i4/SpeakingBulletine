/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author abhishek
 */
public class ApiTest {
Connection c;
    PreparedStatement st;
     PreparedStatement connect()
    {    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhiabhi","root","123");
    st=c.prepareStatement("insert into abhi(photo) values (?)");
    }catch(Exception e)
     {
         System.out.println(e);
     }
return st;
    }

    
    /**
     * @param args the command line arguments
     */
           static String sa[],s1[];
    public String pond()
    {
      
        try {
            int i;
            ApiTest ob=new ApiTest();
            String API_KEY="2c4f99161db24455b2ef23e6763045fb";
//            String base="https://newsapi.org/v1/articles?source=cnbc&sortBy=top&apiKey=2c4f99161db24455b2ef23e6763045fb=";
String base="https://newsapi.org/v1/articles?source=google-news&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";  
String s=ob.resp(base);
JSONObject jobject=new JSONObject(s);
JSONArray jArray=jobject.getJSONArray("articles");
sa=new String[jArray.length()];
 s1=new String[jArray.length()];
for(i=0;i<jArray.length();i++)
{
    JSONObject ob1;
    ob1 = jArray.getJSONObject(i);
    String url=ob1.getString("urlToImage");
    System.out.println(url);
    s1[i]=url;
    sa[i]= ob1.getString("description");
}

            for(i=0;i<s1.length;i++){
                System.out.println(s1[i]);
                    if(s1[i]==null) 
                    continue;
                URL u=new URL(s1[i]);
                        st=c.prepareStatement("insert into abhi values(?)");
                     Image img=ImageIO.read(u);
                     System.out.println(img);
       ByteArrayOutputStream os = new ByteArrayOutputStream();
ImageIO.write((RenderedImage)img,"jpg",os); 
InputStream fis = new ByteArrayInputStream(os.toByteArray());
                       st.setBinaryStream(1, fis);
                        int s1=st.executeUpdate();
                        System.out.println(s);
                }
    
        } catch (JSONException ex) {
            Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
        Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
    }
        return sa[9];
    }
    public static void main(String[] args) {
        new ApiTest().pond();
        try{
            for(int j=0;j<s1.length;j++)
            {
                File fa=new File("D:\\abc.txt");
                FileWriter fw=new FileWriter(fa);
                fw.write(s1[j]+"\n");
            }
            for(int j=0;j<sa.length;j++)
            {
            URL u=new URL(sa[j]);
            BufferedImage img=null;
            File f=new File("D:\\abhi"+j+".jpg");
            img = ImageIO.read(u);
            ImageIO.write(img, "jpg",f);
            RenderedImage bimg=(RenderedImage)img;
            ImageIO.write(bimg,"jpg", f);
            System.out.println(sa);
            }
        }catch(Exception e){}
    }
    public String resp(String url)
    {
        String resp=null;
        StringBuffer response = null;
        try
        {
          URL base=new URL(url);
            HttpURLConnection conn=(HttpURLConnection) base.openConnection();
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");
            conn.connect();
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                response = new StringBuffer();
                
                while ((resp = in.readLine()) != null) {
                    response.append(resp);
                }
            }            
        }
        catch(IOException e)
        {
        }        
        return response.toString();
    }    

}
