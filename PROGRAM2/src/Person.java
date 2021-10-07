public class Person {

    private String name;
    private String birthday;
    private String depatment;
    private String major;
    private int age;
    private int height;
    private int weight;
    private int distance;
    private int time;


    public static void main(String args[]) {
        Person hasil = new Person();
        hasil.setName("Udean Roundop");
        hasil.setBirthday("30 Februari 2077");
        hasil.setDepatment("Keuangan");
        hasil.setMajor("Teknik Sipil");
        hasil.setAge(20);
        hasil.setHeight(166);
        hasil.setWeight(100);
        hasil.setDistance(8);
        hasil.setTime(80);
        System.out.println("Nama: "+ hasil.getName()); 
        System.out.println("Tanggal Lahir:"+ hasil.getBirthday());
        System.out.println("Bidang: "+ hasil.getDepatment()); 
        System.out.println("Jurusan: "+hasil.getMajor());
        System.out.println("Umur: "+hasil.getAge()+ " Tahun");
        System.out.println("Tinggi: "+hasil.getHeight() + "Cm");
        System.out.println("Berat: "+hasil.getWeight()+ "Kg");
        System.out.println("Jarak: "+hasil.getDistance()+ " Km");
        System.out.println("Waktu: "+hasil.getTime() + " Menit");
    
    }
    public String getName() {
        return name;
      }
    public void setName(String name) {
        this.name = name;
      }
   public String getBirthday(){
       return birthday;
   }
   public void setBirthday(String birthday){
       this.birthday = birthday;
   }
   public String getMajor(){
    return major;
}
public void setMajor(String major){
    this.major = major;
}
public String getDepatment() {
    return depatment;
}
public void setDepatment(String depatment) {
    this.depatment = depatment;
}
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getTime() {
        int time = 8%80 ;
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
      
    



    
}
