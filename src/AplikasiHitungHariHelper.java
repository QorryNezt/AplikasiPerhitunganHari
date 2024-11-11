/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Sayyida Qurrata A'yunin - 2210010331
 */
public class AplikasiHitungHariHelper {
     public static long calculateDaysBetween(LocalDate hariAwal, LocalDate hariAkhir) {
        return ChronoUnit.DAYS.between(hariAwal, hariAkhir);
     }
}
