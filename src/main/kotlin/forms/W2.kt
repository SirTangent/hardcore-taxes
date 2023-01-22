package forms

import fields.EntityAddress
import fields.Field
import java.math.BigDecimal

class W2(taxYear: Int) : Form(taxYear) {
    // TODO: Move field names into resource file
    var controlNumber: Field<String> = Field("Control number", "", "d")
    var dept: Field<String> = Field("Dept.", "", "d")
    var corp: Field<String> = Field("Corp", "", "d")
    var empUseField: Field<String> = Field("Employer use only", "", "d")

    var addressEmployer: Field<EntityAddress> = Field("Employer's name, address, and ZIP code", EntityAddress(), "c")
    var addressEmployee: Field<EntityAddress> = Field("Employee's name, address, and ZIP code", EntityAddress(), "e/f")

    var employerFedID: Field<String> = Field("Employer's FED ID number", "", "b")
    var employerSSA: Field<String> = Field("Employee's SSA number", "", "b") // TODO: Create encrypted field class for sensitive data
    var wages: Field<BigDecimal> = Field("Wages, tips, other comp.", BigDecimal(0.0), "1")
    var fedWithheld: Field<BigDecimal> = Field("Federal income tax withheld", BigDecimal(0.0), "2")
    var socialSecurityWages: Field<BigDecimal> = Field("Social security wages", BigDecimal(0.0), "3")
    var socialSecurityWithheld: Field<BigDecimal> = Field("Social security tax withheld", BigDecimal(0.0), "4")
    var medicareWages: Field<BigDecimal> = Field("Medicare wages and tips", BigDecimal(0.0), "5")
    var medicareWithheld: Field<BigDecimal> = Field("Medicare tax withheld", BigDecimal(0.0), "6")
    var socialSecurityTips: Field<BigDecimal> = Field("Social security tips", BigDecimal(0.0), "7")
    var allocatedTips: Field<BigDecimal> = Field("Allocated tips", BigDecimal(0.0), "8")

    // TODO: Add box 12
    var dependentCareBenefits: Field<BigDecimal> = Field("Dependent care benefits", BigDecimal(0.0), "10")
    var nonqualifiedPlans: Field<BigDecimal> = Field("Nonqualified plans", BigDecimal(0.0), "11")
    var other: Field<BigDecimal> = Field("Other", BigDecimal(0.0), "14")
    var state: Field<String> = Field("State", "", "15")
    var employerStateID: Field<String> = Field("Employer's state ID no.", "", "15")
    var stateWages: Field<BigDecimal> = Field("State wages, tips, etc.", BigDecimal(0.0), "16")
    var stateIncomeTax: Field<BigDecimal> = Field("State income tax", BigDecimal(0.0), "17")
    var localWages: Field<BigDecimal> = Field("State income tax", BigDecimal(0.0), "18")
    var localIncomeTax: Field<BigDecimal> = Field("State income tax", BigDecimal(0.0), "19")
    var locality: Field<String> = Field("Locality name", "", "20")
}