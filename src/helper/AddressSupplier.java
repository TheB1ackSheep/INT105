/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author Student LAB
 */
public class AddressSupplier {
    private static String soi[] = {
        "Soi Suwinthawong 64","Soi Suwinthawong 98","Soi Suwinthawong 61","Soi Maitri Chit 7","Soi Maitri Chit 24","Soi Sangkha Santisuk 38","Soi Sangkha Santisuk 61","Soi Bang Khae 14","Soi Kanchanaphisek 008","Soi Ngam Du Phli","Soi Ramkhamhaeng 24 Yaek 2","Soi Chan 16","Soi Thung Setthi","Soi Thep Lila","Soi Arun Ammarin 4","Soi Arun Ammarin 5","Soi Arun Ammarin 2","Soi Arun Ammarin 3","Soi Arun Ammarin 1","Soi Suwinthawong 47","Soi Ramkhamhaeng 174","Soi Bang Bon 3 Soi 12","Soi Bang Bon 5 Soi 7","Soi Bang Bon 3 Soi 5","Soi Bang Bon 4 Soi 14","Soi Charoen Krung 12","Soi Charoen Krung 107","Soi Charoen Rat 7","Soi Charoen Rat 10","Soi Sathu Pradit 58","Soi Sam Sen 5","Soi Sam Sen 8/1","Soi Phaya Nak","Soi Rama VI Soi 19","Soi Ekkachai 131","Soi Phraya Monthat Ratchasi Phichit","Soi Phan Chit","Soi Phu Ari","Soi Ramkhamhaeng 65","Soi Lat Phrao 122","Soi Buri Phirom 5","Soi Rama II Soi 28","Soi Rama II Soi 82","Soi Pracha Chuen 2 Yaek 1","Soi Pracha Chuen 2 Yaek 2","Soi Pracha Chuen 4 Yaek 1","Soi Pracha Chuen 4 Yaek 2","Soi Pracha Chuen 6 Yaek 1","Soi Pracha Chuen 6 Yaek 2","Soi Lat Phrao 64","Soi Lat Phrao 71","Soi Lat Phrao 80","Soi Lat Phrao 101","Soi Sam Sen 1","Soi Chueam Samphan 22","Soi Suwinthawong 98","Soi Suwinthawong 22","Soi Liap Khlong Sip Sam Fang Tawantok 11","Soi Chueam Samphan 11","Soi Suwinthawong 9/1","Soi Suwinthawong 32/1","Soi Suwinthawong 13 Yaek 2","Soi Wat Suk Chai 1","Soi Wat Suk Chai 4","Soi Wat Suk Chai 15","Soi Wat Suk Chai 26","Soi Mit Maitri 30","Soi Ruam Phatthana 2","Soi Suwinthawong 17","Soi Suwinthawong 42","Soi Ruam Phatthana 6","Soi Yu Witthaya 9","Soi Yu Witthaya 10","Soi Yu Witthaya 7","Soi Liap Wari 79","Soi Phahon Yothin 54/1","Soi Suwinthawong 100","Soi Nimit Mai 36","Soi Sangkha Santisuk 48","Soi Phahon Yothin 54/1 Yaek 4","Soi Chimphli 1","Soi Hathai Rat 39","Soi Kanchanaphisek 003","Soi Wanit 1","Soi Suwinthawong 33","Soi Si Bamphen","Soi Sala Daeng 1","Soi Sala Daeng 2","Soi Anamai Ngam Charoen 25 Yaek 2","Soi Sa Song","Soi Lat Phrao 64 Yaek 4","Soi On Nut 17","Soi Phatthanakan 20","Soi Thian Thale 7","Soi Anamai Ngam Charoen 30","Soi Sihaburanukit 1","Soi Suwinthawong 2","Soi Nak Niwat 16","Soi Pradit Manutham 15","Soi Chumchon Wat Bang Kradi","Soi Sam Sen 3","Soi Sukhumvit 3","Soi Sukhumvit 39","Soi Phetchaburi 38/1","Soi Sukhumvit 55","Soi Sukhumvit 62","Soi Sukhumvit 63","Soi Sukhumvit 101","Soi Sukhumvit 101/1","Soi Samran Rat","Soi Yaowarat 23","Soi Na Wang","Soi Charoen Rat 5","Soi Charoen Rat 5 Yaek 4","Soi Charoen Rat 7 Yaek 7","Soi Charoen Rat 8","Soi Naradhiwas Rajanagarindra 17","Soi Inthraphon","Soi Phet Kasem 69","Soi Sun Kan Kha Happy Land 1"
    };
    private static String road[] = {
       "Krung Kasem","Krung Thep Kritha","Krung Thon Buri","Krung Maen","Kluai Nam Thai Tat Mai","Klantan","Kanlapaphruek","Kanlayanamaitri","Kanchanaphisek","Kamnan Maen","Kamphaeng Phet","Kamphaeng Phet 1","Kamphaeng Phet 2","Kamphaeng Phet 3","Kamphaeng Phet 4","Kamphaeng Phet 5","Kamphaeng Phet 6","Kamphaeng Phet 7","King Kaeo","Kit Phanit","Kasem Rat","Kaeo","Kaeo Ngoen Thong","Kosum Ruam Chai","Kraisi","Khwan","Khao","Khao San","Khao Lam","Khiao Khai Ka","Khru Nai","Khlong Kao","Khlong Thom Wat Phiren","Khlong Thom Wat Saket","Khlong Thom Wat Sommanat","Khlong Lamchiak","Khlong Lam Pak","Convent","Khum Klao","Khu Bon","Kheha Rom Klao","Ngam Wong Wan","Chatu Chot","Charan Sanit Wong","Charat Mueang","Charat Wiang","Charun Wiang","Chom Thong","Chom Thong Burana","Chakrabongse","Chakkraphatdiphong","Chak Phet","Chakkrawat","Chan","Chan Kao","Chantharubeksa","Charu Mueang","Chueng Charoen Phanit","Charoen Krung","Charoen Nakhon","Charoen Phatthana","Charoen Mueang","Charoen Rat","Charoen Rat","Charoen Wiang","Chao Khamrop","Chao Khun Thahan","Chao Phraya Sayam","Chao Fa","Chaeng Watthana","Chalong Krung","Chimphli","Chaloem Khet 1","Chaloem Khet 2","Chaloem Khet 3","Chaloem Khet 4","Chaloem Phong","Chaloem Phra Kiat Ratchakan Thi 9","Chalaem Nimit","Chak Phra","Chaiyaphruek","Chang Akat Uthit","Chit Lom","Chettuphon","Choet Wutthakat","Chiang Mai","Chuea Phloeng","Chueam Khlong Mon","Chueam Samphan","Chok Chai 4","Na Ranong","Duang Phithak","Dao Khang","Damrong Rak","Din Daeng","Din Daeng 1","Dinso","Ditsamak","Decha Tungkha","Decho","Tri Phet","Tri Mit","Tanao","Tani","Ti Thong","Techawanit","Song Wat","Song Sawat","Song Soem","Sap","Sap Sin","Thawi Watthana","Thahan","Thahan Akat Uthit","Thap Yao","Tha Kasem","Tha Kham","Thang Rotfai Sai Kao Pak Nam","Tha Din Daeng","Thai Wang","Thung Mangkon","Thetsaban Narueman","Thetsaban Nimit Tai","Thetsaban Nimit Nuea","Thetsaban Rangrak Tai","Thetsaban Rangrak Nuea","Thetsaban Rangsan Tai","Thetsaban Rangsan Nuea","Thetsaban Rangsarit Tai","Thetsaban Rangsarit Nuea","Thetsaban Songkhro","Thoet Damri","Thoet Thai","Thoet Rachan","Thiam Ruam Mit","Thai Raman","Thaniya","Nakhon Chai Si","Nakhon Pathom","Nakhon Ratchasima","Nakhon Lung","Nakhon Sawan","Nonsi","Naradhiwas Rajanagarindra","Naret","Nawamin","Nuan Chan","Nakkila Laem Thong","Nak Niwat","Nakkharat","Nang Linchi","Nawong Pracha Phatthana","Nikhom Makkasan","Nimit Mai","Nin Hem Niyom","Ni Chong Sawat","Borommaratchachonnani","Banthat Thong","Paribatra","Bowon Niwet","Bang Kradi","Bang Khun Thian","Bang Khun Non","Bang Khae","Bang Chueak Nang","Bang Bon 1","Bang Bon 2","Bang Bon 3","Bang Bon 4","Bang Bon 5","Bang Bon Sai Doem","Bang Phai","Bang Phrom","Bang Ramat","Bang Waek","Ban Mo","Bamrung Mueang","Bueng Khwang","Bun Siri","Buri Phirom","Buranasat","Burapha","Baen Chado","Pracha Chuen","Prachathon","Prajadhipok","Prachathipatai","Pracha Phatthana","Pracha Ruam Chai","Pracha Rat Sai 1","Pracha Rat Sai 2","Pracha Rat Bamphen","Pracha Songkhro","Pracha Samran","Pracha Suk","Pracha Uthit","Pracha Uthit","Pracha Uthit","Pracha Uthit","Pradiphat","Pradit Manutham","Pramuan","Pan","Pak Nam Krachom Thong","Pak Nam Fang Nuea","Plaeng Nam","Phadung Dao","Phadung Phan","Phaya Thai","Phaya Mai","Phrom Rat","Phra Chan","Phra Phithak","Phra Phiphit","Phraya Suren","Rama IX","Rama I","Rama II","Rama III","Rama IV","Rama V","Rama VI","Phra Sumen","Phra Athit","Phran Nok","Phlapphla Chai","Phuang Siri","Phahon Yothin","Phaniang","Phat Phong","Phatthana","Phatthanakan","Phatthana Chonnabot","Phatthana Chonnabot 2","Phatthana Chonnabot 3","Phatthana Chonnabot 4","Phanitchayakan Thon Buri","Phat Sai","Phahurat","Phichai","Phibun Songkhram","Phitsanulok","Phiraphong","Phuttha Bucha","Phutthamonthon Sai 1","Phutthamonthon Sai 2","Phutthamonthon Sai 3","Phet Kasem","Phetchaburi","Phet Phra Ram","Phet Uthai","Phloen Chit","Pho Phanit","Phoem Sin","Phraeng Nara","Phraeng Phuthon","Phraeng Sanphasat","Pho Kaeo","Fueang Nakhon","Phanu Rangsi","Phuchong","Phokhi","Mahannop","Maha Chak","Maha Chai","Maha Nakhon","Maha Phruettharam","Maha Rat","Maha Set","Mahesak","Mahaisawan","Motorway","Mangkon","Ma Charoen","Mittraphan","Mit Maitri","Mit Maitri","Mit Maitri 1","Mit Maitri 2","Mit Maitri 3","Min Phatthana","Maen Thai","Maitri Chit","Maitri Chit","Yommarat Sukhum","Yang Phatthana","Yan Nawa","Yi Sip Song Karakadakhom 1","Yi Sip Song Karakadakhom 2","Yi Sip Song Karakadakhom 3","Yi Sip Song Karakadakhom 4","Yi Sip Song Karakadakhom 5","Yen Chit","Yen Akat","Yaowaphanit","Yaowarat","Yaek Suan Sayam","Yotha","Yotha 1","Yothin Phatthana","Yothi","Rom Klao","Ruam Chit","Ruam Phatthana","Rong Mueang","Ranong 1","Ranong 2","Ratchadaphisek","Ratchadaphisek","Ratchadaphisek","Ratchadaphisek","Ratchamongkhon Prasat","Rang Nam","Ratchadamnoen Klang","Ratchadamnoen Nok","Ratchadamnoen Nai","Ratchadamri","Ratchabophit","Ratchaprarop","Ratchaphruek","Ratchamontri","Ratchawong","Ratchawithi","Rachini","Ramkhamhaeng","Ramkhamhaeng 2","Ram Buttri","Rat Nimit","Rat Burana","Rat Phatthana","Rat Phatthana","Rat Ruam Chai","Rat Rat Phatthana","Rat Uthit","Rim Khlong Prapa Fang Khwa","Rim Khlong Prapa Fang Sai","Rung Pracha","Long Tha","Lasalle","Lat Krabang","Lat Pla Khao","Lat Phrao","Lat Phrao Wang Hin","Lat Ya","Lam Sai","Lamphun Chai","Lam Makhuea Khuen","Likhit","Luk Luang","Liap Khlong Noen Sai","Liap Khlong Bang Phrom","Liap Khlong Pathum","Liap Khlong Phadung Krung Kasem","Liap Khlong Bidyalongkorn","Liap Khlong Phasi Charoen Fang Tai","Liap Khlong Phasi Charoen Fang Nuea","Liap Khlong Mon","Liap Khlong Lam Ko Phai","Liap Khlong Song","Liap Khlong Sip Sam Fang Tawantok","Liap Thale Sap","Liap Wari","Wong Sawang","Worachak","Wang Chao Sai","Wang Doem","Wang Lang","Vacharaphol","Watthanatham","Wat Parinayok","Wat Welu Wanaram","Wat Suk Chai","Wat Mai Charoen Rat","Witthayu","Wibun Sathu Kit","Vibhavadi Rangsit","Wiwat Wiang","Wisut Kasat","Wutthakat","Si Thammathirat","Srinagarindra","Si Burapha","Si Wara","Si Wiang","Si Ayutthaya","Sala Daeng","Sala Thammasop","Siri Kasem","Siri Phong","Supphamit","Set Siri","Set Siri 2","Sakun Di","Satri Witthaya 2","Sanam Chai","Somdet Chao Phraya","Somdet Phra Chao Tak Sin","Somdet Phra Pinklao","Song Prapha","Saranakhom","Sanphawut","Saran Rom","Suan Phak","Suan Phlu","Suan Sayam","Suan Oi Soi Klang","Sawankhalok","Sawatdikan 1","Sawatdikan 2","Sawatdikan 3","Sawang","Sakae Ngam","Saphan Phut","Sangkhom Songkhro","Sangkhalok","Sangkha Pracha","Sangkha Santisuk","Santiphap","Sathon Tai","Sathon Nuea","Sathu Pradit","Sam Wa","Sam Sen","Sai Mai","Sarasin","Saribut","Saliratthawiphak","Sip Sam Hang","Sirindhorn","Si Phraya","Si Lom","Sihaburanukit","Suk Sawat","Sukhaphiban 2","Sukhaphiban 5","Sukhaphiban Bang Ramat","Sukhumvit","Sukhumvit 71","Sukhothai","Sukhonthasawat","Sukhantharam","Sut Prasoet","Sutthawat","Sutthisan Winitchai","Sunthon Kosa","Suphan","Surawong","Surasak","Suwinthawong","Surao Khlong Nueng","Sena Nikhom 1","Seri Thai","Sueapa","Saen Kasem","Samae Dam","Hathai Mit","Hathai Rat","Nong Rahaeng","Na Phra That","Na Phra Lan","Na Happhoei","Mom Chao Sanga Ngam Supradit","Mu Ban Setthakit","Luang","Luang Phrotphitthayaphayat","Luang Phaeng","Lak Mueang","Lang Suan","Lan Luang","Ho Wang","Hua Mak","Anantanak","Anamai Ngam Charoen","Anu Wong","Yu Yen","Yu Witthaya","Arun Ammarin","Asok Montri","On Nut","Henri Dunant","Atsawa Phichet","Atsadang","Assumption","At Narong","Amnuai Songkhram","Intharaphithak","Inthrawat","Itsaraphap","Unakan","Udom Suk","Utthayan","U Thong Nok","U Thong Nai","Ekkachai","Phansa Maha Rachini" 
    };
    private static String district[] = {
        "Phra Nakhon","Bang Bon","Bang Kapi","Bang Khae","Bang Khen","Bang Kho Laem","Bang Khun Thian","Bang Na","Bang Phlat","Bang Rak","Bang Sue","Bangkok Noi","Bangkok Yai","Bueng Kum","Chatuchak","Chom Thong","Din Daeng","Don Mueang","Dusit","Huai Khwang","Khan Na Yao","Khlong Sam Wa","Khlong San","Khlong Toei","Lak Si","Lat Krabang","Lat Phrao","Min Buri","Nong Chok","Nong Khaem","Pathum Wan","Phasi Charoen","Phaya Thai","Phra Khanong","Pom Prap Sattru Phai","Prawet","Rat Burana","Ratchathewi","Sai Mai","Samphanthawong","Saphan Sung","Sathon","Suan Luang","Taling Chan","Thawi Watthana","Thon Buri","Thung Khru","Wang Thonglang","Vadhana","Yan Nawa" 
    };
    private static String province = "Bangkok";
    private static int zipCode[] = {
        10110,10120,10170,10100,10100,10120,10140,10140,10150,10150,10160,10160,10160,10170,10200,10210,10220,10220,10230,10230,10240,10240,10250,10250,10260,10300,10310,10320,10330,1400,10500,10510,10510,10520,10530,10600,10600,10600,10700,10700,10800,10240,10260,10400
    };
    
    private static int SOI_ITERATOR = (int) (Math.random() * soi.length);
    private static int ROAD_ITERATOR = (int) (Math.random() * road.length);
    private static int DISTRICT_ITERATOR = (int) (Math.random() * district.length);
    private static int ZIP_ITERATOR = (int) (Math.random() * zipCode.length);
    
    public  static String getNo(){
        return ((int)(Math.random()*999)+1)+"";
    }
    public static String getSoi(){
        SOI_ITERATOR = (SOI_ITERATOR + 1) % soi.length;
        return soi[SOI_ITERATOR];
    }
    public static String getRoad(){
        ROAD_ITERATOR = (ROAD_ITERATOR + 1) % road.length;
        return road[ROAD_ITERATOR]+" Rd.";
    }
    public static String getDistrict(){
        DISTRICT_ITERATOR = (DISTRICT_ITERATOR + 1) % district.length;
        return district[DISTRICT_ITERATOR];
    }
    public static int getZipCode(){
        ZIP_ITERATOR = (ZIP_ITERATOR + 1) % zipCode.length;
        return zipCode[ZIP_ITERATOR];
    }
    public static  String getProvince(){
        return province;
    }
    public String toString(){
        return getNo()+" "+getSoi()+" "+getRoad()+", "+getDistrict()+", "+getProvince()+" "+getZipCode();
    }
}
