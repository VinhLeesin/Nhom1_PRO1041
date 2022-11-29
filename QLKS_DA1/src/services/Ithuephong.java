/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodel.dthuephong;
import java.util.List;

/**
 *
 * @author MrpDuy
 */
public interface Ithuephong {
    public  List<dthuephong> getAlldata();
    public  List<dthuephong> phongchuatt();
    public int  themthuep(dthuephong tp);
    public int  suathuep(dthuephong tp);
    public int thanhtoan(String map);
    public dthuephong getphongtheoma(String maphong);
}
