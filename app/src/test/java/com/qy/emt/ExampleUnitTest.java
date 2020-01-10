package com.qy.emt;

import android.os.Message;

import com.alibaba.fastjson.JSONObject;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.qy.emt.utils.CoinUsdtUtil;
import com.qy.emt.utils.Utils;
import com.qy.emt.websocket.SocketClient;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.qy.emt.utils.CoinUsdtUtil.METHOD_GET_BALANCE;
import static com.qy.emt.utils.CoinUsdtUtil.USDT_SERVER_PASSWORD;
import static com.qy.emt.utils.CoinUsdtUtil.USDT_SERVER_USERNAME;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    public static final int SHOW = 0;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getEthBalance() throws URISyntaxException, InterruptedException {
//        System.out.println(ETHUtils.formatEth(new BigInteger("12000000000000000000")));

        SocketClient.webMarket();
        while (true) {
            Thread.sleep(5000L);

            JSONObject resultJsonObject = JSONObject.parseObject(SocketClient.result);

            for (Object object : resultJsonObject.getJSONArray("type_list")) {
                JSONObject jsonObject = (JSONObject) object;
                for (Object object1 : jsonObject.getJSONArray("data")){
                    JSONObject jsonObject1 = (JSONObject) object1;
                    String change_percent= jsonObject1.getString("up_down");
                    String name= jsonObject1.getString("lname")+jsonObject1.getString("fname");
                    String current_price_usd=jsonObject1.getString("latest_price");
                    String logo=jsonObject1.getString("https://raw.githubusercontent.com/iozhaq/image/master/"+jsonObject1.getString("lname")+".png");
                    String current_price_cny=jsonObject1.getString("latest_price_xs");
                    JSONObject jsonObject2 = new JSONObject();
                    jsonObject2.put("change_percent",change_percent);
                    jsonObject2.put("name",name);
                    jsonObject2.put("current_price_usd",current_price_usd);
                    jsonObject2.put("logo",logo);
                    jsonObject2.put("current_price_cny",current_price_cny);

                    System.out.println(JSONObject.toJSONString(jsonObject2));

                }
            }
//            System.out.println(SocketClient.result);
        }

    }

    @Test
    public void cutNum() throws Throwable {

        String creb = Base64.encodeBase64String((USDT_SERVER_USERNAME + ":" + USDT_SERVER_PASSWORD).getBytes()).toString();

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Basic " + creb);
        List<Object> objects = new ArrayList<>();
        objects.add("19yr9Hoyt6RmkuTGdZxFawuASruPHHLuBQ");
        objects.add(31);
        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL(CoinUsdtUtil.USDT_MAINNET_URL), headers);
        Object result = client.invoke(METHOD_GET_BALANCE, objects, Object.class);
        System.out.println(JSONObject.toJSONString(result));
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(result));

        System.out.println(Utils.subZeroAndDot(jsonObject.getString("balance")));
    }

    @Test
    public void getJsoupData() {

        String url = "http://47.244.61.154:8080/wallet/browser/transactionPageByAddress?address=0x1E96923AD22375d2D2ff24d3c9A3b1A10166F608&pageSize=10&pageNo=1";

        String content = "";

        //1.0 创建okhttpClinet
        OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build();

        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                System.out.println(call.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                System.out.println(string);
                Message msg = Message.obtain();
                msg.obj = string;
            }
        });

        System.out.println(content);
    }
}