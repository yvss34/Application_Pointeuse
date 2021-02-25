
import java.sql.Timestamp;
import java.util.List;

import beans.*;
import dao.*;

public class test {

	public static void main(String[] args) {
		
		DaoFactory daoFactory = DaoFactory.getInstance();
        
	    SoutienScolaireDao soutienScolaireDao;
	    soutienScolaireDao = daoFactory.getSoutienScolaireDao();
        SoutienScolaire soutien = soutienScolaireDao.getSoutienScolaire();
        
        System.out.println(soutien.toString());
	}
}
