<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;600&display=swap"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="payroll_form_style.css" />
    <link rel="icon" sizes="180x180" href="/CURD_Operation_EmpPayrollapp/assets/icons/69816206.jpg">
    <title>Employee Payroll Form</title>
    <script defer src="payroll_form_script.js"></script>
  </head>

  <body>
    <header class="headerContainer header">
      <div class="logoContainer">
        <img src="IMAGES/logo.jpg" alt="" />
        <div>
          <span class="emp-text">EMPLOYEE</span><br />
          <span class="emp-text emp-payroll">PAYROLL</span>
        </div>
      </div>
    </header>
    <div class="form-content">
      <form class="form" action="#" onsubmit="save()" onreset="resetForm()">
        <div class="form-head">Employee Payroll form</div>
        <div class="row-content">
          <label class="label text" for="name">Name</label>
          <input
            class="input"
            type="text"
            id="name"
            name="name"
            placeholder="Your name.."
            required
          />
          <valid-message class="valid-name" for="name"></valid-message>
          <error-output class="name-error" for="name"></error-output>
        </div>
        <div class="row-content">
          <label class="label text" for="profile">Profile Image</label>
          <div class="profile-radio-content">
            <label>
              <input
                type="radio"
                id="profile1"
                name="profile"
                value="IMAGES/Ellipse -3.png"
                required
              />
              <img
                class="profile"
                id="image1"
                src="IMAGES/Ellipse -3.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile2"
                name="profile"
                value="IMAGES/Ellipse -4.png"
                required
              />
              <img
                class="profile"
                id="image2"
                src="IMAGES/Ellipse -4.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile3"
                name="profile"
                value="IMAGES/Ellipse -5.png"
                required
              />
              <img
                class="profile"
                id="image3"
                src="IMAGES/Ellipse -5.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile4"
                name="profile"
                value="IMAGES/Ellipse -7.png"
                required
              />
              <img
                class="profile"
                id="image4"
                src="IMAGES/Ellipse -7.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile5"
                name="profile"
                value="IMAGES/Ellipse -2.png"
                required
              />
              <img
                class="profile"
                id="image5"
                src="IMAGES/Ellipse -2.png"
              />
            </label>
            <label>
              <input
                type="radio"
                id="profile6"
                name="profile"
                value="IMAGES/Ellipse -1.png"
                required
              />
              <img
                class="profile"
                id="image6"
                src="IMAGES/Ellipse -1.png"
              />
            </label>
          </div>
        </div>
        <div class="row-content">
          <label class="label text" for="gender">Gender</label>
          <div>
            <label>
              <input
                type="radio"
                id="male"
                name="gender"
                value="male"
                required
              />
              <label class="text" for="male">Male</label>
            </label>
            <label>
              <input
                type="radio"
                id="female"
                name="gender"
                value="female"
                required
              />
              <label class="text" for="female">Female</label>
            </label>
          </div>
        </div>
        <div class="row-content">
          <label class="label text" for="department">Department</label>
          <div>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="hr"
                name="department"
                value="HR"
              />
              <label class="text" for="hr">HR</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="sales"
                name="department"
                value="Sales"
              />
              <label class="text" for="sales">Sales</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="finance"
                name="department"
                value="Finance"
              />
              <label class="text" for="finance">Finance</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="engineer"
                name="department"
                value="Engineer"
              />
              <label class="text" for="engineer">Engineer</label>
            </label>
            <label>
              <input
                class="checkbox"
                type="checkbox"
                id="others"
                name="department"
                value="Others"
              />
              <label class="text" for="others">Others</label>
            </label>
          </div>
        </div>
        <div class="row-content">
          <label class="label text" for="salary">Choose your Salary: </label>
          <input
            class="input"
            type="range"
            name="salary"
            id="salary"
            min="300000"
            max="500000"
            step="100"
            value="400000"
          />
          <output class="salary-output text" for="salary">400000</output>
        </div>
        <div class="row-content">
          <label class="label text" for="startDate">Start Date</label>
          <div name="startdate" id="startDate">
            <select id="day" name="Day">
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              <option value="11">11</option>
              <option value="12">12</option>
              <option value="13">13</option>
              <option value="14">14</option>
              <option value="15">15</option>
              <option value="16">16</option>
              <option value="17">17</option>
              <option value="18">18</option>
              <option value="19">19</option>
              <option value="20">20</option>
              <option value="21">21</option>
              <option value="22">22</option>
              <option value="23">23</option>
              <option value="24">24</option>
              <option value="25">25</option>
              <option value="26">26</option>
              <option value="27">27</option>
              <option value="28">28</option>
              <option value="29">29</option>
              <option value="30">30</option>
              <option value="31">31</option>
            </select>
            <select id="month" name="Month">
              <option value="Jan">January</option>
              <option value="Feb">February</option>
              <option value="Mar">March</option>
              <option value="Apr">April</option>
              <option value="May">May</option>
              <option value="June">June</option>
              <option value="July">July</option>
              <option value="Aug">August</option>
              <option value="Sep">September</option>
              <option value="Oct">October</option>
              <option value="Nov">November</option>
              <option value="Dec">December</option>
            </select>
            <select id="year" name="Year">
              <option value="2020">2020</option>
              <option value="2019">2019</option>
              <option value="2018">2018</option>
              <option value="2017">2017</option>
              <option value="2016">2016</option>
            </select>
          </div>
          <valid-message
            class="valid-startDate"
            for="startDate"
          ></valid-message>
          <error-output class="startDate-error" for="startDate"></error-output>
        </div>
        <div class="row-content">
          <label class="label text" for="notes">Notes</label>
          <textarea
            class="input"
            id="notes"
            name="Notes"
            placeholder="Write a note..."
            style="height: 100px"
          ></textarea>
        </div>
        <div class="buttonParent">
          <a href="home.html" class="resetButton button cancelButton"
            >Home</a
          >
          <div class="submit-reset">
            <button class="button submitButton" type="submit" id="submitButton">
              Submit
            </button>
            <button class="resetButton button" type="reset">Reset</button>
          </div>
        </div>
      </form>
    </div>
  </body>
</html>
