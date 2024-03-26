//package learn.fpoly.restapi.server;
//
//import static learn.fpoly.restapi.server.ApiServices.BASE_URL;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class HttpRequest {
//    private ApiServices requestInterface;
//
//    public HttpRequest() {
//        requestInterface = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build().create(ApiServices.class);
//    }
//    public ApiServices callAPI() {
//        return requestInterface;
//    }
//}
