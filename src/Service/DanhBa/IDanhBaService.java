package Service.DanhBa;

import Model.DanhBa;
import Service.IServiceGeneric;

public interface IDanhBaService extends IServiceGeneric {


    void save(DanhBa danhBa);

    void Delete(int id);

    void editDanhBaByID(int id, int sdt, String nhomDanhBa, String name, String gioiTinh, String address, int ngaySinh, String email);

    DanhBa findByName(String name);
}
