package com.example.frontendbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.*;

@RestController
public class CalcController {
    private double round2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
    @GetMapping("/calc/add/{n1}/{n2}")
    public Map<String, Object> add(@PathVariable int n1, @PathVariable int n2){
        int s = n1+n2;
        return Map.of("operation","addition","result",s);
    }
    @GetMapping("/calc/pow/{n1}/{n2}")
    public Map<String, Object> pow(@PathVariable int n1,@PathVariable int n2){
        double s = round2(Math.pow(n1, n2));
        return Map.of("operation","Power","result",s);
    }
    @GetMapping("/calc/sqrt/{n}")
    public Map<String, Object> sqrt(@PathVariable int n){
        double s = round2(Math.sqrt(n));
        return Map.of("operation","Square root","result",s);
    }
    @GetMapping("/calc/sin/{n}")
    public Map<String, Object> sin(@PathVariable int n){
        double s = round2(Math.sin(n));
        return Map.of("operation","Sine","result",s);
    }
    @GetMapping("/calc/cos/{n}")
    public Map<String, Object> cos(@PathVariable int n){
        double s =round2(Math.cos(n));
        return Map.of("operation","Cosine","result",s);
    }
    @GetMapping("/calc/tan/{n}")
    public Map<String, Object> tan(@PathVariable int n){
        double s = round2(Math.tan(Math.toRadians(n)));
        return Map.of("operation","Tangent","result",s);
    }
    @GetMapping("/spiral")
    public List<Integer> spi(){
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int top =0;
        int bottom = mat.length-1;
        int left=0;
        int right = mat[0].length-1;


        List<Integer> l = new ArrayList<>();

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                l.add(mat[top][i]);

            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(mat[i][right]);

            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(mat[bottom][i]);

                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    l.add(mat[i][left]);

                }
                left++;
            }

        }
        return l;
    }

}
