/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author wyki
 */
public class Currencyconverter2 {
    
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Currencyconverter2 obj1 = new Currencyconverter2 ();
        
        
//        try{
//            URL oracle = new URL("http://openexchangerates.org/api/latest.json?app_id=0f62edab50084331a7068ecf57021b2c");
//            URLConnection yc = oracle.openConnection();
//            BufferedReader in = new BufferedReader(new InputStreamReader(
//                                    yc.getInputStream()));
//            String inputLine;
//            while ((inputLine = in.readLine()) != null) 
//                System.out.println(inputLine);
//            in.close();
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
    }
    
    //fetch data from the url
    public static String sendRequest (String url){
        String result = "";
        try{
            HttpClient client = new DefaultHttpClient();
            HttpParams httpParameters = client.getParams();
            HttpConnectionParams.setConnectionTimeout(httpParameters, 5000);
            HttpConnectionParams.setSoTimeout(httpParameters, 5000);
            HttpConnectionParams.setTcpNoDelay(httpParameters, true);
            HttpGet request = new HttpGet();
            request.setURI(new URI(url));
            HttpResponse response = client.execute(request);
            InputStream ips = response.getEntity().getContent();
            
            BufferedReader buf = new BufferedReader(new InputStreamReader(ips, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            String s;
            while (true) {
                s = buf.readLine();
                if (s == null || s.length()== 0)
                    break;
                sb.append(s);
            }
            buf.close();
            ips.close();
            result = sb.toString();
            
        } catch (Exception e){
            e.printStackTrace();
    }
        return result;
    }

    //Parse the fetched data
    /**
     *
     * @param respo
     */
    public static void GroupResult(String respo) throws FileNotFoundException, UnsupportedEncodingException{
        JSONObject myjson;
        try 
        {
            PrintWriter writer = new PrintWriter("currencies.txt","UTF-8");
           //parse the time stamp into an integer
            myjson = new JSONObject(respo);
            Integer stamptime = (Integer) myjson.get("timestamp");
            writer.println("Time Stamp: " +stamptime);          
            
           
            JSONObject mykeys = (JSONObject) myjson.get("rates");
            Iterator keysToDisplay = mykeys.keys();
            
             //parse the rates keys(currencies) into array of type string
            List<String> keyList = new ArrayList<String>();
            while (keysToDisplay.hasNext()){
                String key = (String)keysToDisplay.next();
                keyList.add(key);
               
                //System.out.println(key);
            }
            String [] keysArray = keyList.toArray(new String[keyList.size()]);            
            
            
            //parse the exchange rates' values and currencies
            for (int i = 0; i < mykeys.length(); ++i){     
               
               if ("USD".equals(keysArray[i])){
                   
               }else if (!"KES".equals(keysArray[i])){
                    writer.print(keysArray[i]+": ");
                    try{
                        Double currencyvalue = (Double)mykeys.get(keysArray[i]);
                        Double divisionvalue = 1.0 / (Double)mykeys.get("KES");
                        Double exchangerate = currencyvalue * divisionvalue;
                        writer.println(exchangerate);
                    }catch (Exception ex){                        
                        Integer currencyvalue = (Integer)mykeys.get(keysArray[i]);
                        Double divisionvalue = 1.0 / (Double)mykeys.get("KES");
                        Double exchangerate = (currencyvalue) * divisionvalue;
                        writer.println(exchangerate);
                    }
                }else{
                    writer.print("USSD: ");                    
                    writer.println(1.0 / (Double)mykeys.get(keysArray[i]));                    
                }
            }
            
            writer.close();
            
        } 
        catch (JSONException e) {
            e.printStackTrace();
        }
    }
    
   
}