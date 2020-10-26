package com.seaboxdata.hlbejk.service.utils;

import ch.qos.logback.core.joran.conditional.ElseAction;
import com.alibaba.fastjson.JSONObject;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yzn00 on 2020/10/22.
 */
public class HttpClientUtils {

    /***
     * post返回json对象
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public static String getJsonByPost(String url, Map params,String encoding) throws IOException {
        String result = "";
        // 创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        post.addHeader("Content-Type", "application/json");
        if (null != params && params.size() > 0) {
            post.setEntity(new StringEntity(JSONObject.toJSONString(params),StringUtils.isEmpty(encoding)?"utf-8":encoding));
        }
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(post);
            // 获取结果实体
            // 判断网络连接状态码是否正常(0--200都数正常)
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result = EntityUtils.toString(response.getEntity(), StringUtils.isEmpty(encoding)?"utf-8":encoding);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
                if (response != null) {
                    // 释放链接
                    response.close();
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return result.replaceAll("null", "\"\"");
    }

    public static String httpPostWithJson(String url, String json) {
        String returnValue = "";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try{
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();

            //第二步：创建httpPost对象
            HttpPost httpPost = new HttpPost(url);

            //第三步：给httpPost设置JSON格式的参数
            StringEntity requestEntity = new StringEntity(json,"utf-8");
            requestEntity.setContentEncoding("UTF-8");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setEntity(requestEntity);

            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost,responseHandler); //调接口获取返回值时，必须用此方法

        }
        catch(IOException e){
            e.printStackTrace();
        }

        finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }

    /**
     * get返回json对象
     *
     * @param url
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String getJsonByGet(String url) throws ClientProtocolException, IOException {
        String result = "";

        // 创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 创建get方式请求对象
        HttpGet httpGet = new HttpGet(url);


        httpGet.addHeader("Content-type", "application/json");
        // 通过请求对象获取响应对象
        CloseableHttpResponse response = httpClient.execute(httpGet);
        try {
            // 获取结果实体
            // 判断网络连接状态码是否正常(0--200都数正常)
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result = EntityUtils.toString(response.getEntity(), "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
                if (response != null) {
                    // 释放链接
                    response.close();
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return result.replaceAll("null", "\"\"");
    }

    public static String returnTest(boolean isDetail,boolean isExitsNotGen,int id) {
        String postNames = "";
        if (!isDetail)
            postNames = "{\"code\": 0, \"all_alg\": {\"Linear\": {\"algorithm_type\": 1, \"alg_id\": 1001}, \"Gru\": {\"algorithm_type\": 1, \"alg_id\": 1002}, \"Lstm\": {\"algorithm_type\": 1, \"alg_id\": 1003}, \"Xgb_regressor\": {\"algorithm_type\": 1, \"alg_id\": 1004}, \"RF_regressor\": {\"algorithm_type\": 1, \"alg_id\": 1005}, \"SVR\": {\"algorithm_type\": 1, \"alg_id\": 1006}, \"GBDT_regression\": {\"algorithm_type\": 1, \"alg_id\": 1006}, \"PLS\": {\"algorithm_type\": 1, \"alg_id\": 1007}, \"Decision_Tree_regression\": {\"algorithm_type\": 1, \"alg_id\": 1008}, \"Lasso\": {\"algorithm_type\": 1, \"alg_id\": 1009}, \"Decision_Tree\": {\"algorithm_type\": 2, \"alg_id\": 2001}, \"LR\": {\"algorithm_type\": 2, \"alg_id\": 2002}, \"GBDT\": {\"algorithm_type\": 2, \"alg_id\": 2003}, \"SVM\": {\"algorithm_type\": 2, \"alg_id\": 2004}, \"Naivebayes\": {\"algorithm_type\": 2, \"alg_id\": 2005}, \"RF\": {\"algorithm_type\": 2, \"alg_id\": 2006}, \"Xgb\": {\"algorithm_type\": 2, \"alg_id\": 2007}, \"Prophet\": {\"algorithm_type\": 3, \"alg_id\": 3001}, \"Arima\": {\"algorithm_type\": 3, \"alg_id\": 3002}, \"Kmeans\": {\"algorithm_type\": 4, \"alg_id\": 4001}, \"Gmm\": {\"algorithm_type\": 4, \"alg_id\": 3002}, \"Als\": {\"algorithm_type\": 5, \"alg_id\": 5001}, \"Fpgrowth\": {\"algorithm_type\": 6, \"alg_id\": 6001}}}";
        else{
            postNames = "{\"alg_ip\": \"10.1.1.233\", \"alg_id\": \"1002\",\"alg_path\": \"/saim/v1/interactive/alginfo\", \"alg_info\": [{\"name\": \"n_estimators\", \"default\":\n" +
                    "\t\t\t90, \"description\": \"集成中弱评估器的数量\", \"type\": \"int\"}, {\"name\": \"max_depth\", \"default\": 3, \"description\": \"最大树深\", \"type\":\n" +
                    "\t\t\t\"int\"}, {\"name\": \"learning_rate\", \"default\": 0.1, \"description\": \"学习率\", \"type\": \"float\"}, {\"name\": \"subsample\",\n" +
                    "\t\t\t\"default\": 0.8, \"description\": \"随机抽样的时候抽取的样本比例\", \"type\": \"float\"}, {\"name\": \"min_child_weight\", \"default\": 1,\n" +
                    "\t\t\t\"description\": \"最小叶子节点样本权重和\", \"type\": \"int\"}]}";
            JSONObject jsonObject = JSONObject.parseObject(postNames);
            if(null!=jsonObject.get("alg_id")&& id !=(Integer.parseInt(jsonObject.get("alg_id").toString()))){
                jsonObject.put("alg_id",id);
                jsonObject.put("alg_path",jsonObject.get("alg_path").toString()+"/"+id);
                postNames = JSONObject.toJSONString(jsonObject);
            }
        }
        return postNames;
    }
}
