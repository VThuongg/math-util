/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuong.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    //Trong class này cung cấp cho ai đó rất nhiều hàm xử lý toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó mà ko cần lưu lại các trạng thái/giá trị 
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1x2x3x4x...n
    //ko có giai thừa cho số âm
    // 0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa là 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng từ 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        
        if (n == 1 || n == 0)
            return 1;   //kết thúc sớm nếu nhận những đầu vào đặc biệt
        
        long product = 1;   //tích nhân dồn, thuật toán heo đất, ốc bu nhồi thịt
        for(int i = 1; i <= n; i++)
            product *= i;
        return product;
    }
}
