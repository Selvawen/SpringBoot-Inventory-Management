## WESTERN GOVERNORS UNIVERSITY 
## D287 JAVA FRAMEWORKS: Read Me
**Scenario**: You are working for a company that licenses and customizes a software application to keep track of inventory in stores. Your job as a software developer is to customize this application to meet a specific customer’s needs. 

## TRACKED CHANGES
**C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

_filename: mainscreen.html_

lines 14-72 ADDED for CSS styling of page (background color, etc.)
```
   <!-- Custom CSS -->
    <style>
        .header-image {
            display: block;
            margin-left: auto;
            margin-right: auto;
            width: 100%;
        }

        body {
            margin: 0;
            padding: 0;
            color: #ffffff;
            background-color: #00bcd4;
            font-family: "Gill Sans", Helvetica, Arial, sans-serif;
            font-size: 1em;
            line-height: 1.2;
        }

        h1, h2 {
            color: #00bcd4;
        }

        .container {
            margin: 0 auto;
            max-width: 60em;
            background: #212529;
            padding: 20px;
            border-radius: 10px;
        }

        .footer-primary {
            background-color: #333;
            color: #00bcd4;
            padding: 20px;
            text-align: center;
            border-top: 2px solid #00bcd4;
        }

        .btn-info {
            background-color: #00bcd4;
            border-color: #00bcd4;
        }

        .btn-info:hover {
            background-color: #0097a7;
            border-color: #0097a7;
        }

        .btn-primary {
            background-color: #00bcd4;
            border-color: #00bcd4;
        }

        .btn-primary:hover {
            background-color: #0097a7;
            border-color: #0097a7;
        }
    </style>
```

line 74: changed shop name to Techie's Treasures 

```
 <title>Techie's Treasures</title>

```

line 80: added a header image to the page

```
 <img src="/images/header_img.jpg" alt="Tech Gadgets Header Image" class="header-image">
    <h1 class="mt-4">Techie's Treasures</h1>
    <hr>
    <div class="  mb-3">
        <a href="/about" class="btn btn-info">About Techie's Treasures</a>
    </div>
```

line 81: changed display header to "Techie's Treasures" 

line 87: changed header for "Parts" to "Individual Gadgets" 

line 123: changed header for "Products" to "Gadget Bundles" 

lines 162-164: ADDED footer to page with business name & copyright date

```
<footer class="footer-primary">
    Copyright &copy; Techie's Treasures, 2024
</footer>


```

*******************

**D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers 
and include navigation to and from the “About” page and the main screen.**

_filename: mainscreen.html_

line 84: added a Button linked to the About Me page, just below page title

```
<a href="/about" class="btn btn-info">About Techie's Treasures</a>
```

_filename: MainScreenController.java_

lines 56-57: added controller @GetMapping to enable access to About page.
```
@GetMapping("/about")
public String about() { return "about.html"; }
```

_filename: about.html_

lines 1 - 110: added new About.html page with HTML layout and styling copied from mainscreen's styling.

```
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">

  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

  <!-- CSS Styling -->
  <style>
    .header-image {
      display: block;
      margin-left: auto;
      margin-right: auto;
      width: 100%;
    }

    body {
      margin: 0;
      padding: 0;
      color: #ffffff;
      background-color: #00bcd4;
      font-family: "Gill Sans", Helvetica, Arial, sans-serif;
      font-size: 1em;
      line-height: 1.2;
    }

    h1, h2 {
      color: #00bcd4;
    }

    .container {
      margin: 0 auto;
      max-width: 60em;
      background: #1e1e1e;
      padding: 20px;
      border-radius: 10px;
    }

    .footer-primary {
      background-color: #333;
      color: #00bcd4;
      padding: 20px;
      text-align: center;
      border-top: 2px solid #00bcd4;
    }

    .btn-info {
      background-color: #00bcd4;
      border-color: #00bcd4;
    }

    .btn-info:hover {
      background-color: #0097a7;
      border-color: #0097a7;
    }

    .btn-primary {
      background-color: #00bcd4;
      border-color: #00bcd4;
    }

    .btn-primary:hover {
      background-color: #0097a7;
      border-color: #0097a7;
    }
  </style>

  <title>About Techie's Treasures</title>
</head>

<body>

<div class="container">
  <img src="/images/about_head.jpg" alt="Tech Gadgets Header Image" class="header-image">

  <h1  class=" mt-4">About Techie's Treasures</h1>
  <div class="  mb-3">
    <a href="/mainscreen" class="btn btn-info">Go Back Home</a>
  </div>

  <hr>
  <h2  class=" mt-4">Our Story</h2>
  <p>Techie's Treasures was founded in 2023 to meet the growing demand for high-quality tech gadgets.
    Our mission is to provide the latest and greatest technology products to tech enthusiasts everywhere.
    We believe in combining innovation and quality to bring you the best gadgets for your needs.
  </p>
  <hr>
  <h2  class=" mt-4">Our Products</h2>
  <p>At Techie's Treasures, we offer a wide range of tech products including the latest smartphones,
    high-performance laptops, advanced tablets, cutting-edge smartwatches, and immersive VR headsets.
    Each product is carefully selected to ensure it meets our high standards of quality and performance.
  </p>
  <hr>
</div>

<footer class="footer-primary">
  Copyright &copy; Techie's Treasures, 2024
</footer>

<!-- Bootstrap JS Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka0uB0YfqQsybG8aa9+9Wz2KhtPY7lC4Q9vp8gz7S/1c6rI09mO5f4/6pfsTLySl" crossorigin="anonymous"></script>

</body>
</html>


```

***********************

**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts 
and five products in your sample inventory and should not overwrite existing data in the database.**

_filename: BootStrapData.java_

clear existing data to prevent duplicates

lines 39-41 - clear existing data to prevent duplicates

```
inhousePartRepository.deleteAll();
outsourcedPartRepository.deleteAll();
productRepository.deleteAll();
```

added code to public BootStrapData class to fill in part repository



lines 21-34 - insertion of new repo for inhouse parts
```
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, **InhousePartRepository inhousePartRepository,** OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

```
lines 36-118 - added 8 new parts to the repository: 5 in-house and 3 outsourced parts

```
 @Override
    public void run(String... args) throws Exception {
        // Clear existing data to prevent duplicates
        inhousePartRepository.deleteAll();
        outsourcedPartRepository.deleteAll();
        productRepository.deleteAll();

        // In-house parts
        InhousePart ip1 = new InhousePart();
        ip1.setId(901);
        ip1.setName("Smartphone Screen");
        ip1.setPrice(5.00);
        ip1.setInv(10);
        ip1.setMinInv(1);
        ip1.setMaxInv(100);
        inhousePartRepository.save(ip1);

        InhousePart ip2 = new InhousePart();
        ip2.setId(905);
        ip2.setName("Laptop Battery");
        ip2.setPrice(3.00);
        ip2.setInv(20);
        ip2.setMinInv(1);
        ip2.setMaxInv(100);
        inhousePartRepository.save(ip2);

        InhousePart ip3 = new InhousePart();
        ip3.setId(903);
        ip3.setName("Tablet Camera");
        ip3.setPrice(49.99);
        ip3.setInv(40);
        ip3.setMinInv(1);
        ip3.setMaxInv(100);
        inhousePartRepository.save(ip3);

        InhousePart ip4 = new InhousePart();
        ip4.setId(904);
        ip4.setName("Smartwatch Strap");
        ip4.setPrice(19.99);
        ip4.setInv(100);
        ip4.setMinInv(1);
        ip4.setMaxInv(200);
        inhousePartRepository.save(ip4);

        InhousePart ip5 = new InhousePart();
        ip5.setId(905);
        ip5.setName("VR Headset Lens");
        ip5.setPrice(29.99);
        ip5.setInv(20);
        ip5.setMinInv(1);
        ip5.setMaxInv(50);
        inhousePartRepository.save(ip5);

        // Outsourced parts
        OutsourcedPart op1 = new OutsourcedPart();
        op1.setCompanyName("Tech Supplies Co.");
        op1.setName("Wireless Charger");
        op1.setInv(10);
        op1.setPrice(10.00);
        op1.setId(700);
        op1.setMinInv(1);
        op1.setMaxInv(100);
        outsourcedPartRepository.save(op1);

        OutsourcedPart op2 = new OutsourcedPart();
        op2.setCompanyName("Gadget Pros Inc.");
        op2.setName("Bluetooth Speaker");
        op2.setInv(50);
        op2.setPrice(4.00);
        op2.setId(705);
        op2.setMinInv(1);
        op2.setMaxInv(100);
        outsourcedPartRepository.save(op2);

        OutsourcedPart op5 = new OutsourcedPart();
        op5.setCompanyName("Wearable Tech");
        op5.setName("Fitness Tracker");
        op5.setInv(50);
        op5.setPrice(3.00);
        op5.setId(710);
        op5.setMinInv(1);
        op5.setMaxInv(100);
        outsourcedPartRepository.save(op5);

```
lines 121-139:  added 5 new products to product repository

```
        Product tech_bundle1 = new Product("Smartphone Bundle", 10.00, 5);
        Product tech_bundle2 = new Product("Laptop Essentials", 25.00, 8);
        Product tech_bundle3 = new Product("Tablet Package", 50.00, 6);
        Product tech_bundle4 = new Product("Smartwatch Set", 45.00, 4);
        Product tech_bundle5 = new Product("VR Experience", 50.00, 7);

        productRepository.save(tech_bundle1);
        productRepository.save(tech_bundle2);
        productRepository.save(tech_bundle3);
        productRepository.save(tech_bundle4);
        productRepository.save(tech_bundle5);

```

*****************************
**F.  Add a “Buy Now” button to your product list.** 

_filename: mainscreen.html_

Line 155: added this line to create Buy Now button next to Product Add/Delete interface 

```
<a th:href="@{/buyProduct(productID=${tempProduct.id})}" class="btn btn-success btn-sm mb-3">Buy Now</a>
         
```

**3 NEW FILES CREATED**

NEW _filename: BuyProductController.java_

lines 1-44: new Controller for "Buy Product" button on mainscreen.html:
  
This code creates a **buyProduct** method to check whether the buyer's selection is currently in stock.
    if in stock, will return confirmation page that purchase was successful (confirmbuysuccessful.html)
    If out of stock or other error, return an error page so the customer knows (confirmbuyfailure.html)

```
package com.example.springboot.controllers;

import com.example.springboot.domain.Part;
import com.example.springboot.domain.Product;
import com.example.springboot.repositories.ProductRepository;
import com.example.springboot.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyProductController {
@Autowired
private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        Optional<Product> productToBuy = productRepository.findById(theId);

        if (productToBuy.isPresent()) {    //check if product in catalog
            Product product = productToBuy.get();

            if (product.getInv() > 0) {    //check if product still in stock
                product.setInv(product.getInv() - 1);   //decrement stock
                productRepository.save(product);    //save to product database

                return "/confirmbuysuccess";   //successful purchase
            } else {
                return "/confirmbuyfailure";   //purchase failed: out of stock
            }
        } else {
            return "/confirmbuyfailure";  //purchase failed: product not found
        }
    }
}
```

NEW _filename: confirmbuysuccess.html_ [in Templates folder]

lines 1-13: new code which displays "Your purchase was successful" and thanks in response to successful purchase of product.

```
<!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Purchase Successful</title>
    </head>
    <body>
        <h1>Your purchase was successful. We hope you enjoy your treats! Thanks for shopping with us!</h1>
        
        //<a href="http://localhost:8080/">Link
        to Main Screen</a>
    </body>
    </html>
```

NEW _filename: confirmbuyfailure.html_ [in Templates folder]

lines 1-13: new code which displays "Your purchase did not succeed. Product may be out of stock. Please try again or contact us for assistance."

```
<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Failure to complete purchase</title>
        </head>
        <body>
            <h1>Your purchase did not succeed. Product may be out of stock. Please try again or contact us for assistance.</h1>
            
            <a href="http://localhost:8080/">Link
            to Main Screen</a>
        </body>
    </html>
```

*******************

**G.  Modify the parts to track maximum and minimum inventory**:

**•  Add additional fields to the part entity for maximum and minimum inventory.**

MODIFIED _filename: Part.java_

lines 39-43: inserted 2 new variables (minInv, maxInv) using @Min annotation for minInv and maxInv

```
    @Min(value = 0, message = "Minimum inventory value must be positive")
    int minInv;
    
    @Min(value = 0, message = "Maximum inventory must be positive")
    @Max(value = 100, message = "Maximum inventory value must fall within set maximum")
    int maxInv;

```

lines 57-58 and 66-67: added a default minimum inventory and max inventory values (0,100) to both default contructors

```
public Part(String name, double price, int inv) {
    this.name = name;
    this.price = price;
    this.inv = inv;
    this.minInv = 0; //default minimum inventory = 0;
    this.maxInv = 100; //default minimum inventory = 100;
}
```

lines 110-122: created 4 new getter and setter methods to get and set both minInv and maxInv

```
    public int getMinInv() { return minInv; }

    public void setMinInv(int minInv) { this.minInv = minInv }

    public int getMaxInv() { return maxInv; }

    public void setMaxInv(int maxInv) { this.maxInv = maxInv; }

```

_filename: InhousePart.java_

lines 18-19: added values for min & max inventory to make sure a default is set

```
    public InhousePart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

_filename: OutsourcedPart.java_

lines 18-19: added values for min & max inventory to make sure a default is set

```
    public OutsourcedPart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

**Additional Optional Change**

_filename: mainscreen.html_

lines 99-106: added table headers for Minimum Inventory and Maximum Inventory to display these in the table

```
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Inventory</th>
            <th>Min Inv</th>
            <th>Max Inv</th>
            <th>Action</th>
        </tr>
```

Lines 113-114: added table rows (td) for min inv and max inv

```
        <td th:text="${tempPart.minInv}">1</td>
        <td th:text="${tempPart.maxInv}">1</td>
```

**•  Modify the sample inventory to include the maximum and minimum fields.**

_filename: BootStrapData.java_

Added this code to EACH of the 5 products (see full quoted code above for confirmation)

on lines 49-50, 58-59, 67-68, 96-97, 106-107, 116-117, where [*] = the variable for that part:
```
    [*].setMinInv(1);
    [*].setMaxInv(100);
```


**•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs**

_filename: InhousePartForm.html_

lines 26-30: added 2 fields for entering minimum & maximum inventory thresholds to this form

```
    <p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Inventory Error</p>
    
    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Inventory Error</p>

```

_filename: OutsourcedPartForm.html_

lines 28-32: added 2 entry fields to this web form to enable user to enter min & max inventory limits

```
    <p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Inventory Error</p>
    
    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Inventory Error</p>

```

**•  Rename the file the persistent storage is saved to.**

MODIFY _filename: application.properties_

changed the location of the persistent database file to "techies-treasures-db"

```
spring.datasource.url=jdbc:h2:file:~/techies-treasures-db
```


**•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.**

Made changes to the following files to validate numbers entered for min / max inventory:

_filename: Part.java_

ADD lines 137-143: created **validateLimits()** method for Part class 

This new method ensures that no inventory value can fall below or rise above the set minimum/maximum values.

Further validators will be added in part H.

```
    public void validateLimits() {
        if (this.inv < this.minInv) {
            throw new RuntimeException("This value falls below required minimum.");
        } 
        else if (this.inv > this.maxInv) {
            throw new RuntimeException("This value exceeds the allowed maximum.");
        }
    }
```

_filename: PartServiceImpl.java

ADD line 59: call validateLimits method as part of the save method

```
    @Override
    public void save(InhousePart thePart) {
        thePart.validateLimits();
        partRepository.save(thePart);
    }
```

_filename: InhousePartServiceImpl.java_

ADD line 54: call validateLimits method as part of the save method

```
    @Override
    public void save(InhousePart thePart) {
        thePart.validateLimits();
        partRepository.save(thePart);
    }
```

_filename: OutsourcedPartServiceImpl.java_

ADD line 52: call validateLimits method as part of the save method

```
    @Override
    public void save(OutsourcedPart thePart) {
        **thePart.validateLimits();**
        partRepository.save(thePart);
    }
```

*****************************

**H.  Add validation between or at the maximum and minimum fields.**

**•  Display error messages for low inventory when adding and updating PARTS if the inventory is less than the minimum number of parts.**

**•  Display error messages for low inventory when adding and updating PRODUCTS lowers the part inventory below the minimum.**

New Validator for Minimum inventory: 

added custom error message for minimum inventory when updating parts which are used in products.
"Part count falls below set minimum"

2 NEW files:
_filename: ValidMinimum.java_ lines 1-23

```
package com.example.springboot.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

 
@Constraint(validatedBy = {MinimumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinimum {
    String message() default "Part count falls below set minimum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

```
_filename: MinimumValidator.java_   lines 1-31

```
package com.example.springboot.validators;

import com.example.springboot.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

 
public class MinimumValidator implements ConstraintValidator<ValidMinimum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinInv();
    }

}

```
MODIFING domain model class files to apply minimum validator

_filename: Part.java_   line 24

```
import.com.example.springboot.validators.ValidMinimum;
...
line 25: @ValidMinimum
```

Edited vaidator for Products, _EnufPartsValidator_ to enforce minimum inventory:

MODIFY _filename: EnufPartsValidator.java_  (lines 35-39)

Edited to add validation logic to the isValid method to check for minimum inventory:

- added new logic to check for min value of remaining Parts when decrementing Product inventory for a purchase
- Added new error messages using ConstraintValidatorContext to provide custom error messages within **isValid** method
  "Insufficient inventory for part: [part name]"

```
public class EnufPartsValidator implements ConstraintValidator<ValidEnufParts, Product> {
 ...
 
    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        if (context == null) return true;
        if (context != null) myContext = context;
        ProductService repo = myContext.getBean(ProductServiceImpl.class);
        if (product.getId() != 0) {
            Product myProduct = repo.findById((int) product.getId());
            for (Part p : myProduct.getParts()) {
                if (p.getInv() < (product.getInv() - myProduct.getInv())) {
                    constraintValidatorContext.disableDefaultConstraintViolation();
                    constraintValidatorContext.buildConstraintViolationWithTemplate("Insufficient inventory for part: " + p.getName()).addConstraintViolation();
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

```

MODIFY _filename: Product.java_

Add 2 lines of code to apply validator to Product classes

line 20 + import statement
```
import com.example.springboot.validators.ValidEnufParts;
...
@ValidEnufParts

```

**•  Display error messages when adding and updating parts if the inventory is greater than the maximum.**

2 NEW files
_filename: ValidMaximum.java_ lines 1-25

```
package com.example.springboot.validators;

import com.example.springboot.validators.MaximumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

 
@Constraint(validatedBy = {MaximumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMaximum {
    String message() default "Part count is above set maximum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

```

_filename: MaximumValidator.java_ lines 1-31

```
package com.example.springboot.validators;

import com.example.springboot.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

 
public class MaximumValidator implements ConstraintValidator<ValidMaximum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMaximum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaxInv();
    }
}

```

MODIFING domain model class files to apply maximum validator

_filename: Part.java_  line 25

```
import.com.example.springboot.validators.ValidMaximum;
...
line 25: @ValidMaximum
```

Ensure Error Messages will display on part and product forms

MODIFY _filename: InhousePartForm.html_  lines 34-38
MODIFY _filename: OutsourcedPartForm.html_    lines 36-40

to display error messages within the POST section of this HTML form

```
*lines 34-38 InhousePartForm

<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>
    
    
*lines 36-40 OutsourcedPartForm

<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>

```

*******************

**I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.**

MODIFY _filename: PartTest_

added code lines 160 - 195 
to create 4 unit test for the getter and setter methods for Minimum & Maximum inventory within the Part class

```
   @Test
    void getMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void setMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void getMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }

    @Test
    void setMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }

```
*******************

**J.  Remove the class files for any unused validators in order to clean your code.**

DELETED unused validator: 

_filename: DeletePartValidator.java_

_filename: ValidDeletePart.java_#   T e c h i e - s - T r e a s u r e s  
 