package com.yinom.pdd.struts.action;

import com.opensymphony.xwork2.ModelDriven;
import com.yinom.pdd.struts.model.Department;
import com.yinom.pdd.struts.service.DepartmentService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by yindp on 4/28/17.
 */
public class DepartmentAction implements ModelDriven {
    private Department dept;
    private File[] photo;
    private String[] photoFileName;
    private String[] photoContentType;

    public File[] getPhoto() {
        return photo;
    }

    public void setPhoto(File[] photo) {
        this.photo = photo;
    }

    public String[] getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String[] photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String[] getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String[] photoContentType) {
        this.photoContentType = photoContentType;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String add() {
        return "add";
    }

    public String doAdd() {
        return "doAdd";
    }

    public String update() throws InvocationTargetException, IllegalAccessException {
        DepartmentService ds = new DepartmentService();
        Department dm = ds.load();
       /* dept.setId(dm.getId());
        dept.setName(dm.getName());*/
        BeanUtils.copyProperties(dept, dm);
        return "update";
    }

    public String upload() {
        return "upload";
    }

    public String doUpload() throws IOException {
        /*System.out.println(photo);
        System.out.println(photoFileName);
        System.out.println(photoContentType);*/
        for(int i=0;i<photo.length;i++) {
            FileUtils.copyFile(photo[i],new File("image/"+photoFileName[i]));
        }

        return "doUpload";
    }

    public Object getModel() {
        if (dept == null) {
            dept = new Department();
        }
        return dept;
    }
}
