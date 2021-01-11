package employeeconnect.employee.model;
    public class Employee {
        private String employeeid;
        private String phoneNumber;
        private String emailID;
        private String firstName;
        private String lastName;

        public Employee(String employeeid, String phoneNumber, String emailID, String firstName, String lastName) {
            this.employeeid = employeeid;
            this.phoneNumber = phoneNumber;
            this.emailID = emailID;
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public String getEmployeeid() {
            return this.employeeid;
        }

        public void setEmployeeid(String employeeid) {
            this.employeeid = employeeid;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailid() {
            return emailID;
        }

        public void setEmailid(String emailid) {
            this.emailID = emailid;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastname() {
            return lastName;
        }

        public void setLastname(String lastname) {
            this.lastName = lastName;
        }


        public String toString() {
            return "Employee[EMPLOYEEID= " + employeeid + ", PHONENUMBER= " + phoneNumber + " EMAILID = " + emailID + " FIRSTNAME " + firstName + " LASTNAME " + lastName + "]";
        }
    }