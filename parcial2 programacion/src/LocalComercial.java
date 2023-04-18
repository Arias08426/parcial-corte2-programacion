
    public class LocalComercial {
        public Integer Id;
        private String businessPremisesName;
        private String businessPremisesAdress;
        private String City;

        public LocalComercial(Integer id, String businessPremisesName, String businessPremisesAdress, String city) {
            Id = id;
            this.businessPremisesName = businessPremisesName;
            this.businessPremisesAdress = businessPremisesAdress;
            this.City = City;
        }

        public Integer getId() {
            return Id;
        }

        public void setId(Integer id) {
            Id = id;
        }

        public String getBusinessPremisesName() {
            return businessPremisesName;
        }

        public void setBusinessPremisesName(String businessPremisesName) {
            this.businessPremisesName = businessPremisesName;
        }

        public String getBusinessPremisesAdress() {
            return businessPremisesAdress;
        }

        public void setBusinessPremisesAdress(String businessPremisesAdress) {
            this.businessPremisesAdress = businessPremisesAdress;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String City) {
            this.City = City;
        }

        @Override
        public String toString() {
            return "Local ->" +
                    "Id= " + Id +
                    ", Bussiness Premises Name= " + businessPremisesName + '\'' +
                    ", Business Premises Adress= " + businessPremisesAdress + '\'' +
                    ", Business Premise City= " + City ;
        }


    }

